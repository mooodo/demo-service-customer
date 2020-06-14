/* 
 * Created by 2019年1月13日
 */
package com.demo.customer.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.customer.dao.CustomerDao;
import com.demo.customer.entity.Customer;
import com.demo.customer.repository.CustomerRepository;

/**
 * The implement of the customer dao
 * @author fangang
 */
@Repository
public class CustomerDaoImpl implements CustomerDao {
	private CustomerRepository repository = CustomerRepository.getInstance();
	@Override
	public void save(Customer customer) {
		repository.set(customer);
	}
	@Override
	public void delete(String id) {
		repository.del(id);
	}
	@Override
	public List<Customer> list() {
		return repository.list();
	}
	@Override
	public Customer get(String id) {
		return repository.get(id);
	}

}
