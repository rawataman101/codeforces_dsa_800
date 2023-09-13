package codeforces.p800.sep;

import java.util.Scanner;

public class SpecialPermutation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			System.out.print(a + " " + 1 + " ");
			for (int i = a - 1; i >= 2; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
