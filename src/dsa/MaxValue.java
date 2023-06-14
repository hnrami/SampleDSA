package dsa;

public class MaxValue {

	public static void main(String[] args) {
		
		
		int inputMax[]= {88,44,2,4,10,5,-98};
		int max=inputMax[0];
		
		
		for(int i=0;i<inputMax.length;i++) {
			
			if(inputMax[i]>max) {
				max=inputMax[i];
			}
		}
		System.out.println(max);
		
		

	}

}
