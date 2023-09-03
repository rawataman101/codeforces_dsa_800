package codeforces.p800.sep;

import java.util.Scanner;

// O(1)
public class MediumNumber {
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
		// when b is the medium
		if (b > a && b < c || b > c && b < a) {
			System.out.println(b);
		} else if (a > b && a < c || a > c && a < b) {
			System.out.println(a);
		} else {
			System.out.println(c);
		}

	}

}
