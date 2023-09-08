package codeforces.p800.sep;

import java.util.Scanner;

public class OrdinaryNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n-- > 0) {
			int e = s.nextInt();
			if(e >= 1 && e <= 9) {
				System.out.println(e);
			}
		}
	}
}
