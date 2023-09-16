package codeforces.p800.sep;

import java.util.Scanner;

public class MaximumIncrease {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		sol(arr, n);
	}

// O(n)
	private static void sol(int[] arr, int n) {
		int max = 0;
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				count++;
			} else {
				count = 0;
			}
			max = Math.max(max, count);
		}
		System.out.println(max + 1);

	}

}
