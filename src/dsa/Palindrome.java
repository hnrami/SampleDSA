package dsa;

public class Palindrome {

	public static void main(String[] args) {
		
		
		String input="1221";
		System.out.println(extracted(input));
		

	}

	private static Boolean extracted(String input) {
		char inputValue[]=input.toCharArray();
		
		int start=0;
		int end=input.length()-1;
		
		while(start<end) {
			if(inputValue[start]!=inputValue[end]) {
				return false;
			}
			start++;
			end --;
		}
		return true;
	}

}
