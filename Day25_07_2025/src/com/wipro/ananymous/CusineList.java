package com.wipro.ananymous;


	import java.util.ArrayList;
	import java.util.Comparator;
	import java.util.List;
	import java.util.stream.Collectors;
	 
	public class CusineList {
		public static void main(String[] args) {
		
			FoodList f1= new FoodList("Spring Rolls","Veg","Chinese",150);
			FoodList f2= new FoodList("Fried Rice","Non-Veg","Chinese"250);
			FoodList f3= new FoodList("Paneer Butter","Veg","Indian"200);
			FoodList f4= new FoodList("Chicken","Non-Veg","Chinese"300);
		
		List<FoodItem> L1=Arrays
			
			Comparator<Product> comp= (a,b)->{
				Double d1= Double.valueOf(a.prodPrice);
				Double d2= Double.valueOf(b.prodPrice);
				return d1.compareTo(d2);
			};
			
			//1 List of mobiles sorted by price
			List<Product> pList= prodList
			.stream()
			.filter(p->p.getProdCat().equalsIgnoreCase("Mobile"))
			.sorted(comp.reversed())
			.collect(Collectors.toList());
			
			System.out.println(pList);
			
			
		}
	 
	}
	
}
