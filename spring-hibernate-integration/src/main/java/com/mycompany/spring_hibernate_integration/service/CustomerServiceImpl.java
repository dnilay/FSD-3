package com.mycompany.spring_hibernate_integration.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.spring_hibernate_integration.dao.CustomerDao;
import com.mycompany.spring_hibernate_integration.entity.Customer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {
	private CustomerDao customerDao;

	@Override
	@Transactional
	public Customer createCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		return customerDao.createCustomer(theCustomer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerByid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
