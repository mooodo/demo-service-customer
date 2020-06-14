/*
 * Created by 2020-06-14 18:54:09 
 */
package com.demo.customer.service;

import static org.junit.Assert.*;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.customer.entity.Customer;
import com.demo.support.utils.DateUtils;

/**
 * @author fangang
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTest {
	@Autowired
	private CustomerService service;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSaveAndDelete() {
		String id = "101";
		Customer customer = new Customer();
		customer.setId(id);
		customer.setName("Elizabeth");
		customer.setSex("woman");
		customer.setBirthday(DateUtils.getDate("1999-01-01", "yyyy-MM-dd"));
		customer.setIdentification("110112199901016666");
		customer.setPhoneNumber("16912345678");
		service.save(customer);
		Customer saved = service.get(id);
		assertThat("save the customer failed!",id, equalTo(saved.getId()));
		
		service.delete(id);
		Customer deleted = service.get(id);
		assertNull("delete the customer failed!", deleted);
	}
	
	@Test
	public void testListOfAll() {
		List<Customer> list = service.listOfCustomers();
		assertThat("list of customers failed!", list.size(), is(not(equalTo(0))));
	}
}
