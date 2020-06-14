/* 
 * Created by 2018年9月9日
 */
package com.demo.customer.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.customer.entity.Customer;
import com.demo.customer.service.CustomerService;

import feign.Body;

/**
 * The controller for customer.
 * @author fangang
 */
@Controller
@RequestMapping("customer")
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	@GetMapping("show")
	public String show() {
		return "product/index";
	}
	
	@PostMapping("save")
	@ResponseBody
	public void save(Customer customer) {
		service.save(customer);
	}
	
	@GetMapping("delete")
	@ResponseBody
	public void delete(String id) {
		service.delete(id);
	}
	
	@GetMapping("get")
	@ResponseBody
	public Customer get(String id) {
		return service.get(id);
	}
	
	@GetMapping("listOfAll")
	@ResponseBody
	public List<Customer> listOfAll() {
		return service.listOfCustomers();
	}
}
