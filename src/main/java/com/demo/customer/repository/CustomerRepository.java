/* 
 * Created by 2018年9月9日
 */
package com.demo.customer.repository;

import com.demo.customer.entity.Customer;
import com.demo.support.utils.DateUtils;

/**
 * The Repository for Customers.
 * @author fangang
 */
public class CustomerRepository extends AbstractRepository<Customer> {
	private static CustomerRepository repository = null;
	protected CustomerRepository() {}
	public static CustomerRepository getInstance() {
		if(repository==null)
			repository = new CustomerRepository();
		return repository;
	}
	
	protected void initialize() {
		Customer john = new Customer("10001","John","male",DateUtils.getDate("19820312", "yyyyMMdd"),
				"110120198203127712","13601327812");
		put(john);
		
		Customer jack = new Customer("10002","Jack","male",DateUtils.getDate("19820709", "yyyyMMdd"),
				"110120198207098819","13612128881");
		put(jack);
		
		Customer hanna = new Customer("10003","Hanna","female",DateUtils.getDate("19851209", "yyyyMMdd"),
				"110120198512092312","13633447899");
		put(hanna);
		
		Customer anna = new Customer("10004","Anna","female",DateUtils.getDate("19851109", "yyyyMMdd"),
				"110120198511092312","13677122121");
		put(anna);
	}
	@Override
	protected void put(Customer t) {
		map.put(t.getId(), t);
	}
}
