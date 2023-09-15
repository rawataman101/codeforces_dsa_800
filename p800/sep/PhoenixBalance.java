package codeforces.p800.sep;

import java.util.Scanner;

//O(n)
public class PhoenixBalance {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			sol(n);
		}
	}

	private static void sol(int n) {
		if (n <= 0)
			return;

		int pile1 = (int) Math.pow(2, n), pile2 = 0;
		for (int i = 1; i <= n / 2 - 1; i++) {
			pile1 += Math.pow(2, i);
		}
		for (int i = n / 2; i < n; i++) {
			pile2 += Math.pow(2, i);
		}

		System.out.println(Math.abs(pile2 - pile1));

	}

}
