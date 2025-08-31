package com.wipro.microservices.paymentms.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.microservices.paymentms.entity.Paymentms;


@Repository
public interface PaymentRepo  extends JpaRepository<Paymentms, Integer> {

}