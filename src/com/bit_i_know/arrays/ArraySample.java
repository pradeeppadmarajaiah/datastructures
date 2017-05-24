package com.bit_i_know.arrays;

import java.util.Arrays;

/**
 * 
 * @author pradeep
 *
 */
public class ArraySample {

	public static void main(String args[]) {

		// Arrays are object . created in a heap.
		int[] a = new int[4];

		for (int i = 0; i < 4; i++) {
			a[i] = i;
		}
		System.out.println(Arrays.toString(a));

		// Copy the references.
		int[] b = a;

		if (b == a)
			System.out.println("b equals a");
		else
			System.out.println("b not equals a");

		int[] c = new int[4];

		for (int i = 0; i < 4; i++) {
			c[i] = i;
		}

		int[] d = new int[4];

		for (int i = 0; i < 4; i++) {
			d[i] = i;
		}

		// Not equals. Two separate objects are created.
		if (c == d)
			System.out.println("c equals d");
		else
			System.out.println("c not equals d");

		// Copying mechanism.

		int[] e = Arrays.copyOf(a, 5);

		int[] f = new int[e.length];

		System.arraycopy(e, 0, f, 0, 4);

		int[] g = e.clone();

		System.out.println(g.length);

	}

}