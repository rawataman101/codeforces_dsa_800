package codeforces.p800;

import java.util.Scanner;

/*
 * Time - O(n)
 * Space - O(n) n => length of the string
 * 
 */
public class Borze {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = "";
		str = s.nextLine();
		/*
		 * "." 0 "-." 1 "--" 2
		 */
		StringBuilder sb = new StringBuilder();
		/*
		 * case 1: handle 1 case 2: handle 2 case 3: handle 0
		 */
		for (int i = 0; i < str.length(); i++) {
			//System.out.println("iteration" + i);

			if (str.charAt(i) == '-' && str.charAt(i + 1) == '.') {
				sb.append(1);
				i = i + 1;
				continue;
			}
			if (str.charAt(i) == '-' && str.charAt(i + 1) == '-') {
				sb.append(2);
				i = i + 1;
				continue;
			}
			if (str.charAt(i) == '.') {
				sb.append(0);
				continue;
			}

		}
		System.out.println(sb);
	}

}
