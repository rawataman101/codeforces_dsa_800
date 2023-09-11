package codeforces.p800.sep;

import java.util.Scanner;

public class OddSet {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n-- > 0) {
			int si = 2 * s.nextInt();
			int[] arr = new int[si];
			for (int i = 0; i < si; i++) {
				arr[i] = s.nextInt();
			}
			sol(arr, si);
		}

	}

	/*
	 * O(n)
	 */
	private static void sol(int[] arr, int n) {
		int e = 0, o = 0;
		for (int i : arr) {
			if (i % 2 == 0) {
				e++;
			} else {
				o++;
			}
		}
		System.out.println((o == e) ? "YES" : "NO");

	}
}
