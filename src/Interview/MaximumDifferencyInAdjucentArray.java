package Interview;

import java.util.Scanner;

public class MaximumDifferencyInAdjucentArray {
	
	public static Scanner scanner = new Scanner(System.in);
	public static int arraySize = 5;
	public static int[] arrayInt = new int[arraySize];
	
	
	public static void main(String[]args) {
//		System.out.println("Size of array: ");
//		arraySize = scanner.nextInt();
		adjucentDifference();
	}
	public static void adjucentDifference() {
		for(int i=0;i<arraySize; i++) {
			arrayInt[i] = scanner.nextInt();
			
		}
		System.out.println(arrayInt);
		for(int i=0;i<arraySize; i++) {
			int difference = arrayInt[i+1]-arrayInt[i];
			System.out.println(difference);
		}
	}

	
}
