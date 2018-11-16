package pl.entito.algorithms;

import java.util.Arrays;
import java.util.logging.Logger;

public class Utils {

	static Logger log = Logger.getLogger(Utils.class.getName());

	private Utils() {

	}

	public static void printArray(int[] array) {
		Arrays.stream(array).forEach(i -> log.info(i + " "));
	}
}
