package codeforces.p800.sep;

import java.util.Scanner;

public class VanyaCubes {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int h = 0;
		int sum = 0;
		while(true) {
			for(int i = 1; i <= h; i++) {
				sum += i;
			}
			if(sum <= n) {
				//System.out.println(sum);
				h++;
			} else {
				break;
			}
			
		}
		System.out.println(h-1);
	}

}
