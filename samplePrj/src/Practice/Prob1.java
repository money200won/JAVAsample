package Practice;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Prob1 {

	public static void main(String[] args) {

		String size = JOptionPane.showInputDialog("1~45���� ���ڸ� �Է����ּ���.");
				System.out.println(size);
		int[] number = new int[Integer.parseInt(size)];
				System.out.println(Arrays.toString(number));
		
		
		// args�� �̿��� �Է°� �Է� ������ ���� ��å
		
		if (args.length == 0) {
			System.out.println("���� �Է����ּ���.");
			return;
			// ���� ����

		}else if (args.length>1){
			System.out.println("�˼����� ������ �߻��Ͽ����ϴ�. �����ڿ� �����ϼ���.");
			return;
		}
		for (int a = 0; a < args[0].length(); a++) {
			if (args[0].charAt(a) >= 'A' && args[0].charAt(a) <= 'z' || args[0].charAt(a) == ' ') {
				System.out.println("���ڸ� �Է����ּ���.");
				return;
			}
			// ���� ����

		}
		if (Integer.parseInt(args[0]) > 45) {
			System.out.println("45 ���� ���ڸ� �����մϴ�.");
			return;
		}
		// 45���� ����

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
