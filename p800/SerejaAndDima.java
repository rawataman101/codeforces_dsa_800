package codeforces.p800;

import java.util.Scanner;

/**
 * Time - O(n)
 * Space - O(n)
 *
 */
public class SerejaAndDima {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		solution(arr, n);
	}

	// two pointer approach
	
	private static void solution(int[] arr, int n) {
		int left = 0, right = n - 1;
		int score1 = 0, score2 = 0;
		int turn = 0; // first turn is Sereja
		/*
		 * turn 0 is Sereja's turn turn 1 is Dima's turn
		 */
		while (left <= right) {
			if (arr[left] > arr[right]) {
				if (turn == 0) {
					score1 += arr[left];
				} else {
					score2 += arr[left];
				}
				left++;
			} else {
				if (turn == 0) {
					score1 += arr[right];
				} else {
					score2 += arr[right];
				}
				right--;
			}
			turn = 1 - turn;
		}
		System.out.println(score1 + " " + score2);
	}
}
