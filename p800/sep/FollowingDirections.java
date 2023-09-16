package codeforces.p800.sep;

import java.util.Scanner;

public class FollowingDirections {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			String str = s.next();
			sol(str, n);

		}
	}
// O(n)
	private static void sol(String str, int n) {
		int[] arr = { 0, 0 };
		boolean isFound = false;
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == 'U') {
				arr[1] += 1;
			}
			if (str.charAt(i) == 'R') {
				arr[0] += 1;
			}
			if (str.charAt(i) == 'D') {
				arr[1] -= 1;
			}
			if (str.charAt(i) == 'L') {
				arr[0] -= 1;
			}
			if (arr[0] == 1 && arr[1] == 1) {
				isFound = true;
			}
		}
		System.out.println((isFound) ? "YES" : "NO");
	}

}
