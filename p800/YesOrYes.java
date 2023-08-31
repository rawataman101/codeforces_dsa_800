package codeforces.p800;

import java.util.Scanner;

/**
 * Time - O(n)
 * Space - O(m) m is the length of the longest string
 *
 */
public class YesOrYes {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		while(n-- > 0) {
			String str = s.nextLine();
			str = str.toLowerCase();
			if(str.charAt(0) == 'y' && str.charAt(1) == 'e' && str.charAt(2) == 's') {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
