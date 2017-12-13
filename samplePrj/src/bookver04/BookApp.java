package bookver04;

import java.io.FileNotFoundException;
import java.util.ArrayList;
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
				bm.Bookmgrinput("c://file/booksample.txt");
				bm.auto();
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
			System.out.println("8.저장");
			System.out.println("===================");

			System.out.println("수행할 작업을 입력해주세요._");

			String command = input.nextLine();

			switch (command) {
			case "1":
				System.out.println("종료합니다.^^");
				System.out.println("종료하기 전에 변경사항을 저장할까요?(Y/N)");
				String yn =input.nextLine();
				if (yn.equals("y")||yn.equals("Y")){
					bm.save();
					System.out.println("바이바이~");
					System.exit(0);
				}else if(yn.equals("n")||yn.equals("N")){
					System.out.println("바이바이~");
					System.exit(0);
				}else{
					System.out.println("Y나 N 중에 하나만 입력해주세요.");
				}
				
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
			case "8":
				bm.save();
				break;
			default:
				System.out.println("상기에 표시된 작업의 숫자만 입력해주세요.");
				break;
			}
		}
	}

}
