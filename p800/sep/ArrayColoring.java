package codeforces.p800.sep;

import java.util.Scanner;

public class ArrayColoring {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		while (n-- > 0) {
			int si = s.nextInt();
			int[] arr = new int[si];
			for (int i = 0; i < si; i++) {
				arr[i] = s.nextInt();
			}
			sol(arr, si);
		}
	}

	// O(n)
	private static void sol(int[] arr, int n) {
		int ev = 0, od = 0;
		for (int i : arr) {
			if (i % 2 == 0)
				ev++;
			else
				od++;
		}
		if (od % 2 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
