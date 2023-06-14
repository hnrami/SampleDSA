package dsa;

public class ReverseArrayGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
	      int size = 3;
	      int n = arr.length;
	      System.out.print("Original array is: ");
	      for (int i = 0; i < n; i++)
	      System.out.print(arr[i] + " ");
	      for (int i = 0; i < n; i += size) 
	      {
	         int left = i;
	         int right = Math.min(i + size - 1, n - 1);
	         int temp;
	         while (left < right) {
	            temp = arr[left];
	            arr[left] = arr[right];
	            arr[right] = temp;
	            left += 1;
	            right -= 1;
	         }
	      }
	      System.out.print("Modified array is: ");
	      for (int i = 0; i < n; i++)
	      System.out.print(arr[i] + " ");
	   }

	}
