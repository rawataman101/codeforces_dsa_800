package codeforces.p800.sep;

import java.util.Scanner;

public class TwoElevators {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String str = "codeforces";
		while (t-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			sol(a, b, c);
		}
	}

//O(1)
	private static void sol(int a, int b, int c) {
		int d1 = Math.abs(a - 1);
		int d2 = Math.abs(b - c) + Math.abs(c - 1);
		if (d1 < d2)
			System.out.println(1);
		else if (d1 > d2)
			System.out.println(2);
		else
			System.out.println(3);

	}
}
