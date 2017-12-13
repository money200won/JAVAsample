package day10;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "";
		String bookname = "";
		int price = 0;
		boolean flag = true;

		Book[] data = { new Book("adhr", 13000), new Book("rook", 20500) };

		Scanner input = new Scanner(System.in);
		Book book = new Book();
		Bookmgr bm = new Bookmgr(data);

		while (flag) {

			System.out.println("===================");
			System.out.println("1.����");
			System.out.println("2.�����������");
			System.out.println("3.������������");
			System.out.println("4.�����˻�");
			System.out.println("5.å ����Ʈ ����");
			System.out.println("6.������������");
			System.out.println("===================");

			System.out.println("������ �۾��� �Է����ּ���._");

			String command = input.nextLine();

			switch (command) {
			case "1":
				System.out.println("�����մϴ�.^^");
				System.exit(0);
			case "2":
				System.out.println("å �̸��� �Է��ϼ���.");
				name = input.nextLine().trim();
				System.out.println("å ������ �Է��ϼ���.");
				price = input.nextInt();
				input.nextLine();
				bm.addBook(new Book(name, price));
				bm.printBooklist();
				break;
			case "3":
				System.out.println("�����Ͻ� å �̸��� �Է��ϼ���.");
				name = input.nextLine().trim();
				bm.deleteBook(name);
				bm.printBooklist();
				break;
			case "4":
				System.out.println("ã�� å �̸��� �Է��ϼ���.");
				name = input.nextLine().trim();
				bm.searchBooklist(name);
				break;
			case "5":
				bm.printBooklist();
				break;
			case "6":
				System.out.println("������ å �̸��� �Է��ϼ���.");
				name = input.nextLine().trim();
				bm.mod(name);
				break;
			default:
				System.out.println("��⿡ ǥ�õ� �۾��� ���ڸ� �Է����ּ���.");
				break;
			}
		}
	}

}
