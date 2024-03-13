package com.sample.java8.stream;

public class CounterModificationExample {

	 public static void main(String[] args) {
	        int counter = 0;
	        System.out.println("Initial counter value: " + counter);

	        // Call the method to modify the counter value
	        modifyCounter(counter);

	        // Print the modified counter value outside the method
	        System.out.println("Modified counter value: " + counter);
	    }

	    // Method that modifies the counter value
	    public static void modifyCounter(int counter) {
	        // Modify the counter value
	        counter++;
	    }

}
