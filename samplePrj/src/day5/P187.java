package day5;

import java.util.Arrays;
import java.util.Scanner;

public class P187 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���� ���� ������ �Է��ϼ���._");
		
		int[] num;
		
		num = new int[Integer.parseInt(input.nextLine())];
		int i;
		for (i = 0; i < num.length; i++) {
			
			num[i]=(int)(Math.random()*45+1);
			//num[i] = i * 10 + 10; 0��°���� �����ϱ� ������ ó���� +10�� �ʿ��մϴ�.
		}
		/*
		 * num[0]=10; num[1]=20; num[2]=30; num[3]=40; num[4]=50;
		 */
		for (i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
		
		System.out.println("\n========================================");
		
		
		System.out.println(Arrays.toString(num));
		System.out.println(Math.random());//�������� 0���� ũ�ų����� 1���� ���� ������ ��
		System.out.println((int)(Math.random()*45+1));
		//������ 45�� ���Ѱ� ������ ��Ÿ����(0<=����<44)
		
		
		
		
	}

}
