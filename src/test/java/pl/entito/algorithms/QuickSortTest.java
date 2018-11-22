package pl.entito.algorithms;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.Test;

public class QuickSortTest {

	@Test
	public void QuickSortNullArray() {
		try {
			QuickSort.quickSort(null, 0, 0);
			fail();
		} catch (IllegalArgumentException e) {
			assertSame("Null array", e.getMessage());
		}
	}

	@Test
	public void BubbleSortEmptyArray() {
		int[] array = new int[] {};

		QuickSort.quickSort(array, 0, 0);

		assertArrayEquals(new int[] {}, array);
	}

	@Test
	public void BubbleSortWrongLowParameter() {
		int[] array = new int[] { 1 };

		try {
			QuickSort.quickSort(array, -1, 0);
			fail("Should not be here");
		} catch (IllegalArgumentException e) {
			assertEquals("low cannot be smaller than 0: -1", e.getMessage());
		}
	}

	@Test
	public void BubbleSortWrongHighParameter() {
		int[] array = new int[] { 1 };

		try {
			QuickSort.quickSort(array, 0, 1);
			fail("Should not be here");
		} catch (IllegalArgumentException e) {
			assertEquals("high cannot be bigger than 0: 1", e.getMessage());
		}
	}

	@Test
	public void QuickSortSortedArray() {
		int[] array = new int[] { -82, 2, 5, 7, 66, 90 };

		QuickSort.quickSort(array, 0, array.length - 1);

		assertArrayEquals(new int[] { -82, 2, 5, 7, 66, 90 }, array);
	}

	@Test
	public void QuickSortReverteddArray() {

		int[] array = new int[] { 90, 66, 7, 5, 2, -82 };

		QuickSort.quickSort(array, 0, array.length - 1);

		assertArrayEquals(new int[] { -82, 2, 5, 7, 66, 90 }, array);
	}

	@Test
	public void QuickSortUnsortedArray() {

		int[] array = new int[] { 5, 2, 7, 90, -82, 66 };

		QuickSort.quickSort(array, 0, array.length - 1);

		assertArrayEquals(new int[] { -82, 2, 5, 7, 66, 90 }, array);
	}

}
