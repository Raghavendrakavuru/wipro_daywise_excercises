package com.wipro.orderms.dto;

import com.wipro.microservices.paymentms.entity.Paymentms;

public class OrderDto {
	private int id;
	private String orderNumber;
	private double orderValue;
	private String orderStatus;
    private Paymentms payment;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public double getOrderValue() {
		return orderValue;
	}
	public void setOrderValue(double orderValue) {
		this.orderValue = orderValue;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Paymentms getPayment() {
		return payment;
	}
	public void setPayment(Paymentms payment) {
		this.payment = payment;
	}
    
    
  
}
