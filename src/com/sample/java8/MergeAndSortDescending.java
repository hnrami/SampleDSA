package com.sample.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class MergeAndSortDescending {

	 public static void main(String[] args) {
	        Integer[] arr1 = {1, 3, 5, 7};  // Note: Integer instead of int for Collections.reverseOrder()
	        Integer[] arr2 = {2, 4, 6, 8};
	  
	        
	        Integer[] mergeArrays = new Integer[arr1.length+arr2.length];
	        
	        
	        System.arraycopy(arr1, 0, mergeArrays, 0, arr1.length);
	        
	        System.arraycopy(arr2, 0, mergeArrays, arr1.length,arr2.length);
	        
	        Arrays.sort(mergeArrays);
	        
	        for (int i = 0; i < mergeArrays.length; i++) {
	            System.out.print(mergeArrays[i] + " ");
	        }
	 }
}
