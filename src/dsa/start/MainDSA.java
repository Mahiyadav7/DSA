package dsa.start;
import java.util.*;

public class MainDSA {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int array[] = new int[5];
		System.out.println("Enter 5 numbers");
		for(int i=0;i<5;i++) {
			array[i]= sc.nextInt();
		}
		
		System.out.println("Display the Array");
		for(int i=0;i<5;i++) {
			System.out.println(array[i]);
		}
	}

}