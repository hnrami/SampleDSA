package dsa;

import java.util.Date;

public class Test {

	 public static void main(String[] args) {
		 
		 
		 	String input= new Date().toString();
		 
		    int[] numbers = new int[args.length];

		    for (int i = 0; i < args.length; i++)
		    {
		        numbers[i] = Integer.parseInt(args[i]);
		    }
		    
		  
		    int greatest = numbers[0];
	    	for(int i = 1; i < numbers.length; i++){
	    		if (numbers[i] > greatest){
	    			greatest = numbers[i];
	    		}
	    	}
	    	System.out.println("The greatest number is "+greatest);
	    	
	    }
}   
		
