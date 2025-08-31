package com.wipro.orderms.dto;

import lombok.Data;

@Data
public class Payment {

	private String paymentMode;
	private double paymentAmount;
	private String description;
	private int orderId;
	private boolean paymentStatus;
	
	
}
