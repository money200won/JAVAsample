package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("뽑을 숫자 개수를 입력하세요._");

		int x = Integer.parseInt(input.nextLine());
		int[] num = new int[x];
		int i;
		int j;
		flag: for (i = 0; i < num.length; i++) {
			j = (int) ((Math.random() * 45) + 1);
			for (int n = 0; n <= i; n++) {
				if (j == num[n]) {
					i--;
					continue flag;
				}
			}
			num[i] = j;

		}
		System.out.print(Arrays.toString(num));

	}
}
