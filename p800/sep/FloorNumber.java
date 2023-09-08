package codeforces.p800.sep;

import java.util.Scanner;

//O(1)
public class FloorNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int an = s.nextInt();
			System.out.println(sol(n,an));
		}
	}

	private static int sol(int n, int an) {
		if (n <= 2)
			return 1;
		else
			return ((n - 3) / an) + 2;

	}
}
