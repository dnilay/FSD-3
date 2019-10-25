package com.mycompany.spring_hibernate_integration.dao;

import java.util.List;

import com.mycompany.spring_hibernate_integration.entity.Customer;

public interface CustomerDao {
	
	public Customer createCustomer(Customer theCustomer);
	public List<Customer> getAllCustomer();
	public Customer getCustomerByid(int id);

}
