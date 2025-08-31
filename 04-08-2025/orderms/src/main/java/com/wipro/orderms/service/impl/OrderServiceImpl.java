package com.wipro.orderms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.orderms.service.PaymentConnectService;
import com.wipro.orderms.dto.Payment;
import com.wipro.orderms.entitry.Orderms;
import com.wipro.orderms.repo.OrderRepo;
import com.wipro.orderms.service.OrderService;


@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderRepo orderRepo;
	
  @Autowired
	RestTemplate restTemplate;
	
	@Autowired
	PaymentConnectService paymentConnectService;
	
	@Override
   // @CircuitBreaker(name="order-cb", fallbackMethod = "handleFallBack")
    public Orderms save(Orderms orderms) {
        orderms.setOrderStatus("I");
         Orderms savedOrder = orderRepo.save(orderms);
 String url="http://payment-ms/payment";
 
            Payment paymentRequest = new Payment();
            paymentRequest.setOrderId(savedOrder.getId());
            paymentRequest.setPaymentAmount(savedOrder.getOrderValue());
            paymentRequest.setPaymentMode("UPI");
            paymentRequest.setDescription("Payment for Order " + savedOrder.getId());
            paymentRequest.setPaymentStatus(true);
 try {
            ResponseEntity<Payment> paymentResponseEntity = paymentConnectService.savePaymentData(paymentRequest);
          //  String paymentResponse = paymentResponseEntity.getBody();
 
            if(paymentResponseEntity.getStatusCode()==HttpStatusCode.valueOf(200))
    		{
    			orderms.setOrderStatus("P");
    			
    		}
    		 
    		}catch(Exception ex)
    		{
    			System.out.println(ex);
    			orderms.setOrderStatus("C");
    		}
    		return orderRepo.save(orderms);
    	}

    	@Override
    	public List<Orderms> findAll() {
    		 
    		return orderRepo.findAll();
    	}
    	
    	String handleFallBack(Throwable t)
    	{
    		
    		System.out.println("--System is down--");
    		return "System is down";
    	}


}
