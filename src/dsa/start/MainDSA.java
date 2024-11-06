package dsa.start;

//import Arrays.ArrayInput;
import Arrays.ReverseArray;
public class MainDSA {

	public static void main(String[] args) {
		ReverseArray arrayObj = new ReverseArray();
		 int[] arr = arrayObj.input();
	        
	        System.out.println("Original Array:");
	        arrayObj.printArray(arr);
	        
	        arrayObj.reverseArray(arr);
	        
	        System.out.println("Reversed Array:");
	        arrayObj.printArray(arr);
	}

}
