package dsa.start;

//import Arrays.ArrayInput;
import Arrays.ArrayPrefixSum;
public class MainDSA {

	public static void main(String[] args) {
ArrayPrefixSum arrayObj = new ArrayPrefixSum();
		 int[] arr = arrayObj.input();
	        
	        System.out.println("Original Array:");
	        arrayObj.printArray(arr);
	        
	        arrayObj.prefixSum(arr);
	        
	        System.out.println(" sorted Array:");
	        arrayObj.printArray(arr);
	}

}
