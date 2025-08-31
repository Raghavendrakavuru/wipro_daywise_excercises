package com.wipro.microservices.paymentms.services.implservice;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.microservices.paymentms.entity.Paymentms;
import com.wipro.microservices.paymentms.repo.PaymentRepo;
import com.wipro.microservices.paymentms.services.PaymentService;


@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	PaymentRepo paymentRepo;
	
	@Override
	public void save(Paymentms paymentms) {
		// TODO Auto-generated method stub
		paymentRepo.save(paymentms);
	}

	@Override
	public List<Paymentms> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
