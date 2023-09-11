package codeforces.p800.sep;

import java.util.Scanner;

/*
 * time - O(sqrt(n))
 */
public class FafaCompany {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int res = 0;
		int maxLeads = n / 2;
		for (int i = 1; i <= maxLeads; i++) {
			if ((n - i) % i == 0)
				res++;
		}
		System.out.println(res);
	}
}
