/* 
 * Created by 2019年1月25日
 */
package com.demo.customer.query.dao;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.customer.dao.impl.CustomerRepository;
import com.demo.support.dao.QueryDao;

/**
 * The implement of the query dao for customers.
 * @author fangang
 */
@Repository("customerQueryDao")
public class CustomerQueryDaoImpl implements QueryDao {
	@Autowired
	private CustomerRepository repository;
	@Override
	public Collection<?> query(Map<String, Object> params) {
		return repository.list();
	}

	@Override
	public long count(Map<String, Object> params) {
		return repository.list().size();
	}

	@Override
	public Map<String, Object> aggregate(Map<String, Object> params) {
		return null;
	}

}
