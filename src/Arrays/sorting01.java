package Arrays;

import java.util.*;
public class sorting01 {
	 
	public  int[] input() {
		Scanner sc =new Scanner(System.in);
		int array[] = new int[5];
		System.out.println("Enter 5 numbers");
		for(int i=0;i<5;i++) {
			array[i]= sc.nextInt();
		}
		
		return array; 
	}
	
	
	public void swap(int arr[],int left,int right) {
		
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		}
	
	public void sort_zero_one(int arr[]) {
          
		int n=arr.length;
		int left=0;
		int right=n-1;
		while(left<right) {
			
			if(arr[left]==1 &&arr[right]==0) {
			swap(arr,left,right);
			left++;
			right--;
			}
		
		if(arr[left]==0)
			left++;
		if(arr[right]==1)
			right--;
		}
	}

		public void printArray(int arr[]) {
			
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
		}
		
		}
}
