/* 
 * Created by 2019年1月13日
 */
package com.demo.customer.dao.impl;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.demo.customer.dao.CustomerDao;
import com.demo.customer.entity.Customer;

/**
 * The implement of the customer dao
 * @author fangang
 */
@Repository
public class CustomerDaoImpl implements CustomerDao {
	private CustomerFactory factory = CustomerFactory.newInstance();
	@Override
	public void insert(Customer customer) {
		factory.save(customer);
	}
	@Override
	public void update(Customer customer) {
		factory.save(customer);
	}
	@Override
	public void delete(String id) {
		factory.delete(id);
	}
	@Override
	public Collection<Customer> list() {
		return factory.list();
	}
	@Override
	public Customer get(String id) {
		return factory.get(id);
	}

}
