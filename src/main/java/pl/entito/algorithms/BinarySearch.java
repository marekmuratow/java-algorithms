package pl.entito.algorithms;

import java.util.logging.Logger;

public class BinarySearch {

	static Logger log = Logger.getLogger(BinarySearch.class.getName());

	public static void main(String[] args) {

		int[] array = new int[] { -11, -7, 2, 3, 5, 10, 11, 15, 20, 88 };

		int key = 88;
		Utils.printArray(array);
		int result = binarySearch(array, key);
		log.info(() -> key + " has " + result + " index");
	}

	private static int binarySearch(int[] array, int key) {

		int start = 0;
		int end = array.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (array[mid] == key) {
				return mid;
			}

			if (key < array[mid]) {
				end = mid - 1;
			}

			if (key > array[mid]) {
				start = mid + 1;
			}
		}

		return -1;
	}

}
