package com.mycompany.spring_hibernate_integration.service;

import java.util.List;

import com.mycompany.spring_hibernate_integration.entity.Customer;

public interface CustomerService {
	public Customer createCustomer(Customer theCustomer);
	public List<Customer> getAllCustomer();
	public Customer getCustomerByid(int id);

}
