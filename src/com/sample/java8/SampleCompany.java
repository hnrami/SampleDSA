package com.sample.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SampleCompany {

	public static void main(String[] args) {
		
		
		
		Stream<String> car=Stream.of("Volvo", "BMW", "Ford", "Mazda");
		Stream<String> it=Stream.of("TCS", "wipro", "infosys", "HCL");

		Stream.concat(car, it).forEach(x -> System.out.print(x));
		

	}
	
	
	

}

