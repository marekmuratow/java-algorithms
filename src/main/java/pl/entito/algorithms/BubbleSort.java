package pl.entito.algorithms;

public class BubbleSort {

	private BubbleSort() {

	}

	public static void bubbleSort(int[] array) {

		if (array == null) {
			throw new java.lang.IllegalArgumentException("Null array");
		}

		for (int k = 0; k < array.length - 1; k++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
	}

}
