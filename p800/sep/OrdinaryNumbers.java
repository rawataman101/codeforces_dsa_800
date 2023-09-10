package codeforces.p800.sep;

import java.util.Scanner;

/*
 * 
 * Time Complexity: The outer loop runs for each power of 10 up to 'n', 
 * and the inner loop runs for each digit from 1 to 9. So, the overall time complexity of the 
 * sol method is O(log10(n)), where 'n' is the input number. This is because the outer loop runs 
 * for roughly log10(n) iterations. The inner loop, which has a constant number of iterations (9), 
 * does not significantly impact the overall time complexity.

Space Complexity: The space complexity is O(1) because the code uses a constant amount of extra 
space to store variables like 'res', 'i', and 'd'. The space used does not depend on the size of the input 'n'.

Overall, this code is efficient in terms of both time and space complexity for the 
given problem. It calculates the count of ordinary numbers in a straightforward manner.
 */
public class OrdinaryNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n-- > 0) {
			int e = s.nextInt();
			sol(e);
		}
	}

	private static void sol(int n) {
		int res = 0;
		for (int i = 1; i <= n; i = i * 10 + 1) {
			System.out.println("For i=" + i);
			for (int d = 1; d <= 9; d++) {
				System.out.println("d=" + d);
				if (i * d <= n) {
					res++;
				}
			}
			System.out.println("res=" + res);
		}
		System.out.println(res);

	}
}
