package codeforces.p800.sep;

import java.util.Scanner;

//O(1)
public class ToMyCritics {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			sol(a, b, c);
		}
	}

	private static void sol(int a, int b, int c) {
		boolean isFound = false;
		if (a + b >= 10)
			isFound = true;
		if (a + c >= 10)
			isFound = true;
		if (b + c >= 10)
			isFound = true;
		System.out.println(isFound ? "YES" : "NO");

	}

}
