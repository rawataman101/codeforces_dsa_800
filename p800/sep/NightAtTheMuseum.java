package codeforces.p800.sep;

import java.util.Scanner;
/*
 * time - O(n)
 * space - O(1)
 */
public class NightAtTheMuseum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char[] arr = str.toCharArray();
		char currentLetter = 'a';
		int r = 0;
		for (int i = 0; i < arr.length; i++) {
			// System.out.println(currentLetter);
			r += Math.min(Math.abs(arr[i] - currentLetter), 26 - Math.abs(arr[i] - currentLetter));
			// System.out.println(Math.abs(arr[i] - currentLetter));
			currentLetter = arr[i];
		}
		System.out.println(r);

	}

}
