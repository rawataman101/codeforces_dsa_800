package codeforces.p800;

import java.util.Scanner;

/**
 * 
 * In summary, the formula k = ((n - y) // x) * x + y calculates the largest
 * possible k that satisfies the condition k mod x = y within the range [0, n].
 *
 */
public class RequiredRemainder {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int x, y, n;
		while (t-- > 0) {
			x = s.nextInt();
			y = s.nextInt();
			n = s.nextInt();
			sol(x, y, n);
		}
	}

	private static void sol(int x, int y, int n) {
		System.out.println(((n - y) / x) * x + y);

	}

}
