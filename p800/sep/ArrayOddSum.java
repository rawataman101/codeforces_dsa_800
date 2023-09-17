package codeforces.p800.sep;

import java.util.Scanner;

public class ArrayOddSum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}
			sol(arr, n);
		}
	}

// O(n)
	private static void sol(int[] arr, int n) {
		int sum = 0;
		int even = 0, odd = 0;
		for (int i : arr) {
			if (i % 2 == 0)
				even++;
			else
				odd++;
			sum += i;

		}
		if(sum % 2 == 1) {
			System.out.println("YES");
		} else if(even >= 1 && odd >= 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
				

	}

}
