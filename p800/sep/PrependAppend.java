package codeforces.p800.sep;

import java.util.Scanner;

public class PrependAppend {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			String str = s.next();
			sol(str, n);
		}
	}

	private static void sol(String str, int n) {
		int i = 0;
		int j = n - 1;
		int ans = n;
		while (str.charAt(i) != str.charAt(j) && ans > 0) {
			i++;
			j--;
			ans -= 2;

		}
		System.out.println(ans);
	}
}
