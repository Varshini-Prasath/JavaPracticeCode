package Interview;

import java.util.Scanner;

public class MultiplicatioNTableWithoutMultipleOperator {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiplyNumber();
	}
	
	public static int multiplyNumber() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter which table has to be multiplies:");
		int number =  scanner.nextInt();
		
		for (int i=0; i<=10 ; i++) {
			System.out.println("i *"+number+" ="+ Math.multiplyExact(i, number));
		}
		return 0;
		
	}
	
}
