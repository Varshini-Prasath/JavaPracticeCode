package Interview;

import java.util.Scanner;

public class sumOfAllArray {

	public static void main(String[] args) {
		System.out.println("Num is "+intenterNumIntiArray());
		
	}
	
	public static int intenterNumIntiArray() {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("Please enter the array size");
		
		int sizeOfArray = scanner.nextInt();
		int[] arrayValue = new int[sizeOfArray];
		for(int i=0; i<sizeOfArray; i++) {
			arrayValue[i] = scanner.nextInt();
			sum+= arrayValue[i];
		}
		return(sum);
	}
}
