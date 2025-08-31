package com.wipro.microservices.paymentms.controller;
import java.net.http.HttpHeaders;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.microservices.paymentms.entity.Paymentms;
import com.wipro.microservices.paymentms.services.PaymentService;
//import com.wipro.orderms.dto.Paymentms;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	PaymentService paymentService;
	
//	@PostMapping
//	public ResponseEntity<String> savep(@RequestBody Paymentms paymentms)
////	{HttpHeaders headers= new HttpHeaders();
////	headers.add("created-at", LocalDate.now().toString());
////	productService.save(product);
////	return ResponseEntity				
////			.status(201)
////			.headers(headers)
////			.body("Data Saved Successfully");

		
//		paymentService.save(paymentms);
//		
//		return null;
//	}
//
//	@GetMapping
//	List<Paymentms> findAll()
//	{
//		return paymentService.findAll();
//	}
	
	@PostMapping
	void save(@RequestBody Paymentms paymentms)
	{
		
		paymentService.save(paymentms);
		
		
	}

	@GetMapping
	List<Paymentms> findAll()
	{
		return paymentService.findAll();
	}
}
	
