package codeforces.p800.sep;

import java.util.Scanner;

// O(1)
public class CollectiongCoins {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int n = s.nextInt();
			int sum = a + b + c + n;
			int ta = (a + b + c + n) / 3;
			if (sum % 3 == 0 && ta >= a && ta >= b && ta >= c) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
