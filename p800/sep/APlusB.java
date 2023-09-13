package codeforces.p800.sep;

import java.util.Scanner;
//O(1)
public class APlusB {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			String str = s.next();
			int a = str.charAt(0) - '0';
			int b = str.charAt(2) - '0';
			System.out.println(a + b);
		}
	}

}
