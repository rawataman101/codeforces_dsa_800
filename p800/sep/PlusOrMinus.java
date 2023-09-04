package codeforces.p800.sep;

import java.util.Scanner;

public class PlusOrMinus {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			sol(a, b, c);
		}
	}

	private static void sol(int a, int b, int c) {
		if ((a + b) == c) {
			System.out.println("+");
		} else {
			System.out.println("-");
		}

	}

}
