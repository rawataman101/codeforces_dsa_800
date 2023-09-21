package codeforces.p800.sep;

import java.util.Arrays;
import java.util.Scanner;

// O(1)
public class ThreePairwiseMaximums {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int x = s.nextInt();
			int y = s.nextInt();
			int z = s.nextInt();
			int[] arr = { x, y, z };
			Arrays.sort(arr);
			if (arr[1] != arr[2]) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
				System.out.println(arr[0] + " " + arr[0] + " " + arr[2]);
			}
		}
	}
}
