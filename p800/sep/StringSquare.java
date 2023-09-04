package codeforces.p800.sep;

import java.util.Scanner;
/*
 * time - O(n)
 * substring is constant time
 * 
 */

public class StringSquare {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n-- > 0) {
			String str = s.next();
			sol(str);
		}

	}

	private static void sol(String str) {
		if(str.length() % 2 == 1) {
			System.out.println("NO");
		} else {
			/*
			 * compare half part with the other half
			 * 
			 */
			String firstHalf = str.substring(0, str.length()/2);
			String otherHalf = str.substring(str.length()/2, str.length());
//			System.out.println(firstHalf);
//			System.out.println(otherHalf);
			if(firstHalf.equals(otherHalf)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}
		

	}

}
