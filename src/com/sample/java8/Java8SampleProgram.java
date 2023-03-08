package com.sample.java8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8SampleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Employee> personList = getPersons();
		
		personList.stream().sorted((X,Y) -> (X.getAge() - Y.getAge())).forEach(System.out::println);
		
		
		personList.stream().mapToInt(p -> p.getAge()).average().getAsDouble();
		personList.stream().mapToInt(p -> p.getAge()).min().getAsInt();
		personList.stream().mapToInt(p -> p.getAge()).max().getAsInt();
		
		String[] words = new String[10];
		words[5]=" ";
        Optional<String> checkNull
            = Optional.ofNullable(words[5]);
        if (checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.print(word);
        }
        else
            System.out.println("word is null");

//		List<Integer> numberList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//		findDuplicate(numberList);
	}
	
	
	
	private static List<Employee> getPersons() {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee();
		employee.setAge(1);
		Employee employee2 = new Employee();
		employee2.setAge(2);
		Employee employee3 = new Employee();
		employee3.setAge(3);
		Employee employee4 = new Employee();
		employee4.setAge(4);
		
		List<Employee>  emplist = new ArrayList<>();
		emplist.add(employee4);
		emplist.add(employee3);
		emplist.add(employee2);
		emplist.add(employee);
		return emplist;
	}



	public static void oddEven(List<Integer> numberList) {
		
		
		numberList.stream().filter(x -> x%2==0).forEach(System.out::println);	
		
		
	}
	
	public static void sorted(List<Integer> numberList) {
		
		numberList.stream().sorted().forEach(System.out::println);
		numberList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}
	
	public static void findDuplicate(List<Integer> numberList) {
		
		HashSet<Integer> hashSet = new HashSet<>();
		numberList.stream().filter(n -> !hashSet.add(n)).forEach(System.out::println);
		
	}
	
	// we are sort by Employee Title
	public static Map<String, List<Employee>> sortEmpTitle(List<Employee> employeesList) {
		
		return employeesList.stream().collect(Collectors.groupingBy(Employee::getTitle));
		
	}

}
