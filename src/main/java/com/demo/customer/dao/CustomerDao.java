/* 
 * Created by 2019年1月13日
 */
package com.demo.customer.dao;

import java.util.Collection;

import com.demo.customer.entity.Customer;

/**
 * The dao of customer
 * @author fangang
 */
public interface CustomerDao {
	/**
	 * insert a customer
	 * @param customer
	 */
	public void insert(Customer customer);
	/**
	 * update a customer
	 * @param customer
	 */
	public void update(Customer customer);
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
	public Collection<Customer> list();
}
