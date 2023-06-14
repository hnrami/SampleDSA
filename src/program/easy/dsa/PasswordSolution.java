package program.easy.dsa;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import dsa.Test;

public class PasswordSolution {

	public static void main(String[] args) {

		System.out.println(test(new int[]{ 1,2,3,4}, 3));
//		 
//		System.out.println(sortedChars.substring(0, sortedChars.length()-1)); // abcdeghk

		   
	}
	
	static Integer test(int []D ,int X) {
		
		   if(D.length > X)
	           if(D.length/2 > X)
	              return D.length/2 + 1;
	           else {
	        	   if(D.length-1 == X)
		                 return X;
		        	   else
		        		   return X-1;
	           }
	        	   
	        		   
	        else 
	            return X;   
	}

}
