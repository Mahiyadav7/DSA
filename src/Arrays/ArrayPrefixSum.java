package Arrays;


import java.util.Scanner;

public class ArrayPrefixSum {

	public int[] input() {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int [6];
		System.out.println("Enter elements in array");
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	//prefix sum of array
	public int[] prefixSum(int arr[]) {
		
		for(int i=1;i<arr.length;i++) {
			
			arr[i]=arr[i-1]+arr[i];
		}
		
		return arr;
	}
	
	
	//Printing Array
		public void printArray(int arr[]) {
			
			for(int i=0;i<arr.length;i++) {
				
				System.out.println(arr[i]);
			}
			}
}
