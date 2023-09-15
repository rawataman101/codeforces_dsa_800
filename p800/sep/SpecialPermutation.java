package codeforces.p800.sep;

import java.util.Scanner;

// O(n)
public class SpecialPermutation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			if (a == 1) {
				System.out.println(1);
			} else {
				System.out.print(a + " " + 1 + " ");
				for (int i = 2; i < a; i++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}

		}
	}

}
