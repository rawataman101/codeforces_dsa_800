package codeforces.p800.sep;

import java.util.Scanner;

//O(1)
public class DiceRoll {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int y = s.nextInt();
		int w = s.nextInt();
		int max = (y > w) ? y : w;
		switch (max) {
		case 1:
			System.out.println("1/1");
			break;
		case 2:
			System.out.println("5/6");
			break;
		case 3:
			System.out.println("2/3");
			break;
		case 4:
			System.out.println("1/2");
			break;
		case 5:
			System.out.println("1/3");
			break;
		case 6:
			System.out.println("1/6");
			break;
		}
	}
}