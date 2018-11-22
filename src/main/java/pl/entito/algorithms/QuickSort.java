package pl.entito.algorithms;

public class QuickSort {

	private QuickSort() {

	}

	public static void quickSort(int[] array, int low, int high) {

		if (array == null) {
			throw new java.lang.IllegalArgumentException("Null array");
		} else if (array.length == 0) {
			return;
		} else if (low < 0) {
			throw new java.lang.IllegalArgumentException("low cannot be smaller than 0: " + low);
		} else if (high > array.length - 1) {
			throw new java.lang.IllegalArgumentException(
					"high cannot be bigger than " + (array.length - 1) + ": " + high);
		}

		int lowLocal = low;
		int highLocal = high;
		int pivot = array[low + (high - low) / 2];

		while (lowLocal <= highLocal) {
			while (array[lowLocal] < pivot) {
				lowLocal++;
			}

			while (array[highLocal] > pivot) {
				highLocal--;
			}
			if (lowLocal <= highLocal) {
				exchangeNumbers(array, lowLocal, highLocal);
				lowLocal++;
				highLocal--;
			}
		}

		if (low < highLocal) {
			quickSort(array, low, highLocal);
		}

		if (lowLocal < high) {
			quickSort(array, lowLocal, high);
		}

	}

	private static void exchangeNumbers(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
