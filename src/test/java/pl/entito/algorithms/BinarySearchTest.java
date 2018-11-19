package pl.entito.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void binarySearchInNullArray() {
		assertEquals(-1, BinarySearch.binarySearch(null, 5));
	}

	@Test
	public void binarySearchInEmptyArray() {
		assertEquals(-1, BinarySearch.binarySearch(new int[] {}, 5));
	}

	@Test
	public void binarySearchInOneElementArrayWhichContainsSearchedValue() {
		int[] array = new int[] { 5 };
		assertEquals(0, BinarySearch.binarySearch(array, 5));
	}

	@Test
	public void binarySearchInOneElementArrayWhichDoesntContainSearchedValue() {
		int[] array = new int[] { 5 };
		assertEquals(-1, BinarySearch.binarySearch(array, 10));
	}

	@Test
	public void binarySearchArrayContainsValueAtTheBeggining() {
		int[] array = new int[] { -11, -7, 2, 3, 5, 10, 11, 15, 20, 88 };
		assertEquals(0, BinarySearch.binarySearch(array, -11));
	}

	@Test
	public void binarySearchArrayContainsValueInTheMiddle() {
		int[] array = new int[] { -11, -7, 2, 3, 5, 10, 11, 15, 20, 88 };
		assertEquals(4, BinarySearch.binarySearch(array, 5));
	}

	@Test
	public void binarySearchArrayContainsValueAtTheEnd() {
		int[] array = new int[] { -11, -7, 2, 3, 5, 10, 11, 15, 20, 88 };
		assertEquals(9, BinarySearch.binarySearch(array, 88));
	}

	@Test
	public void binarySearchArrayDoesntContainSearchedValue() {
		int[] array = new int[] { -11, -7, 2, 3, 5, 10, 11, 15, 20, 88 };
		assertEquals(-1, BinarySearch.binarySearch(array, 100));
	}

	@Test
	public void binarySearchArrayContainsSearchedValueDupplicated() {
		int[] array = new int[] { -11, -7, 2, 3, 5, 10, 11, 15, 20, 88, 2 };
		assertEquals(2, BinarySearch.binarySearch(array, 2));
	}

}
