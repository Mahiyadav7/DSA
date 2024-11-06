package Arrays;

import java.util.*;
public class SortEvenOdd {

	public int[] input() {
		
		Scanner sc=new Scanner(System.in);
		int arr[]= new int[8];
		System.out.println("Enter 8 elements in an array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	//swapping function
	public void swap(int arr[],int left,int right) {
		
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
	}
	
	//sorting even and odd
	
	public void sort_even_odd(int arr[]) {
		
		int n=arr.length;
		int left=0;
		int right=n-1;
		while(left<right) {
			if(arr[left]%2==1 && arr[right]%2==0) {
				
				swap(arr,left,right);
				left++;
				right--;
			}
			if(arr[left]%2==0)
				left++;
			if(arr[right]%2==1)
				right--;
		}
	}
	
	//Printing Array
	public void printArray(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
		}
	}




