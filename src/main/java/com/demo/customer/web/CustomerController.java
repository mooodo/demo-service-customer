/* 
 * Created by 2018年9月9日
 */
package com.demo.customer.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The controller for customer.
 * @author fangang
 */
@Controller
@RequestMapping("customer")
public class CustomerController {
	
	@GetMapping("show")
	public String index() {
		return "customer/index";
	}
}
