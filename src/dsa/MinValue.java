package dsa;

public class MinValue {

	public static void main(String[] args) {
		
		
		int inputMin[]= {88,44,2,4,10,5,-98};
		int min=inputMin[0];
		
		
		for(int i=0;i<inputMin.length;i++) {
			
			if(inputMin[i]< min) {
				min=inputMin[i];
			}
		}
		System.out.println(min);
		
		

	}

}
