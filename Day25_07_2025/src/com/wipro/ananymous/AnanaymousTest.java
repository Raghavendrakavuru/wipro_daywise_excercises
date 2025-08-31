package com.wipro.ananymous;

public class AnanaymousTest {
	
	public static void main(String[] args) {
		BankOps savingAccount =new BankOps() {
			public void deposit(double amount) {
				System.out.println("Saving account"+amount);
			}
		}
	}

}
