package codeforces.p800.sep;

import java.util.Scanner;
// O(n)
public class EqualCandies {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n-- > 0) {
			int si = s.nextInt();
			int[] arr = new int[si];
			for(int i = 0 ; i < si; i++) {
				arr[i] = s.nextInt();
			}
			sol(arr, si);
		}
	}

	private static void sol(int[] arr, int n) {
		int res = 0;
		int min = getMin(arr, n);
		for (int i : arr) {
			if (i == min) {
				continue;
			}
			res += i - min;
		}
		System.out.println(res);
	}

	private static int getMin(int[] arr, int n) { // O(n)
		int min = arr[0];
		for (int i = 0; i < n; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

}
