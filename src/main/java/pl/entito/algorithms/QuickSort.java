package pl.entito.algorithms;

import java.util.logging.Logger;

public class QuickSort {

	static Logger log = Logger.getLogger(QuickSort.class.getName());

	public static void main(String[] args) {

		final int[] array = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		quickSort(array, 0, array.length - 1);
		Utils.printArray(array);
	}

	private static void quickSort(int[] array, int low, int high) {

		int lowLocal = low;
		int highLocal = high;
		int pivot = array[low + (high - low) / 2];

		log.info(() -> "low " + low + " high " + high + " (high -low)/2 " + (high - low) / 2);

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
