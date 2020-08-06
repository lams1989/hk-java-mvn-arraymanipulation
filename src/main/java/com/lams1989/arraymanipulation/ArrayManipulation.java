package com.lams1989.arraymanipulation;


public class ArrayManipulation {

	public static long arrayManipulation(int n, int[][] queries) {
		long[] array = new long[n];

		return totalArraysSums(queries, array);

	}

	public static long totalArraysSums(int[][] queries, long[] array) {
		long mayor = 0;
		for (int i = 0; i < queries.length; i++) {
			long aux =sumVector(array, queries[i], mayor);
			if ( aux > mayor) {
				mayor = aux;
			}
		}
		return mayor;
	}

	public static long sumVector(long[] array, int[] param, long mayor) {
	
		for (int j = param[0] - 1; j <= param[1] - 1; j++) {
			array[j] += param[2];
			if (array[j] > mayor) {
				mayor = array[j];
			}
		}
		return mayor;

	}

}
