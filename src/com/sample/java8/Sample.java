package com.sample.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<Integer> numbers = Arrays.asList(11, 20, 33, 45, 52);
		int sum = numbers.stream()
		                 .filter(n -> n % 4 == 0)
		                 .map(n -> n * 2)
		                 .reduce(0, Integer::sum);
		System.out.println(sum);
		
		
		
		String str="sdfvsdf68fsdfsf8999fsdf09";
		   String numberOnly= str.replaceAll("[^0-9]", "");
		   
//		   System.out.println(numberOnly);
//		   
//		   
//		 IntStream.of(1,2,3,45,6).max().ifPresent(max -> System.out.println(max));
//		 
//		 
//		 IntStream.of(1,2,3,45,6).forEach(x -> System.out.println(x));
//		 IntStream.of(1,2,3,45,6).filter(x -> x%2==0).forEach(x -> System.out.print(x));

		 
		 Map<String,String> map = new HashMap<>();
		 map.put("hh", "xx");
		 
		 map.entrySet().stream().forEach(X -> System.out.println(X));
		 map.forEach((X,Y)-> System.out.println("X"+X+"Y"+Y));
		   
	}

}
