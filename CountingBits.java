package DP;

import java.util.Arrays;

public class CountingBits {

	public static void main(String[] args) {

		int n = 5;
		int[] ans = countingBits(n);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] countingBits(int n) {

		int[] arr = new int[n + 1];
		int count = 0;
		for (int i = 0; i < n + 1; i++) {
			arr[i] = -1;
		}
		arr[0] = 0;
		for (int i = 1; i < n + 1; i++) {
			int k = i;
			while (k > 0) {
				if (arr[k] != -1) {
					count = count + arr[k];
					break;
				} else {
					if ((k & 1) == 1) {
						count++;
					}
					k = k >> 1;
				}
			}
			arr[i] = count;
			count = 0;
		}
		return arr;
	}

}
