package dsa;

public class FindNonRepatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputStr="india";
		
		
		 boolean flag = true;
		
		 for(char i :inputStr.toCharArray())
	        {
			 
			 System.out.println("inputStr.indexOf(i): "+ inputStr.indexOf(i));

			 System.out.println("inputStr.lastIndexOf(i): "+ inputStr.lastIndexOf(i));
			 if (inputStr.indexOf(i)!= inputStr.lastIndexOf(i))
	            {
	                System.out.println("First non-repeating character is: "+ i);
	                flag = false;
	                break;
	            }
		}
		

        if(flag)
            System.out.println("There is no non repeating character in input string");
		
		
	}

}
