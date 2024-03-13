package com.sample.java8;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMergeExample {
	
	
	public static void main(String[] args) {
	
		Employee2 employee1 = new Employee2("John", 30, "Engineer");
        Employee2 employee2 = new Employee2("Jane", 28, "Designer");
        Employee2 employee3 = new Employee2("Bob", 35, "Manager");

        Map<String, Object> combinedEmployee = Stream.of(employee1, employee2, employee3)
                .flatMap(employee -> Stream.of(
                        Map.entry("name", employee.getName()),
                        Map.entry("age", employee.getAge()),
                        Map.entry("designation", employee.getDesignation())))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> newValue));

        System.out.println("Combined Employee: " + combinedEmployee);
	
	
	}

}
