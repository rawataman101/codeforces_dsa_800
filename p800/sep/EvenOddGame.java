package codeforces.p800.sep;

import java.util.Scanner;
//O(1)
public class EvenOddGame {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(n % 2 == 0 ? "Mahmoud" : "Ehab");
	}

}
