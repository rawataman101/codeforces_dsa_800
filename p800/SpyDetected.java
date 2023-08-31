package codeforces.p800;

import java.util.Scanner;

/**
 * Complexity Time - O(n) Space - O(n) - Overall, the dominant factor in the
 * space complexity is the input array. Therefore, the space complexity of your
 * code is O(n), where n is the maximum size of the array allowed by the problem
 * constraints (100 in this case).
 *
 */
public class SpyDetected {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n-- > 0) {
			int size = s.nextInt();
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = s.nextInt();
			}

			System.out.println(solution(arr, size));
		}
	}

	/**
	 * 
	 * iterate 0 to n-1 case1: when element 1 is the odd when i == 0 arr[i] !=
	 * arr[i+1] then index = i+1
	 * 
	 * case2: when last element is odd when i = n-1 arr[i] != arr[i-1] then index =
	 * i+1
	 *
	 * case3: neither first nor last element then compare with backward and forward
	 * arr[i] != arr[i+1] && arr[i] != arr[i-1] then index = i+1
	 * 
	 */
	private static int solution(int[] arr, int size) {
		for (int i = 0; i < size; i++) {
			if (i == 0 && arr[i] != arr[i + 1]) {
				if (arr[i] == arr[i + 2])
					return i + 2;
				else
					return i + 1;
			} else if (i == size - 1 && arr[i] != arr[i - 1]) {
				return i + 1;
			} else if (i != 0 && arr[i] != arr[i + 1] && arr[i] != arr[i - 1]) {
				return i + 1;
			}
		}
		return 0;
	}
}
