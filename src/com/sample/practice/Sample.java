package com.sample.practice;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Write a Java method to move all zero number to the right side of an input array of number
		//int input=[3,2,8,0,4,2,0,4,7]
		// output  [3,2,8,4,2,4,7,0,0]	
		
		int input[] = {3,2,8,0,4,2,0,4,7};
		
		int count=input.length-1;
		for(int i=0;i<input.length;i++) {
			
			
			if(input[i]==0 && count!=0) {
				int temp;
				temp= input[i];
				input[i]=input[count];
				input[count]=temp;
				count=count-1;
			}
			
		}
		for(int j : input)
		System.out.print(j);
		
		
	}

}
