package com.sample.java8;

import java.util.TreeSet;

public class ThirdMaxNumber {

	public static void main(String[] args) {
		
		
		 System.out.println(maxThree(new int[] {2,4,1,3}));
		
	}

	private static Integer maxThree(int nums[]) {
		
		final TreeSet<Integer> set = new TreeSet<>();
		
		for(int n:nums) {
			set.add(n);
		}
		
		if(set.size()<4) {
			return set.last();
		}
		set.pollLast();
		set.pollLast();
		set.pollLast();
		
		return set.last();
	}

}
