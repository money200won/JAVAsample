package day6;

import java.util.Arrays;

public class Prob1 {

	public static void main(String[] args) {
		// args�� �̿��� �Է°� �Է� ������ ���� ��å

		if (args.length == 0) {
			System.out.println("���� �Է����ּ���.");
			return;
		}

		int[] num = new int[Integer.parseInt(args[0])];

		flag: for (int i = 0; i < num.length; i++) {
			int j = (int) ((Math.random() * 45) + 1);
			for (int n = 0; n <= i; n++) {
				if (j == num[n]) {
					i--;
					continue flag;
				}
			}
			num[i] = j;
		}

		/*
		 * System.out.println("���� num");
		 * System.out.println(Arrays.toString(num));
		 */

		int[] num2 = new int[num.length];
		System.arraycopy(num, 0, num2, 0, num.length);

		// num2 = num;
		/*
		 * �̷������� �ϸ� ��ġ num2�� num�� ��ܼ� �ȹٲ��ó�� �������� ��� �̰� �ּҸ� ���� ���̱� ������ �ᱹ num2��
		 * num�� ��ȭ�ϰ� ���� ���� �ٶ󺸰� �ȴ�. �׷��⶧���� �̷��� �ϸ� ����� �ٲ�� ���� �����ϰ� �־ ���� �ٲ���ְ�
		 * �ȴ�.
		 */

		int tmp;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}

		System.out.println("����");
		System.out.println(Arrays.toString(num2));
		System.out.println("���");
		System.out.println(Arrays.toString(num));
	}

}
