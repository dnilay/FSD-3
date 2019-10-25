package com.mycompany.spring_hibernate_integration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.spring_hibernate_integration.entity.Customer;
import com.mycompany.spring_hibernate_integration.service.CustomerService;

public class App 
{
    
	public static void main( String[] args )
    {
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service=context.getBean("customerService",CustomerService.class);
		Customer theCustomer=service.createCustomer(new Customer("Shane", "Warne", "shane@luv2code.com"));
		System.out.println(theCustomer);
    }
}
