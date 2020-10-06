/* 
 * Created by 2019年1月13日
 */
package com.demo.customer.service;

import java.util.Collection;

import com.demo.customer.entity.Customer;

/**
 * The service of customer
 * @author fangang
 */
public interface CustomerService {
	/**
	 * create a customer.
	 * @param customer
	 */
	public void create(Customer customer);
	/**
	 * modify a customer
	 * @param customer
	 */
	public void modify(Customer customer);
	/**
	 * delete a customer
	 * @param id
	 */
	public void delete(String id);
	/**
	 * @param id
	 * @return the customer with the id
	 */
	public Customer get(String id);
	/**
	 * @return all of the customers
	 */
	public Collection<Customer> listOfAll();
}
