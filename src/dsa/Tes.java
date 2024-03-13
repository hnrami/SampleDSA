package dsa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Tes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<String> list1 = Arrays.asList("Java", "8");
	        List<String> list2 = Arrays.asList("explained", "through", "programs");
	 
	        Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());
	         
	        // Concatenated the list1 and list2 by converting them into Stream
	 
	        
	        concatStream.forEach(name -> {
	            System.out.print(name +"");
	        });
	}

}
