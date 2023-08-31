package codeforces.p800;

import java.util.Scanner;

public class AntonAndDanik {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		String str = s.nextLine();
		int a = 0, d = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A') {
				a++;
			} else {
				d++;
			}
		}
		if (a > d) {
			System.out.println("Anton");
		} else if (a == d) {
			System.out.println("Friendship");
		} else {
			System.out.println("Danik");

		}
	}

}
/*
T O(n)
S O(1)
*/