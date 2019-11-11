package com.example.demo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.EmployeeSearchService;
import com.example.model.Employee;

@RefreshScope

@RestController
@RequestMapping("/api")
public class EmployeeSearchController {

	@Autowired

	EmployeeSearchService employeeSearchService;

	@RequestMapping("/employees")
	public Collection<Employee> findAll() {
		return employeeSearchService.findAll();

	}

}