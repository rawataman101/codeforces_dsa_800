package codeforces.p800.sep;

import java.util.Scanner;

public class TillaFavouriteProblem {
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
		char max = str.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > max) {
				max = str.charAt(i);
			}
		}
		System.out.println((max - 'a') + 1);

	}

}
