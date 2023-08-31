package codeforces.p800;

import java.util.Scanner;
/*
 * 
 * Time Complexity: O(k) where k is the position of the desired element.
Space Complexity: O(1)
Keep in mind that while the time complexity might seem to be linear with respect to the input k, 
it's important to note that the condition of skipping elements might cause the actual number of iterations 
to be less than k in most cases.
This makes the algorithm more efficient than a simple linear scan of k elements.
 */

public class DislikeOfThree {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int e;
	
		while (n-- > 0) {
			e = s.nextInt();
			sol(e);
		}

	}

	private static void sol(int e) {
		 int count = 0;  // Counter to keep track of elements meeting conditions
         int num = 1;     // Current integer to check
         
         while (count < e) {
             if (num % 3 != 0 && num % 10 != 3) {
                 count++;
             }
             num++;
         }
         System.out.println(num-1);
		
	}
}
