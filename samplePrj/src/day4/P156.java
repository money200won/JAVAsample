package day4;

import java.util.Scanner;

public class P156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String command;
		Scanner input = new Scanner(System.in);
		
		boolean flag = true;
		while (flag) {

			System.out.println("===== �޴� ���α׷�=====");
			System.out.println("+++++��� ����+++++");
			System.out.println("1. insert(����)\n");
			System.out.println("2. delete(����)\n");
			System.out.println("3. update(����)\n");
			System.out.println("4. quit(����)\n");
			System.out.println("=====================");
			System.out.println("������ ��� ��ȣ�� �Է��ϼ���._ ");

			command = input.nextLine();

			switch (command) {
			case "1":
				System.out.println("����!");
				break;
			case "2":
				System.out.println("����!");
				break;
			case "3":
				System.out.println("����!");
				break;
			case "4":
				System.out.println("����!");
				flag = !flag;
				break;
			default:
				System.out.println("1,2,3,4 �߿� �ϳ��� �Է��ϼ���.");
				break;
			}
		}
	}
}
