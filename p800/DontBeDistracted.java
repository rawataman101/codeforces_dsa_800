package codeforces.p800;

import java.util.Scanner;
/*
 * Time - O(n*m) -> n - number of days m - days for each task
 * 
 */
public class DontBeDistracted {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n-- > 0) {
			int d = s.nextInt();
			String str = s.next();
			sol(str, d);
		}
	}

	private static void sol(String str, int n) {
		boolean isDisturbed = false;
		for (int i = 0; i < n; i++) {
			char c = str.charAt(i);
			int last = str.lastIndexOf(c);
			for (int j = i + 1; j < last; j++) {
				if (c != str.charAt(j)) {
					isDisturbed = true;
					break;
				}
			}

		}
		if (isDisturbed)
			System.out.println("NO");
		else
			System.out.println("YES");

	}

}
