package codeforces.p800;

import java.util.Arrays;
import java.util.Scanner;

public class RestoringThreeNumbers {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int arr[] = new int[4];
		arr[0] = s.nextInt();
		arr[1] = s.nextInt();
		arr[2] = s.nextInt();
		arr[3] = s.nextInt();
		/*
		 * 
		 * a+b = x1 a+c = x2 b+c = x3 a+b+c = x4
		 * 
		 * x4 = x1 + c
		 * 
		 * => c = x4 - x1 => b = x4 - x2 => a = x4 - x3
		 *
		 */
		Arrays.sort(arr);
		int c = arr[3] - arr[0];
		int b = arr[3] - arr[1];
		int a = arr[3] - arr[2];

		System.out.println(a + " " + b + " " + c);
	}
}