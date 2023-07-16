package Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortArray {
	
	static Scanner sc = new Scanner(System.in);

	public static int[] array = new int[5];
	
	public static void main(String[] args) 
	{
		
		System.out.println(array);
		ascending();
		System.out.println(array);
	}
	
	public static void ascending() {
		
		System.out.println("   "+array.length);
		for (int i=0; i<array.length; i++) {
			System.out.println("Enter an Array value");
			int numer = sc.nextInt();
			array[i] = numer;
		}
		for(int i=1;i<array.length;i++ ) {
			for(int j=0;j<array.length;j++) {
				int num=0;
				if(array[j]>array[i]) {
					num = array[j];
					array[j]=array[i];
					array[i]=num;
				}
				System.out.println(array);
			}
		}
	}
	
}
