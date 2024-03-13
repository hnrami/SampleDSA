package com.sample.java8;

public class SerachInsertPostion {

	public static void main(String[] args) {
		
		int [] input = {1,3,5,6};
		System.out.println(serachInsert(input,0));
		
		
		
	}
	
	
	private static int serachInsert(int [] A,int target) {
		if(A == null || A.length == 0)
			return 0;
		int l=0;
		int r=A.length-1;
		int m;
		
		while(l <= r)
		{
		  m = l + (r-1) /2 ;
		  
		  if(A[m] == target)
			  return m;
		  else if (A[m] > target)
			  r = m -1;
		  else
			  l=m + 1;
		}
		return l;
	}

	private static int insertPostion() {
		int [] input = {1,3,5,6};
		int num=1;
		
		for(int i=0;i<input.length;i++) {
			
		  if(input[i]==num)
		     return i;
		  
		  if(input[i]>num) 
			  return i;
		  
		  if(i==input.length-1)
			  return i+1;
		  
		}
		return num;
	}

}
