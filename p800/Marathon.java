package codeforces.p800;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * O(1)
 * O(1)
 *
 */
public class Marathon {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a, b, c, d;
		List<Integer> arr;
		while (n-- > 0) {
			a = s.nextInt();
			b = s.nextInt();
			c = s.nextInt();
			d = s.nextInt();
			arr = Arrays.asList(a, b, c, d);
			solution(arr);
		}
	}

	private static void solution(List<Integer> arr) {
		int c = 0;
		for (int i = 1; i < arr.size(); i++) {
			if (arr.get(0) < arr.get(i)) {
				c++;
			}
		}
		System.out.println(c);

	}
}
