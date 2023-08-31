package codeforces.p800;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Time - O(1)
 * Space - O(1)
 *
 */
public class SoftDrinking {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // friends
		int k = s.nextInt(); // bottles
		int l = s.nextInt(); // liters
		int c = s.nextInt(); // lime
		int d = s.nextInt(); // slices
		int p = s.nextInt(); // salt
		int nl = s.nextInt(); // required ml of drink to make a toast
		int np = s.nextInt(); // required g of salt to make a toast
		int[] arr = new int[3];
		arr[0] = (k * l) / nl;
		arr[1] = c * d;
		arr[2] = p/np;
		Arrays.sort(arr);
		System.out.println(arr[0]/n);
	}
}



