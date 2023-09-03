package codeforces.p800.sep;

import java.util.Scanner;
/*
 * Time - O(1) iterating a constant word
 * Space - O(1) character array
 * 
 * It iterates over a constant word ("codeforces") and uses a character array of constant size
 * 
 */

public class CodeforcesChecking {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		char c;
		String str = "codeforces";
		while (n-- > 0) {
			c = s.next().charAt(0);
			char[] arr = str.toCharArray();
			sol(arr, c);
		}
	}

	private static void sol(char[] arr, char c) {
		boolean isFound = false;
		for (char i : arr) {
			if (c == i) {
				isFound = true;
			}
		}
		if (isFound)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
