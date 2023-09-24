package codeforces.p800.sep;

import java.util.Scanner;

public class GrabTheCandies {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int si = s.nextInt();
			int[] arr = new int[si];
			for (int i = 0; i < si; i++) {
				arr[i] = s.nextInt();
			}
			sol(arr, si);
		}
	}

	private static void sol(int[] arr, int n) {

		int mihaiCandies = 0;
		int biancaCandies = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0)
				mihaiCandies += arr[i];
			else
				biancaCandies += arr[i];

		}
		System.out.println((mihaiCandies <= biancaCandies) ? "NO" : "YES");
	}
}
