/* 
 * Created by 2019年1月13日
 */
package com.demo.customer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.customer.dao.CustomerDao;
import com.demo.customer.entity.Customer;
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
	public void save(Customer customer) {
		dao.save(customer);
	}
	@Override
	public void delete(String id) {
		dao.delete(id);
	}
	@Override
	public List<Customer> listOfCustomers() {
		return dao.list();
	}
	@Override
	public Customer get(String id) {
		return dao.get(id);
	}

}
