package com.assignment.customer.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.assignment.customer.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	private static Map<Long, Customer> customers = new HashMap<>();
	private static Long index = 2L;

	static {
		Customer customer1 = new Customer(1L, "Swati", "Accounts");
		Customer customer2 = new Customer(2L, "John", "IT");
		customers.put(1L, customer1);
		customers.put(2L, customer2);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return new ArrayList<>(customers.values());
	}

	@Override
	public Customer getCustomerById(Long id) {
		return customers.get(id);
	}

	@Override
	public Customer saveCustomer(Customer customer) {

		index = index + 1;
		customer.setCustomerId(index);
		customers.put(index, customer);
		return customer;
	}

	@Override
	public Customer updateCustomerById(Long id, Customer customer) {

		customer.setCustomerId(id);
		customers.put(id, customer);

		return customer;
	}

}
