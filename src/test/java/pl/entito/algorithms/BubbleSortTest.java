package pl.entito.algorithms;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class BubbleSortTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void BubbleSortNullArray() {
		try {
			BubbleSort.bubbleSort(null);
			fail();
		} catch (IllegalArgumentException e) {
			assertSame("Null array", e.getMessage());
		}
	}

	@Test
	public void BubbleSortEmptyArray() {
		int[] array = new int[] {};

		BubbleSort.bubbleSort(array);

		assertArrayEquals(new int[] {}, array);
	}

	@Test
	public void BubbleSortSortedArray() {
		int[] array = new int[] { -82, 2, 5, 7, 66, 90 };

		BubbleSort.bubbleSort(array);

		assertArrayEquals(new int[] { -82, 2, 5, 7, 66, 90 }, array);
	}

	@Test
	public void BubbleSortReverteddArray() {

		int[] array = new int[] { 90, 66, 7, 5, 2, -82 };

		BubbleSort.bubbleSort(array);

		assertArrayEquals(new int[] { -82, 2, 5, 7, 66, 90 }, array);
	}

	@Test
	public void BubbleSortUnsortedArray() {

		int[] array = new int[] { 5, 2, 7, 90, -82, 66 };

		BubbleSort.bubbleSort(array);

		assertArrayEquals(new int[] { -82, 2, 5, 7, 66, 90 }, array);
	}

}
