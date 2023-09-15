package codeforces.p800.sep;

import java.util.Scanner;
// constant
public class MostUnstableArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int m = s.nextInt();
			if (n == 1)
				System.out.println(0);
			if (n == 2)
				System.out.println(m);
			if (n > 2)
				System.out.println(Math.min(2, n - 1) * m);
		}
	}

}
