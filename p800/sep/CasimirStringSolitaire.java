package codeforces.p800.sep;

import java.util.Scanner;

public class CasimirStringSolitaire {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			String str = s.next();
			sol(str);
		}
	}

//O(n)
	private static void sol(String str) {
		int a = 0, b = 0, c = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A') {
				a++;
			} else if (str.charAt(i) == 'B') {
				b++;
			} else {
				c++;
			}
		}
		System.out.println((a + c == b) ? "YES" : "NO");

	}

}
