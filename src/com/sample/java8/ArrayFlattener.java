package com.sample.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFlattener {

	
	public static void main(String[] args) {
        Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };
        
        Integer[] flattenedArray = flatten(array);
        
        System.out.println(Arrays.toString(flattenedArray));
    }
    
    public static Integer[] flatten(Object[] array) {
        List<Integer> list = new ArrayList<>();
        flatten(array, list);
        return list.toArray(new Integer[0]);
    }
    
    private static void flatten(Object[] array, List<Integer> list) {
        for (Object element : array) {
            if (element instanceof Integer) {
                list.add((Integer) element);
            } else if (element instanceof Object[]) {
                flatten((Object[]) element, list);
            }
        }
    }
}
