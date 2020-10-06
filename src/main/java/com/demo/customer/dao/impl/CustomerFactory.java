/*
 * Created by 2020-06-25 19:56:09 
 */
package com.demo.customer.dao.impl;

import com.demo.customer.entity.Customer;
import com.demo.support.dao.GenericFactory;

/**
 * @author fangang
 */
public class CustomerFactory extends GenericFactory<Customer> {
	private static CustomerFactory factory;
	public static synchronized CustomerFactory newInstance() {
		if(factory!=null) return factory;
		CustomerFactory instance = new CustomerFactory();
		instance.setClazz(Customer.class);
		instance.initFactory("customer.xml");
		factory = instance;
		return factory;
	}

}
