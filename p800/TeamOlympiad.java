package codeforces.p800;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Time - O(n)
 * Space - O(n) size of the max list
 * 
 */
public class TeamOlympiad {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int e;
		List<Integer> programmers = new ArrayList<>();
		List<Integer> maths = new ArrayList<>();
		List<Integer> physicals = new ArrayList<>();
		int index = 1;
		while (n-- > 0) {
			e = s.nextInt();
			if (e == 1) {
				programmers.add(index);
			} else if (e == 2) {
				maths.add(index);
			} else {
				physicals.add(index);
			}
			index++;
		}
		int maxTeams = Math.min(Math.min(programmers.size(), maths.size()), physicals.size());
		System.out.println(maxTeams);
		for (int i = 0; i < maxTeams; i++) {
			System.out.println(programmers.get(i) + " " + maths.get(i) + " " + physicals.get(i));
		}

	}

}
