package codeforces.p800.sep;

import java.util.Arrays;
import java.util.Scanner;

public class SpellCheck {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n-- > 0) {
			int len = s.nextInt();
			String str = s.next();
			sol(str);
		}
	}
/*
 * time - O(nlogn) - sorting
 * space - O(1) constant
 * 
 * 
 */
	private static void sol(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		String newStr = new String(arr);
		if (newStr.equals("Timru"))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}


/*
 * Time Complexity: The most time-consuming operation is the sorting of the character array,
 *  which is done using Arrays.sort(). The time complexity of the sorting operation is O(n log n), 
 *  where 'n' is the length of the input string. Therefore, the overall time complexity of
 *   the sol method is O(n log n). Since this method is called 'n' times (once for each test case),
 *    the total time complexity of the program is O(n^2 log n).

Space Complexity: The space complexity is O(1) because the code only uses a 
constant amount of extra space to store the character array and the sorted string.
 The space used does not depend on the size of the input string.

Keep in mind that the time complexity of O(n^2 log n) may not be
 efficient for large inputs, so if performance is a concern, you 
 might want to consider optimizing the algorithm.
 * 
 * 
 */

