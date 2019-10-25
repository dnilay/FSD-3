package com.mycompany.spring_hibernate_integration.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.spring_hibernate_integration.entity.Customer;

import lombok.AllArgsConstructor;
@Repository
@AllArgsConstructor
public class CustomerDaoImpl implements CustomerDao {
	
	private SessionFactory sessionFactory;

	@Override
	
	public Customer createCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.save(theCustomer);
		return theCustomer;
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
