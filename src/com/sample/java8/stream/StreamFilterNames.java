package com.sample.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//get String with length greater than 5 from List of Strings
public class StreamFilterNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 List<String> names = new ArrayList<>();
		 
	        // add few names to String list using add() method
	        names.add("Sachin");
	        names.add("Warne");
	        names.add("Pietersen");
	        names.add("McCullum");
	        names.add("Jonty");
	        names.add("Richards");
	        names.add("Ranatunga");
	        
	        List<String> resultNames = names.stream().filter(x -> x.length() >5).collect(Collectors.toList());
	        resultNames.forEach(result -> System.out.println(result));
	        
	}

}
