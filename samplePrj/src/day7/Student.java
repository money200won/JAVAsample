package day7;

import java.util.Arrays;

public class Student {
	String name;
	int[] score = new int[3];
	int sum;
	double avg;

	public void proc() {
		sum=0;
		//���μ����� �ι� ȣ���ϸ� �հ谡 ������ �հ迡 �ٽ� ���ϴ� ������ �ذ��ϱ� ���� �κ�
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		avg = sum / score.length;
	}
	public void display(){
		System.out.println("=================================");
		System.out.println("����ó�� �����");
		System.out.println("�̸�_"+name);
		System.out.println("����_"+Arrays.toString(score));
		System.out.println("����_"+sum);
		System.out.println("���_"+avg);
		System.out.println("=================================");
		
		}
}
