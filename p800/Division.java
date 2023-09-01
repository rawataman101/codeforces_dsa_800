package codeforces.p800;

import java.util.Scanner;

// O(1)

public class Division {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n-- > 0) {
			int e = s.nextInt();
			sol(e);
		}
	}

	private static void sol(int e) {
		String ans = "";
		if (e >= 1900) {
			ans = "Division 1";
		} else if (e <= 1899 && e >= 1600) {
			ans = "Division 2";
		} else if (e >= 1400 && e <= 1599) {
			ans = "Division 3";
		} else {
			ans = "Division 4";
		}
		System.out.println(ans);
	}

}
