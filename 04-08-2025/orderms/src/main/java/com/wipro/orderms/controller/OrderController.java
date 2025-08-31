package com.wipro.orderms.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.orderms.entitry.Orderms;
import com.wipro.orderms.service.OrderService;


@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping
	void save(@RequestBody Orderms orderms)
	{
		
		orderService.save(orderms);
		
		
	}

	@GetMapping
	List<Orderms> findAll()
	{
		return orderService.findAll();
	}
}