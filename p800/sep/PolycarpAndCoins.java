package codeforces.p800.sep;

import java.util.Scanner;
/*
 * O(1)
 */
public class PolycarpAndCoins {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int e = s.nextInt();
			sol(e);
		}
	}

	private static void sol(int e) {
		int a, b;
		/*
		 * a = b = e/3
		 * 
		 * if a % 3 == 1 then a += 1 if a % 3 == 2 then a ++
		 * 
		 */
		a = b = e / 3;
		if (e % 3 == 1)
			a++;
		if (e % 3 == 2)
			b++;
		System.out.println(a + " " + b);

	}

}
