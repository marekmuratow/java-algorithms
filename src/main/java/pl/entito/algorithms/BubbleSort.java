package pl.entito.algorithms;

public class BubbleSort {

	public static void main(String[] args) {
		final int[] array = new int[] { 5, 4, 3, 2, 1 };
		bubbleSort(array);
	}

	private static void bubbleSort(int[] array) {

		for (int k = 0; k < array.length - 1; k++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}

		Utils.printArray(array);
	}

}
