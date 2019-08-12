/* 
 * Created by 2019年1月30日
 */
package com.demo.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * The application for customer service.
 * @author fangang
 */
@SpringBootApplication
@EnableEurekaClient
@Configuration
@ComponentScan(basePackages="com.demo")
@ImportResource(locations={"classpath:applicationContext.xml"})
public class CustomerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

}
