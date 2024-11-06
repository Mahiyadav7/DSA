package dsa.start;

//import Arrays.ArrayInput;
import Arrays.PartitionPossible;
public class MainDSA {

	public static void main(String[] args) {
      PartitionPossible arrayObj = new PartitionPossible();
		 int[] arr = arrayObj.input();
	        
	        System.out.println("Original Array:");
	        arrayObj.printArray(arr);
	        arrayObj.arraySum(arr);
	       boolean ans= arrayObj.equal_sum_partition(arr);
	       if(ans==true)
	       System.out.println("Equal Partition Possible!");
	       System.out.println("Equal Partition  Not Possible!");
	}

}
