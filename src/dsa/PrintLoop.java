package dsa;

public class PrintLoop {
	
	public static void printWithoutLoop(int n) {
        if (n <= 100) {
            System.out.println(n);
            printWithoutLoop(n + 1);
        }
    }
	 public static void main(String[] args){
		 PrintLoop.printWithoutLoop(1);
	    }

}
