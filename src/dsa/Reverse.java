package dsa;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {1,2,3,4,5,6,7,8};
		
		int start=0;
		int end=input.length-1;
		
		while(start<end) {
			
			
			int temp = input[start];
			input[start] = input[end];
			input[end]=temp;
			start++;
			end--;
		}
		for(int value:input) {
			System.out.print(value);
		}
	}

}
