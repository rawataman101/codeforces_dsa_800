package codeforces.p800.sep;

import java.util.Arrays;
import java.util.Scanner;

public class Triple {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int si = s.nextInt();
			int[] arr = new int[si];
			for (int i = 0; i < si; i++) {
				arr[i] = s.nextInt();
			}
			sol(arr, si);
		}
	}

//O(log n) -> time to sort the array
	private static void sol(int[] arr, int n) {
		boolean isFound = false;
		Arrays.sort(arr);
		int count = 1;
		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[i - 1])
				count++;
			else
				count = 1;
			if (count == 3) {
				System.out.println(arr[i]);
				isFound = true;
				break;
			}
		}
		if (!isFound)
			System.out.println(-1);

	}

}
