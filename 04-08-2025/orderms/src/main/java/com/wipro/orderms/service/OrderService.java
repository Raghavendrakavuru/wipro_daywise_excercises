package com.wipro.orderms.service;

import java.util.List;

import com.wipro.orderms.entitry.Orderms;


public interface OrderService {

	
	Orderms save(Orderms orderms);
	List<Orderms> findAll();
}
