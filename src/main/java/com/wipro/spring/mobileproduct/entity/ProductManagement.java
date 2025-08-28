package com.wipro.spring.mobileproduct.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product_management")
public class ProductManagement
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="product_name")
	String productName;
	
	@Column(name="product_make")
	String productmake;
	
	@Column(name="product_price")
	String productprice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductmake() {
		return productmake;
	}

	public void setProductmake(String productmake) {
		this.productmake = productmake;
	}

	public String getProductprice() {
		return productprice;
	}

	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}

	@Override
	public String toString() {
		return "ProductManagement [id=" + id + ", productName=" + productName + ", productmake=" + productmake
				+ ", productprice=" + productprice + "]";
	}
	
	
}
