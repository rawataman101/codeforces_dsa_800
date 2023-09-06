package codeforces.p800.sep;

import java.util.Scanner;
// O(1)
public class FairPlayOff {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int d = s.nextInt();
			System.out.println(sol(a,b,c,d));
		}
	}

	private static String sol(int a, int b, int c, int d) {
		if(Math.max(a, b) > Math.min(c, d) && Math.max(c, d) > Math.min(a, b)) {
			return "YES";
		} else {
			return "NO";
		}
	}

}
