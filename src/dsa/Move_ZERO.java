package dsa;

import java.util.Arrays;
import java.util.Collections;

public class Move_ZERO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer input[]= {0,6,7,0,9,0,4,0,7,8,5};
		
		

		
//		Arrays.sort(input,Collections.reverseOrder());
//		
//		System.out.println(Arrays.toString(input));
		
		
		int j=0;
		for(int i=0;i<input.length-1;i++) {
			
			if(input[i]!=0 && input[j]==0) {
				
				int temp = input[i];
				input[i]=input[j];
				input[j]=temp;
				
			}
			if(input[j]!=0)
				j++;
		}
		
		
	}
}
