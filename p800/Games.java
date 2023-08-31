package codeforces.p800;

import java.util.Scanner;

public class Games {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] teamsUniformColor = new int[n][2];
		for (int i = 0; i < n; i++) {
			teamsUniformColor[i][0] = s.nextInt();
			teamsUniformColor[i][1] = s.nextInt();
		}
		//
		int c = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j && teamsUniformColor[i][0] == teamsUniformColor[j][1]) {
					c++;
				}
			}
		}
		System.out.println(c);
	}

}

/*
T - O(n)
S - O(1)
*/