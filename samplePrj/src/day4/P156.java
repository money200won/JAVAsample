package day4;

import java.util.Scanner;

public class P156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String command;
		Scanner input = new Scanner(System.in);
		
		boolean flag = true;
		while (flag) {

			System.out.println("===== 메뉴 프로그램=====");
			System.out.println("+++++명령 선택+++++");
			System.out.println("1. insert(삽입)\n");
			System.out.println("2. delete(삭제)\n");
			System.out.println("3. update(수정)\n");
			System.out.println("4. quit(종료)\n");
			System.out.println("=====================");
			System.out.println("수행할 명령 번호를 입력하세요._ ");

			command = input.nextLine();

			switch (command) {
			case "1":
				System.out.println("삽입!");
				break;
			case "2":
				System.out.println("삭제!");
				break;
			case "3":
				System.out.println("수정!");
				break;
			case "4":
				System.out.println("종료!");
				flag = !flag;
				break;
			default:
				System.out.println("1,2,3,4 중에 하나를 입력하세요.");
				break;
			}
		}
	}
}
