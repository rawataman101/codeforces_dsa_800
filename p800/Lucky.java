package codeforces.p800;

import java.util.Scanner;

/*
 * 
 * O(1)
 */
public class Lucky {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n-- > 0) {
			int num = s.nextInt();
			solution(num);
		}
	}

	private static void solution(int num) {
		int lastThree = num % 1000;
		int firstThree = num / 1000;
		int sum1 = getSum(lastThree);
		int sum2 = getSum(firstThree);
		if (sum1 == sum2)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	private static int getSum(int num) {
		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
}
