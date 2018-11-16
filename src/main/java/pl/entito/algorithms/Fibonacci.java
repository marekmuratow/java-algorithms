package pl.entito.algorithms;

import java.util.logging.Logger;

public class Fibonacci {

	static Logger log = Logger.getLogger(Fibonacci.class.getSimpleName());

	public static void main(String[] args) {
		int number = 7;
		int result = compute(number);
		log.info(() -> "The last number of a fibonacci sequence " + number + " -> " + result);
	}

	public static int compute(int n) {
		return (n <= 1) ? n : (compute(n - 1) + compute(n - 2));
	}
}