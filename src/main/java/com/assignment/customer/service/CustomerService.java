package com.assignment.customer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assignment.customer.entity.Customer;

@Service
public interface CustomerService {

	List<Customer> getAllCustomer();

	Customer getCustomerById(Long id);

	Customer updateCustomerById(Long id, Customer customer);

	Customer saveCustomer(Customer customer);

}
