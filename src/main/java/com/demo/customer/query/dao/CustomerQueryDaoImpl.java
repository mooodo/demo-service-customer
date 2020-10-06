/* 
 * Created by 2019年1月25日
 */
package com.demo.customer.query.dao;

import java.util.Collection;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.demo.customer.dao.impl.CustomerFactory;
import com.demo.support.dao.QueryDao;

/**
 * The implement of the query dao for customers.
 * @author fangang
 */
@Repository("customerQueryDao")
public class CustomerQueryDaoImpl implements QueryDao {
	private CustomerFactory factory = CustomerFactory.newInstance();
	@Override
	public Collection<?> query(Map<String, Object> params) {
		return factory.list();
	}

	@Override
	public long count(Map<String, Object> params) {
		return factory.list().size();
	}

	@Override
	public Map<String, Object> aggregate(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

}
