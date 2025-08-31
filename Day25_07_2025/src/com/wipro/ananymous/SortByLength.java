package com.wipro.ananymous;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SortByLength {
	public static void main(String[] args) {
		Function<List<String>,List<Integer>> f=list->{
			List<Integer> n= new ArrayList<>();
			for(String s:list) {
				n.add(s.length());
			}
			return n;
		};
		List<String> list1= Arrays.asList("Jayanta","Amit","Vasu");
		System.out.println(f.apply(list1));
	}

}
