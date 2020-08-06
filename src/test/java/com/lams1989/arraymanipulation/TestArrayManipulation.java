package com.lams1989.arraymanipulation;

import junit.framework.TestCase;

public class TestArrayManipulation extends TestCase {

	public void testSumVector() {

		int[] param = { 1, 2, 100 };
		long[] array = { 0, 0, 0, 0, 0 };
		long mayor = ArrayManipulation.sumVector(array, param, 0L);
		int[] expected = { 100, 100, 0, 0, 0 };

		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i],array[i]);
		}
		assertEquals(100, mayor);
	}

	public void testTotalQueries() {
		int[][] queries = { { 1, 2, 100 }, { 2, 5, 100 }, { 3, 4, 100 } };
		long[] array = { 0, 0, 0, 0, 0 };
		long[] expected = { 100, 200, 200, 200, 100 };
		long mayor = ArrayManipulation.totalArraysSums(queries, array);
		for (int i = 0; i < array.length; i++) {
			assertEquals(expected[i], array[i]);
		}
		assertEquals(200, mayor);
	}

	

	public void testArrayManipulation() {
		int n = 5;
		int[][] queries = { { 1, 2, 500 }, { 2, 5, 100 }, { 3, 4, 100 }, { 1, 2, 500 }, { 2, 5, 100 }, { 3, 4, 100 },
				{ 1, 2, 500 }, { 2, 5, 100 }, { 3, 4, 100 } };
		long actual = ArrayManipulation.arrayManipulation(n, queries);
		long expected = 1800;
	assertEquals(expected, actual);
	}
}
