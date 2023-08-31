package codeforces.p800;

import java.util.Scanner;

public class HitTheLottery {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count = 0;
		count += n / 100; // all 100 bills
		n = n % 100; // remaining
		//dis(count, n);
		count += n / 20;
		n = n % 20;
		//dis(count, n);
		count += n / 10;
		n = n % 10;
		count += n / 5;
		n = n % 5;
		//dis(count, n);

		count += n;
		System.out.println(count);
	}

	static void dis(int c, int n) {
		System.out.println("Count->" + c + " Rem->" + n);
	}
}

/*
T O(1)
S O(1)

*/