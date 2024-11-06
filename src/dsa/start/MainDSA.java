package dsa.start;

//import Arrays.ArrayInput;
import Arrays.SortEvenOdd;
public class MainDSA {

	public static void main(String[] args) {
       SortEvenOdd arrayObj = new SortEvenOdd();
		 int[] arr = arrayObj.input();
	        
	        System.out.println("Original Array:");
	        arrayObj.printArray(arr);
	        
	        arrayObj.sort_even_odd(arr);
	        
	        System.out.println(" sorted Array:");
	        arrayObj.printArray(arr);
	}

}
