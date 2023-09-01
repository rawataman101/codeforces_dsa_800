package codeforces.p800.sep;

import java.util.Scanner;

/*
 * time - O(n) -> range of elements
 * 
 */
public class MaximumGCD {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int e = s.nextInt();
			System.out.println(e/2);
		}
	}

	public static int calGCD(int a, int b) {
		int rem = b % a;
		while (rem != 0) {
			int temp = a;
			a = rem;
			b = temp;
			rem = b % a;
		}
		return a;
	}

}
