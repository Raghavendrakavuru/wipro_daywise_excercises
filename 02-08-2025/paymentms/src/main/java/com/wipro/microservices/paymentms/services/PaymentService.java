package com.wipro.microservices.paymentms.services;
import java.util.List;

import com.wipro.microservices.paymentms.entity.Paymentms;



public interface PaymentService {
	
	void save(Paymentms  paymentms);
	List< Paymentms> findAll();
}
