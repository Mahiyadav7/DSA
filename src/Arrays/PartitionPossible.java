package Arrays;

import java.util.*;

public class PartitionPossible {

	public int[] input() {
		 
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		
		System.out.println("Enter the element in an array");
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	//sum of elements of array
	public int arraySum(int arr[]) {
		
		int totalsum=0;
		for(int i=0;i<arr.length;i++) {
			
	     totalsum+=arr[i];
		}
		return totalsum;
	}
	
	//checking  equal sum partition possible or not 
	
	public boolean equal_sum_partition(int arr[]) {
		
		int totalsum=arraySum(arr);
		int prefsum=0;
		for(int i=0;i<arr.length;i++) {
			prefsum+=arr[i];
			int sufsum=totalsum-prefsum;
			if(sufsum==prefsum)
				return true;
		}
	
	return false;
}
//Printing Array
		public void printArray(int arr[]) {
			
			for(int i=0;i<arr.length;i++) {
				
				System.out.println(arr[i]);
			}
			}
	
}
