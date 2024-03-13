package com.sample.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapSquareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		List<Integer> resultNumbers = numbers.stream().map(x -> x*x).collect(Collectors.toList());
		resultNumbers.forEach(x->System.out.println(x));
		
	}
	

}
