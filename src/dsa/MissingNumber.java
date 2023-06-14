package dsa;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input[]= {5,6,8,3,1,4,9,2};
		
		;
		System.out.println(secondWay(input));
		
		Arrays.sort(input);
		
		System.out.println(Arrays.toString(input));
		
		for(int i=0;i<input.length-1;i++) {
			
			int first=input[i]+1;
			int second= input[i+1];
			
			if(first != second) {
				System.out.println("Missing Number is "+first);
				i=input.length-1;
			}
		}
		

	}
	
	public static int secondWay(int input[]) {
		int n=input.length+1;;
		int sum = n * (n+1)/2;
		
		for(int num : 	input) {
			sum = sum-num;
		}
		return sum;
		
	}

}
