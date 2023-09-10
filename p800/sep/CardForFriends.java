package codeforces.p800.sep;

import java.util.Scanner;

/*
 * The time complexity of this program is O(1) because it performs a fixed number of operations regardless of the input values. It uses a loop to repeatedly divide a and b by 2 until they are no longer even, which takes a constant number of iterations.

The space complexity is O(1) as well because the program only uses a few integer variables (a, b, c, and n) to store input and intermediate values. The memory usage remains constant regardless of the input size.
 */
public class CardForFriends {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			System.out.println((sol(a, b, c)) ? "YES" : "NO");
		}

	}

	private static boolean sol(int a, int b, int n) {
		int c = 1;
		while (a % 2 == 0 || b % 2 == 0) {
			if (a % 2 == 0) {
				a /= 2;
			} else {
				b /= 2;
			}
			c *= 2;
		}
		return c >= n;
	}

}
