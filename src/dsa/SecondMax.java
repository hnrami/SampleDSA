package dsa;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input[]= {88,88,2,4,10,5,-98};
		
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		
		
		for(int i=0;i<input.length-1;i++) {
			
			
			if(input[i]>max) {
					secondMax=max;
					max=input[i];
			}
			else if(input[i]>secondMax && input[i]!=max) {
				secondMax=input[i];
			}
		}
		
		
		
		
		System.out.println(secondMax);

	}

}
