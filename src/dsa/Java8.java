package dsa;

import java.text.Collator;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<String> lines = Arrays.asList("java", "c", "python");

		
		 List<String> result = lines.stream().filter(X -> !"C".equalsIgnoreCase(X)).collect(Collectors.toList());
		
		result.forEach(System.out::println);
		
		
		
		List<String> listOfStrings = Arrays.asList("1","2","3","5");
		
		List<Integer> listOfIntegers = listOfStrings.stream().map(Integer::valueOf).collect(Collectors.toList());

		
		
		System.out.println(listOfIntegers);
		
		
		 List<Integer> evens = Arrays.asList(2, 4, 6);
	        List<Integer> odds = Arrays.asList(3, 5, 7);
	        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);
	        
	        List<Integer> numbers  = Stream.of(evens,odds,primes).flatMap(list -> list.stream()).collect(Collectors.toList());
	        
	        
	        
	        HashMap<String, String> map = new HashMap<>();
	        
	        map.entrySet().stream().forEach(X -> {
	        	if(X.getKey()=="tes")
	        		System.out.println(X.getKey() + X .getValue());
	        	}
	        );
	        

	}

}
