package codeforces.p800;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Time - O(n)
 * Space - O(1)
 *
 */
public class Sum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a, b, c;
		while (n-- > 0) {
			a = s.nextInt();
			b = s.nextInt();
			c = s.nextInt();
			int[] arr = { a, b, c };
			Arrays.sort(arr);
			if(arr[0] + arr[1] == arr[2]) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
	}

}
