/*
 * Created by 2020-06-26 10:35:05 
 */
package com.demo.customer.exception;

/**
 * @author fangang
 */
public class CustomerException extends RuntimeException {

	private static final long serialVersionUID = 57146054380417290L;
	
	public CustomerException() { super(); }

	public CustomerException(String message) { super(message); }
	
	public CustomerException(String message, Throwable e) { super(message, e); }
}
