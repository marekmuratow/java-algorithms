package pl.entito.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void test0() {
		assertEquals(0, Fibonacci.compute(0));
	}

	@Test
	public void FirstFibonacciNumber() {
		assertEquals(1, Fibonacci.compute(1));
	}

	@Test
	public void SecondFibonacciNumber() {
		assertEquals(1, Fibonacci.compute(2));
	}

	@Test
	public void ThirdFibonacciNumber() {
		assertEquals(2, Fibonacci.compute(3));
	}

	@Test
	public void FourthFibonacciNumber() {
		assertEquals(3, Fibonacci.compute(4));
	}

	@Test
	public void FifthFibonacciNumber() {
		assertEquals(5, Fibonacci.compute(5));
	}

	@Test
	public void SixthFibonacciNumber() {
		assertEquals(8, Fibonacci.compute(6));
	}
}
