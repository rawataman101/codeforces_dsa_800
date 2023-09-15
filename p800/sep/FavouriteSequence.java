package codeforces.p800.sep;

import java.util.Scanner;

public class FavouriteSequence {
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
// constant
	private static void sol(int[] arr, int n) {
		int i = 0, j = n - 1;
		while (i <= j) {
			if (i != j)
				System.out.print(arr[i] + " " + arr[j] + " ");
			else
				System.out.print(arr[i]);
			i++;
			j--;
		}
		System.out.println();

	}

}
