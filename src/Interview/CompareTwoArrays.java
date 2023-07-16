package Interview;

public class CompareTwoArrays {
	
	public static int[] array1 = {2,3,4,5,9};
	public static int[] array2 = {1,3,4,5,7};
	
	public static void main(String[] args) {
		compareArray();
	}
	public static void compareArray() {
		int size = array1.length;
		int[] array3 = new int[size];
		for (int i=0 ; i<size ;i++) {
		if(array1[i] == array2[i]) {
			array3[i] = array1[i]; 
		}
		}
		System.out.println(array3);
	}
}
