package codeforces.p800.sep;

import java.util.Scanner;

public class PerfectPermutation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
		sol(arr, n);
	}

	// O(n)
	private static void sol(int[] arr, int n) {
		if (n == 1 || n % 2 == 1) {
			System.out.println(-1);
		} else {
			for (int i = 0; i < n - 1; i = i + 2) {
				swap(arr, i, i + 1);
			}
			for (int k : arr) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
