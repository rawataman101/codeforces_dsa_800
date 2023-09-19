package codeforces.p800.sep;

import java.util.Scanner;

public class LoveStory {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String str = "codeforces";
		while (t-- > 0) {
			String compStr = s.next();
			sol(str, compStr);
		}
	}
//O(n)
	private static void sol(String str1, String str2) {
		int c = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				c++;
			}
		}
		System.out.println(c);
	}

}
