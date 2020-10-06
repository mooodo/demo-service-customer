/*
 * Created by 2020-06-24 15:18:44 
 */
package com.demo.customer.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.demo.customer.dao.impl.CustomerFactory;
import com.demo.customer.entity.Customer;

/**
 * @author fangang
 */
public class CustomerFactoryTest {
	private CustomerFactory factory = CustomerFactory.newInstance();

	@Test
	public void testSetBean() {
		Customer customer = new Customer();
		customer.setId("001");
		customer.setName("Mary");
		factory.save(customer);
		
		Customer result = factory.get("001");
		assertNotNull(result);
		
		factory.delete("001");
		Customer result1 = factory.get("001");
		assertNull(result1);
	}

	@Test
	public void testGetBean() {
		Customer result = factory.get("10001");
		assertNotNull(result);
	}
}
