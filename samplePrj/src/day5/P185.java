package day5;

public class P185 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		String[] names = new String[3];// �迭������ �ٷ�
		for(String data1:names){
		System.out.print(names);//String�� �ʱ�ȭ �Ǹ� null�� ����־�
		}
		System.out.println("\n=====================");
		
		char[] chas;
		chas = new char[5];
		System.out.print(chas[0]+",");//String�� �ʱ�ȭ �Ǹ� null�� ����־�

		int[] score;
		score = new int[5];// �迭����
		for (i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");// �⺻������ �ʱ�ȭ�� �̷���� �����ȿ� 0�� �ֳ���
		}
		System.out.println("\n===========================");
		//���γ��� for roof 
		for(int data:score){
			System.out.print(data+" ");
		}
		
	}

}
