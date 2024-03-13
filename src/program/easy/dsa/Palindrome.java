package program.easy.dsa;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println(palindrome("hemang"));
		
		

	}

	private static boolean palindrome(String input) {
		//String input="madam";
		
		char[] inputValues=input.toCharArray();
		int start =0;
		int end=input.length()-1;
		
		while(start<end) {
			if(inputValues[start]!= inputValues[end])
					return false;
			
			start++;
			end--;
		}

		
		
		return true;
		
	}

}
