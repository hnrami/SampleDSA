package dsa;

import java.util.Arrays;

public class CompareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] first = {1,3,5};
		
		int [] second = {7,3,8};
		
		
		extracted(first, second);
        
        
        
 
		
		
		
			
	}

	private static boolean extracted(int[] first, int[] second) {
		int N = first.length;
        int M = second.length;
        
        // If lengths of array are not equal means
        // array are not equal
        if (N != M)
            return false;
        
        
        // Sort both arrays
        Arrays.sort(first);
        Arrays.sort(second);
        
        
     // Linearly compare elements
        for (int i = 0; i < N; i++)
            if (first[i] != second[i])
                return false;
 
        // If all elements were same.
        return true;
	}

}
