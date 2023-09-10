package codeforces.p800.sep;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * 
 * time - O(n) length of the string
 * Space - O(n) length of the string
 */
public class ICPCBalloons {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int si = s.nextInt();
			String str = s.next();
			sol(str, si);
		}
	}

	private static void sol(String str, int n) {
		int res = 0;
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			if (set.contains(str.charAt(i))) {
				res += 1;
			} else {
				set.add(str.charAt(i));
				res += 2;
			}
		}
		System.out.println(res);

	}

}
