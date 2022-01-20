package com.assignment.customer.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.customer.entity.Customer;
import com.assignment.customer.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/customer")
	public ResponseEntity<List<Customer>> getAllCustomer() {

		List<Customer> customerList = customerService.getAllCustomer();
		return new ResponseEntity<>(customerList, HttpStatus.OK);

	}

	@GetMapping("/customer/{customerId}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable Long customerId) {
		Customer customer = customerService.getCustomerById(customerId);

		if(customer== null) {
			return new ResponseEntity<>(customer, HttpStatus.BAD_REQUEST);
		}
		else {
			return new ResponseEntity<>(customer, HttpStatus.OK);
		}
	}
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> saveCustomer(@Validated @RequestBody Customer customer) {
		Customer result = customerService.saveCustomer(customer);
		return new ResponseEntity<>(result, HttpStatus.CREATED);
	}

	@PutMapping("/customer/{customerId}")
	public ResponseEntity<Customer> updateCustomerById(@PathVariable Long customerId, @RequestBody Customer customer) {
		Customer result = customerService.updateCustomerById(customerId, customer);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}
