package codeforces.p800;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//A. Design Tutorial: Learn from Math
/**
 * logic
 * 
 * iterate and found i which is the perfect divisor of n store i in array (sort
 * if unsorted) perform two pointer approach to find the sum which is equals to
 * n
 * 
 * 
 * twoPointer - O(n)
 * 
 * Time Complexity: breakdown

The loop that iterates from 4 to n-1 has a time complexity of O(n), where "n" is the input number. Inside this loop:

The isComposite function is called for each number in the range. The primality check inside this function has a time complexity of approximately O(sqrt(num)), where "num" is the number being checked. Since this function is called for numbers up to "n", the total time complexity contribution is approximately O(sqrt(n)).
The twoPointer function, which uses the two-pointer approach, iterates through the arr list. This has a linear time complexity of O(n), as both pointers move from the beginning to the end of the list.

Overall, the time complexity of your code is dominated by the loops and checks inside the isComposite function, resulting in a time complexity of approximately O(n * sqrt(n)).

Space Complexity:

The list arr is used to store composite numbers. In the worst case, this list can store up to "n/2" numbers if all even numbers from 4 to "n-1" are composite. Therefore, the space complexity for this list is O(n).

The isComposite function and the twoPointer function use a constant amount of additional space for variables and temporary values, so they contribute O(1) space complexity.

Overall, the space complexity of your code is O(n) due to the space required by the arr list.

In summary, your code has a time complexity of O(n * sqrt(n)) and a space complexity of O(n). Keep in mind that these are worst-case complexities, and actual performance might vary depending on the distribution of composite numbers and the input "n".





 * 
 */
public class CompositeNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		List<Integer> arr = new ArrayList<>();

		for (int i = 4; i < n; i++) {
			if (isComposite(i))
				arr.add(i);

		}
		// System.out.println(arr);
		System.out.println(twoPointer(arr, n));
	}

	private static boolean isComposite(int num) {
		if (num % 2 == 0 || num % 3 == 0) {
			return true;
		}
		for (int i = 5; i * i <= num; i += 6) {
			if (num % i == 0 || num % i + 2 == 0) {
				return true;
			}
		}
		return false;
	}

	private static String twoPointer(List<Integer> arr, int n) {
		int i = 0, j = arr.size() - 1;
		while (i < j) {
			// System.out.println(arr.get(i) + " " + arr.get(j));
			if (arr.get(i) + arr.get(j) == n) {
				return arr.get(i) + " " + arr.get(j);
			} else if (arr.get(i) + arr.get(j) > n) {
				j--;
			} else {
				i++;
			}

		}
		return "";
	}

}

/*
 * In the given code, there's a loop with the condition i * i <= num and an
 * increment of i += 6. This loop is used to check divisibility of the number
 * num by certain candidates for divisors, specifically those that are congruent
 * to 5 or 1 modulo 6. This optimization is based on the observation that primes
 * greater than 3 are of the form 6n ± 1.
 * 
 * Here's how it works:
 * 
 * The loop starts with i as 5. It checks whether i * i is less than or equal to
 * num. If i * i exceeds num, then there's no need to continue checking larger i
 * values. If num is divisible by i, then it's a composite number. If num is not
 * divisible by i, the loop increments i by 6 (since prime numbers greater than
 * 3 follow the pattern 6n ± 1). The next value to check is i + 2. The process
 * repeats until i * i exceeds num. By checking only divisors that are congruent
 * to 5 or 1 modulo 6, the loop reduces the number of checks needed to determine
 * primality, making the primality testing process more efficient.
 * 
 * If this optimization is a bit confusing, you can stick with a simpler loop
 * that checks divisibility by all odd numbers from 3 up to the square root of
 * num. The optimization in the code is just one way to make the primality
 * testing faster for larger numbers.
 */