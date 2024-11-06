package dsa.start;

//import Arrays.ArrayInput;
import Arrays.sorting01;
public class MainDSA {

	public static void main(String[] args) {
       sorting01 arrayObj = new sorting01();
		 int[] arr = arrayObj.input();
	        
	        System.out.println("Original Array:");
	        arrayObj.printArray(arr);
	        
	        arrayObj.sort_zero_one(arr);
	        
	        System.out.println(" sorted Array:");
	        arrayObj.printArray(arr);
	}

}
