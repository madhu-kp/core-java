package dev.logic.array.sec.two;

import java.util.Arrays;

/**
 * wap to find out element frequency
 * 
 * @author gauraw
 *
 */
public class P43 {
	public static void main(String[] args) {
		int[] x = { 1, 1, 2, 1, 3, 2, 2, 3 };

		System.out.println("Array:" + Arrays.toString(x));

		int n = x.length;
		int temp;

		for (int i = 0; i < (n - 1); i++) {
			for (int j = 0; j < (n - 1); j++) {
				if (x[j] > x[j + 1]) {
					temp = x[j];
					x[j] = x[j + 1];
					x[j + 1] = temp;

				}
			}
		}

		System.out.println("Array:" + Arrays.toString(x));
		int count = 1;
		for (int i = 0; i < x.length - 1; i++) {
			if (x[i] == x[i + 1]) {
				count++;
			} else {
				System.out.println(x[i] + ":" + count);
				count = 1;
			}
		}

		System.out.println(x[x.length - 1] + ":" + count);

	}
}
