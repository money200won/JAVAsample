package day6;

import java.util.Arrays;

public class P201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 45)+1;
		}
		
		System.out.println("���� num");
		System.out.println(Arrays.toString(num));
		
		int[] num2 = new int[num.length];
		System.arraycopy(num, 0, num2, 0, num.length);
		//num2 = num;
		//�̷������� �ϸ� ��ġ num2�� num�� ��ܼ� �ȹٲ��ó�� ��������
		//��� �̰� �ּҸ� ���� ���̱� ������ �ᱹ num2�� num�� ��ȭ�ϰ� ���� ���� �ٶ󺸰� �ȴ�.
		//�׷��⶧���� �̷��� �ϸ� ����� �ٲ�� ���� �����ϰ� �־ ���� �ٲ���ְ� �ȴ�.
		int tmp;
		for (int i=0; i<num.length-1; i++){
			for (int j=i+1; j<num.length; j++){
			if (num[i]<num [j]){
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
