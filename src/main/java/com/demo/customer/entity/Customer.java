/* 
 * Created by 2018年9月9日
 */
package com.demo.customer.entity;

import java.util.Date;

/**
 * 
 * @author fangang
 */
public class Customer {
	private String id;
	private String name;
	private String sex;
	private Date birthday;
	private String identification;
	private String phoneNumber;
	//private List<Address> addresses;
	public Customer() {
		super();
	}
	
	public Customer(String id, String name, String sex, Date birthday,
			String identification, String phoneNumber) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
		this.identification = identification;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the identification
	 */
	public String getIdentification() {
		return identification;
	}
	/**
	 * @param identification the identification to set
	 */
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
