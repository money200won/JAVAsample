package day2;

import java.util.Scanner;

public class P40 {

	public static void main(String[] args) {
	//Ű����κ��� �޼����� �Է¹޴� system.in
	
		Scanner input = null;
	//��ĳ�ʿ� ��ǲ�̶�� ������ ����� ���ξȿ� �ִ°Ŷ� null�� �ʱ�ȭ
	//���� �����̱� ������ �ʱ�ȭnull�̶� �޸𸮿� �ø��� new�� �ʿ�
		input = new Scanner(System.in);
	//���ɳʿ� ��ǲ ��ü�� �����
		System.out.print("�л� �̸��� �Է��ϼ��� :_");
		String name = input.nextLine();
		
		System.out.print("������ �Է��ϰԿ� ex)90 _");
		int score = input.nextInt();
		input.nextLine();
		//���⼭ �߻��� �� �ִ� �������� ���Ͱ� ���� �����ְ� �ȴ�.
		//�׷��� ���͸� �����ִ�input.nextLine();����� �߰��� �Է��ؾ��ϴ� ������ �ִ�.
		//int score = Integer.parseInt(input.nextLine());
		//���� �Է��� ���ڿ��� ������ �ٽ� ��ȯ�Ǿ���ϴ� ��� �̷��� �ϰ�
		//�׳� ������ �Է��ϰ� ���� ���� input.nextInt�� �ϸ� �ȴ�.
	//String name = "ȫ�浿";
	//���� �����Ͷ� String name = new string ("ȫ�浿");�̰� ������
	//�����ص� ������ Ư���� ��찡 String �ʹ� ���� �Ἥ
		System.out.printf("�̸�: %s, ���� %d %n",name,score);
	//%s string���� �´� %d int���̿´� %n �ٹٲ�
		input.close();
	//���̻� �Է��� �����ʴ´�.
		input = null;
		
	}

}
