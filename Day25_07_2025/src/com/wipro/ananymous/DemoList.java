package com.wipro.ananymous;
	
		import java.util.*;
		import java.util.stream.Collectors;
		public class DemoList {
		public class Main {
		    public static void main(String[] args) {
		        List<String> names = Arrays.asList("Jayanta", "Jnanedra", "Ajay", "Jasmine", "Raja");

		        // Filter names where "j" and "a" appear consecutively
		        List<String> filteredNames = names.stream()
		                .filter(name -> name.toLowerCase().contains("ja"))
		                .collect(Collectors.toList());

		        System.out.println(filteredNames);
		    }
		}

		
}
