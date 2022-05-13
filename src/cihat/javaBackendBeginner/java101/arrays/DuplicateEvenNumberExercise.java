package cihat.javaBackendBeginner.java101.arrays;

/**@author Cihat Gelir*/
public class DuplicateEvenNumberExercise {
	
	public static void dupli(int[] arr) {
		int[] duplicated  = new int[arr.length];
		for(int i = 0; i < arr.length-1 ;i++) {
			for(int k = i+1; k < arr.length; k++) {
				if(arr[i] % 2 == 0) {
					if( i != k && arr[i] == arr[k]) {
						duplicated[i] = arr[i];
					}
				}
				
			}
		}
		System.out.print("Even numbers that are duplicate: ");
		for(int i : duplicated) {
			if(i != 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {3,7,3,3,2,2,9,10,10,21,1,33,9,1};
		dupli(arr);
	}
}
