package dsa;

import java.util.Arrays;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 static pair getMinMax(long a[], long n)  
	    {
	        //Write your code here
	        
	       long min =  Arrays.stream(a).min().getAsLong();
	       long max =  Arrays.stream(a).max().getAsLong();
	       
	       pair p = new pair(min, max);
	       return p;
	    }

}

class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 
