package codeforces.p800.sep;

import java.util.Scanner;

// O(1)
public class LCMProblem {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int l = s.nextInt();
			int r = s.nextInt();
			sol(l, r);
		}

	}

	private static void sol(int l, int r) {
		if (2 * l > r) {
			System.out.println(-1 + " " + -1);
		} else {
			System.out.println(l + " " + 2 * l);
		}

	}

}
