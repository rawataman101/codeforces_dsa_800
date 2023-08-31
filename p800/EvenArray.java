package codeforces.p800;

import java.util.Scanner;

public class EvenArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int n;
		while (t-- > 0) {
			n = s.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				int e = s.nextInt();
				arr[i] = e;
			}
			sol(arr, n);
		}
	}

	private static void sol(int[] arr, int n) {
		int evenAtOdd = 0;
		int oddAtEven = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 != 0 && i % 2 == 0) {
				oddAtEven++;
			}
			if (arr[i] % 2 == 0 && i % 2 != 0) {
				evenAtOdd++;
			}
		}
		if (oddAtEven != evenAtOdd) {
			System.out.println(-1);
		} else {
			System.out.println(evenAtOdd);
		}
	}

}
