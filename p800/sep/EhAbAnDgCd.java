package codeforces.p800.sep;

import java.util.Scanner;

public class EhAbAnDgCd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			sol(n);
		}
	}

//O(1)
	private static void sol(int n) {
		System.out.println(1 + " " + (n - 1));

	}

}
