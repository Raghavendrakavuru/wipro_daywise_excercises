package com.wipro.microservices.paymentms.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="paymentms")
@Data
public class Paymentms {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="order_id")
	String orderId;
	@Column(name="payment_status")
	boolean paymentStatus;
	
	@Column(name="payment_amount")
	double paymentAmount;
	

}