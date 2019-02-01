/* 
 * Created by 2019年1月25日
 */
package com.demo.customer.query.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.demo.customer.repository.CustomerRepository;
import com.demo.support.dao.QueryDao;

/**
 * The implement of the query dao for customers.
 * @author fangang
 */
@Repository("customerQueryDao")
public class CustomerQueryDaoImpl implements QueryDao {
	private CustomerRepository repository = CustomerRepository.getInstance();
	@Override
	public List<?> query(Map<String, Object> params) {
		return repository.list();
	}

	@Override
	public long count(Map<String, Object> params) {
		return repository.size();
	}

	@Override
	public Map<String, Object> aggregate(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

}
