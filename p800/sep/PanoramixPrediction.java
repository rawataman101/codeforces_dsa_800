package codeforces.p800.sep;

import java.util.Scanner;

/*
 * 
 * Combining all these factors, the overall time complexity is approximately O((b - a) * (sqrt(b) / 2)), 
 * which simplifies to O((b - a) * sqrt(b)). This is because the isPrime(i) function runs the divisibility check up to 'i / 2', 
 * and we consider worst-case scenarios where 'i' can be as large as 'b'.
 */
public class PanoramixPrediction {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(sol(a, b));
	}

	private static String sol(int a, int b) {

		for (int i = a + 1; i <= b; i++) {
			if (isPrime(i)) {
				if (i == b)
					return "YES";
				else
					return "NO";
			}
		}
		return "NO";

	}

	private static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
