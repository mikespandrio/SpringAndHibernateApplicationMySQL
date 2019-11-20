package com.mikespandrio.springdemo.service;

import java.util.List;

import com.mikespandrio.springdemo.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();
	public Customer getCustomer(int id);
	public void saveCustomer(Customer customer);
	public void deleteCustomer(int id);
}
