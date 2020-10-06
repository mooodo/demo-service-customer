/* 
 * Created by 2019年1月13日
 */
package com.demo.customer.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.customer.dao.CustomerDao;
import com.demo.customer.entity.Customer;
import com.demo.customer.exception.CustomerException;
import com.demo.customer.service.CustomerService;

/**
 * The implement of the customer service
 * @author fangang
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao dao;
	/**
	 * @return the dao
	 */
	public CustomerDao getDao() {
		return dao;
	}
	/**
	 * @param dao the dao to set
	 */
	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}
	@Override
	public void create(Customer customer) {
		if(customer.getId()==null) throw new CustomerException("The 'id' is null!");
		if(customer.getName()==null) throw new CustomerException("The 'name' is null!");
		dao.insert(customer);
	}
	@Override
	public void modify(Customer customer) {
		if(customer.getId()==null) throw new CustomerException("The 'id' is null!");
		if(customer.getName()==null) throw new CustomerException("The 'name' is null!");
		dao.update(customer);
	}
	@Override
	public void delete(String id) {
		dao.delete(id);
	}
	@Override
	public Collection<Customer> listOfAll() {
		return dao.list();
	}
	@Override
	public Customer get(String id) {
		return dao.get(id);
	}

}
