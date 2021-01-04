/*
 * Created by 2021-01-04 07:57:29 
 */
package com.demo.customer.dao.impl;

import org.springframework.stereotype.Repository;

import com.demo.customer.dao.CustomerDao;
import com.demo.customer.entity.Customer;
import com.demo.support.dao.BasicRepository;

/**
 * @author fangang
 */
@Repository
public class CustomerRepository extends BasicRepository<Customer> implements CustomerDao {

	public CustomerRepository() {
		setClazz(Customer.class);
		initFactory("customer.xml");
	}
	
	@Override
	public void insert(Customer customer) {
		save(customer);
	}

	@Override
	public void update(Customer customer) {
		save(customer);
	}

}
