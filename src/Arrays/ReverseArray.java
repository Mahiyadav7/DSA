package Arrays;

import java.util.*;

public class ReverseArray {
  
	public  int[] input() {
		Scanner sc =new Scanner(System.in);
		int array[] = new int[5];
		System.out.println("Enter 5 numbers");
		for(int i=0;i<5;i++) {
			array[i]= sc.nextInt();
		}
		
		return array; 
	}
		
	
	public void reverseArray(int array[]) {
		int n=array.length;
		int i=0;
		int j=n-1;
		while(i<j) {
			swap(array,i,j);
			i++;
			j--;
			
		}
		
		for(int i1=0;i1<5;i1++) {
			System.out.println(array[i1]);}
	}
	
	
	private void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		// TODO Auto-generated method stub
		
	}
	
	public void printArray(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
	}
	
	}
}

	 

