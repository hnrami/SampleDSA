package dsa;

public class ResizeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intput[]= {3,4,5,6};
		int capacity=8;
		
		int temp[] =new int[capacity];
		
		for(int i=0;i<intput.length;i++) {
			
			temp[i]=intput[i];
		}
		intput=temp;
//		intput[4]=7;
//		intput[5]=9;
//		
		for(int input:intput) {
			System.out.print(input);
		}
		
		

	}

}
