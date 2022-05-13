package cihat.javaBackendBeginner.java101.arrays;

/**@author Cihat Gelir*/
public class HarmonicAverageExercise {
	public static double harmonicAverage(int[] arr) {
		if(arr == null) throw new NullPointerException();
		double harmonicSum = 0;
		for(int i: arr) {
			harmonicSum += harmonicSeriesCalculator(i);
		}
		return harmonicSum/arr.length;
	}
	public static double harmonicSeriesCalculator(int n) {
		double result = 1;
		for (int i = 2; i <= n; i++) {
			result += (1.0/i);
		}
		return result;
	}
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		System.out.printf("Harmonic average: %.2f", harmonicAverage(numbers));
	}
}
