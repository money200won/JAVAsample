package bookver02;

import java.io.FileNotFoundException;
import java.util.Arrays;
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
		
		Bookmgr bm = null;
			try{
				bm = new Bookmgr();
			}catch (FileNotFoundException e) {
				bm = new Bookmgr(data);
				System.out.println("찾으시는 파일이 없어 기본 데이터를 불러옵니다.");				
			}
			
		while (flag) {

			System.out.println("===================");
			System.out.println("1.종료");
			System.out.println("2.서지정보등록");
			System.out.println("3.서지정보삭제");
			System.out.println("4.서지검색");
			System.out.println("5.책 리스트 보기");
			System.out.println("6.서지정보수정");
			System.out.println("7.서지정렬");
			System.out.println("===================");

			System.out.println("수행할 작업을 입력해주세요._");

			String command = input.nextLine();

			switch (command) {
			case "1":
				System.out.println("종료합니다.^^");
				System.exit(0);
			case "2":
				System.out.println("책 이름을 입력하세요.");
				name = input.nextLine().trim();
				System.out.println("책 가격을 입력하세요.");
				price = input.nextInt();
				input.nextLine();
				bm.addBook(name, price);
				bm.printBooklist();
				break;
			case "3":
				System.out.println("삭제하실 책 이름을 입력하세요.");
				name = input.nextLine().trim();
				bm.deleteBook(name);
				bm.printBooklist();
				break;
			case "4":
				System.out.println("찾을 책 이름을 입력하세요.");
				name = input.nextLine().trim();
				bm.searchBooklist(name);
				break;
			case "5":
				bm.printBooklist();
				break;
			case "6":
				System.out.println("수정할 책 이름을 입력하세요.");
				name = input.nextLine().trim();
				bm.mod(name);
				break;
			case "7":
				bm.sort();
				break;
			default:
				System.out.println("상기에 표시된 작업의 숫자만 입력해주세요.");
				break;
			}
		}
	}

}
