package codeforces.p800.sep;

import java.util.Scanner;

public class Colourblindness {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int si = s.nextInt();
			String str1 = s.next();
			String str2 = s.next();
			sol(str1, str2, si);
		}
	}

	// O(n)
	private static void sol(String str1, String str2, int n) {
		boolean isFound = false;
		for (int i = 0; i < n; i++) {
			if (str1.charAt(i) == 'R' && str2.charAt(i) != 'R' || str2.charAt(i) == 'R' && str1.charAt(i) != 'R') {
				isFound = true;
			}
		}
		System.out.println(isFound ? "NO" : "YES");
	}

}
