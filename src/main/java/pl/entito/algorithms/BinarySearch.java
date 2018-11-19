package pl.entito.algorithms;

public class BinarySearch {

	private static final int NOT_FOUND = -1;

	private BinarySearch() {

	}

	public static int binarySearch(int[] array, int key) {

		if (array == null || array.length == 0) {
			return NOT_FOUND;
		}

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

		return NOT_FOUND;
	}

}
