package com.wipro.ananymous;
import java.time.LocalDate;
import java.util.function.Supplier;
public class SupplierLambda {
	public static void main(String[] args) {
		LocalDate day;
		Supplier<String> day= () -> LocalDate.of();
		System.out.println(day.get());
	}

}
