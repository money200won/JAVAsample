package day6;

import java.util.Arrays;

public class P211 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int two[][] = { { 3, 2, 1 }, { 5, 4, 3, 2, 1 }, { 1, 2 } };

		for (int i = 0; i <= two.length - 1; i++) {
			for (int j = 0; j <= two[i].length - 1; j++) {

				System.out.print(two[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
