package codeforces.p800.sep;

import java.util.Arrays;
import java.util.Scanner;

//O(nlogn) - for sorting the array
public class Increasing {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int si = s.nextInt();
			int arr[] = new int[si];
			for (int i = 0; i < si; i++) {
				arr[i] = s.nextInt();
			}
			sol(arr, si);
		}
	}

	private static void sol(int[] arr, int n) {
		boolean isFound = false;
		Arrays.sort(arr);
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] >= arr[i + 1]) {
				isFound = true;
			}
		}
		System.out.println((isFound) ? "NO" : "YES");
	}

}
