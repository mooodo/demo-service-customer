/* 
 * Created by 2019年1月13日
 */
package com.demo.customer.dao;

import java.util.List;

import com.demo.customer.entity.Customer;

/**
 * The dao of customer
 * @author fangang
 */
public interface CustomerDao {
	/**
	 * save a customer
	 * @param customer
	 */
	public void save(Customer customer);
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
	public List<Customer> list();
}
