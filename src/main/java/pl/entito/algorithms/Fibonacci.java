package pl.entito.algorithms;

/**
 * Fibonacci Sequence: 0, 1, 1, 2, 3, 5, 8 ...
 * 
 */
public class Fibonacci {

	private Fibonacci() {

	}

	public static int compute(int n) {
		return (n <= 1) ? n : (compute(n - 1) + compute(n - 2));
	}
}