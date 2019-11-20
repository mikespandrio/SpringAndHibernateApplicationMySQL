package com.mikespandrio.springdemo.dao;

import java.util.List;

import com.mikespandrio.springdemo.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();
	public Customer getCustomer(int id);
	public void saveCustomer(Customer customer);
	public void deleteCustomer(int id);
}
