package sample.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeCombineExample {

	 
//	 public static void main(String[] args) {
//	        Employee employee1 = new Employee("John", 30, "Engineer");
//	        Employee employee2 = new Employee("Jane", 28, "Designer");
//	        Employee employee3 = new Employee("Bob", 35, "Manager");
//
//	        String[] mergedEmployee = test(Arrays.asList(employee1, employee2, employee3));
//
//	        System.out.println("Merged Employee (Array format): " + Arrays.toString(mergedEmployee));
//	    }
//
//	    public static String[] mergeEmployees(List<Employee> employees) {
//	        String[] mergedArray = employees.stream()
//	                .flatMap(employee -> Arrays.stream(new String[]{employee.getName(), String.valueOf(employee.getAge()), employee.getDesignation()}))
//	                .toArray(String[]::new);
//
//	        return mergedArray;
//	    }
//	    
//	    public static String[] test(List<Employee> employees) {
//	    	String[] mergedArray = employees.stream()
//	                .flatMap(employee -> Arrays.stream(new String[]{employee.getName(), employee.getName(), employee.getName()}))
//	                .toArray(String[]::new);
//	    	
////	        String[] mergedArray = employees.stream()
////	                .flatMap(employee -> Arrays.stream(new String[]{employee.getName(), String.valueOf(employee.getAge()), employee.getDesignation()}))
////	                .toArray(String[]::new);
//
//	        return mergedArray;
//	    }
	    
	    
//	    public static void main(String[] args) {
//	        Employee employee1 = new Employee("John", 30, "Engineer");
//	        Employee employee2 = new Employee("Jane", 28, "Designer");
//	        Employee employee3 = new Employee("Bob", 35, "Manager");
//
//	        Employee combinedEmployee = combineEmployees(Arrays.asList(employee1, employee2, employee3));
//
//	        System.out.println("Combined Employee: " + combinedEmployee);
//	    }
//
//	    public static Employee combineEmployees(List<Employee> employees) {
//	        String combinedName = employees.stream()
//	                .map(Employee::getName)
//	                .reduce("", (acc, name) -> acc + name);
//
//	        int combinedAge = employees.stream()
//	                .mapToInt(Employee::getAge)
//	                .sum();
//
//	        String combinedDesignation = employees.stream()
//	                .map(Employee::getDesignation)
//	                .reduce("", (acc, designation) -> acc + designation);
//
//	        return new Employee(combinedName, combinedAge, combinedDesignation);
//	    }
	
	
	 public static void main(String[] args) {
	        Employee employee1 = new Employee("John", 30, "Engineer");
	        Employee employee2 = new Employee("Jane", 28, "Designer");
	        Employee employee3 = new Employee("Bob", 35, "Manager");
	        Employee employee4 = new Employee("Alice", 25, "Developer");

	        List<String> mergedValues = mergeEmployeeValues(Arrays.asList(employee1, employee2, employee3, employee4));

	        System.out.println("Merged Employee Values: " + mergedValues);
	    }

	    public static List<String> mergeEmployeeValues(List<Employee> employees) {
	        List<String> mergedValues = employees.stream()
	                .flatMap(employee -> Arrays.asList(employee.getName(), String.valueOf(employee.getAge()), employee.getDesignation()).stream())
	                .collect(Collectors.toList());

	        return mergedValues;
	    }
}
