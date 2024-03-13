package com.sample.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExtractValueExample {

	public static void main(String[] args) {
		List<String> inputs = Arrays.asList("name=hemang", "{age=25", "{city=example");

		List<String> results = inputs.stream()
                .map(input -> Arrays.stream(input.split("="))
                        .skip(1) // Skip the first part (before the equal sign)
                        .findFirst()
                        .orElse("Invalid input format."))
                .collect(Collectors.toList());
		
		results.forEach(result -> System.out.println("Output: " + result));
    }

    private static String extractValue(String input) {
        return Arrays.stream(input.split("="))
                .skip(1) // Skip the first part (before the equal sign)
                .findFirst()
                .orElse("Invalid input format.");
    }

	  
	
}
