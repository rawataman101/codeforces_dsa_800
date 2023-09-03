package codeforces.p800.sep;

import java.util.Scanner;

public class FairDivision {
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

	private static void sol(int[] arr, int si) {
		int sum = 0;
		int c1 = 0;
		int c2 = 0;

		for (int i : arr) {
			sum += i;
			if (i == 1) {
				c1++;
			} else {
				c2++;
			}
		}
		sum = c1 + 2 * c2;
		if (sum % 2 == 1) {
			System.out.println("NO");
		} else if (sum / 2 % 2 == 0 || sum / 2 % 2 == 1 && c1 != 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
