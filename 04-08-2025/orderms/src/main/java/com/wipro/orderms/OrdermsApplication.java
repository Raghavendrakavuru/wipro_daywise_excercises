package com.wipro.orderms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import jakarta.annotation.PostConstruct;
import lombok.Value;

@SpringBootApplication 
@EnableDiscoveryClient
@EnableFeignClients
public class OrdermsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdermsApplication.class, args);
	}
	
	//@Value("${spring.datasource.url}")
	private String dbUrl;
 
	@PostConstruct
	public void printProperties() {
	    System.out.println("Datasource URL: " + dbUrl);
	}
 
	}
