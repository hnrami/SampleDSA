package com.sample.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Stream example to get EVEN number from List of Integer

public class StreamFilterEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// List of Integer - source
        List<Integer> numbers = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19);
        
        List<Integer> filterEvenNumbers = numbers.stream().filter(x -> x%2==0).collect(Collectors.toList());
        
        filterEvenNumbers.forEach(n -> System.out.println(n));
        

	}

}
