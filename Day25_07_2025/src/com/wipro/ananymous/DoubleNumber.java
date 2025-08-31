package com.wipro.ananymous;

import java.util.function.Function;

public class DoubleNumber {
	public static void main(String[] args) {
		
		Function<Double, Double>getFraction= num -> num-Math.floor(num);
		double input =66.789;
		double fraction=getFraction.apply(input);
		
		System.out.println(fraction);
	}

}
