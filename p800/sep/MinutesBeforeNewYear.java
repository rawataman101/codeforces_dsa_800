package codeforces.p800.sep;

import java.util.Scanner;
// O(1)
public class MinutesBeforeNewYear {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int h = s.nextInt();
			int m = s.nextInt();
			System.out.println(sol(h, m));
		}
	}

	private static int sol(int h, int m) {
		m = 60 - m;
		h = (23 - h) * 60;
		return m + h;

	}

}
