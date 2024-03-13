package dsa;

public class Palimdrome {

	public static void main(String[] args) {
		
		
		String value="madam";
		System.out.println(isPelindromeinput(value));
		
	}

	private static Boolean isPelindromeinput(String value) {
		char[] input= value.toCharArray();
		int start=0;
		int end=input.length-1;
		
		
		while(start<end) {
			
			if(input[start]!=input[end]) {
				return false;
			}
			start++;
			end--;
		}
		
		return true;
	}

}
