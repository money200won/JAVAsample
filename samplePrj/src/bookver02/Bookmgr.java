package bookver02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Bookmgr {
	Book[] book;
	ArrayList<Book> booklist = new ArrayList<Book>();
	Book[] b;
	Scanner input = new Scanner(System.in);

	public Bookmgr() throws FileNotFoundException {
		String fileName = "c:/file/booksample.txt";
		try (Scanner s = new Scanner(new File(fileName))) {
			while (s.hasNextLine()) {
				String readLine = s.nextLine();
				String[] bookdata = readLine.split(",");
				booklist.add(new Book(bookdata[0].trim(), Integer.parseInt(bookdata[1].trim())));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
		}

	}

	public Bookmgr(Book[] data) {
		for (int i = 0; i < data.length; i++) {
			booklist.add(0, data[i]);
		}
	}

// 배열위치검색
	public int search(String Searchname) {
		int i;
		for (i = 0; i < booklist.size(); i++) {
			if (booklist.get(i).getTitle().equals(Searchname)) {
				// System.out.printf("해당 책은 %d 번째 배열에 있습니다.%n", i);
				break;
			}
		}
		return i;
	}

// 추가
	public void addBook(String title, int price) {

		booklist.add(new Book(title, price));
	}

// 삭제
	public void deleteBook(String bookname) {
		Iterator<Book> it = booklist.iterator();
		while (it.hasNext()) {
			Book data = (Book) it.next();
			if (data.getTitle().equals(bookname)) {
				it.remove();
				System.out.println(data + "이 삭제되었습니다.");

			}
		}
		System.out.println("찾으시는 책이 없습니다.");
	}

// 목록
	public void printBooklist() {
		for (int i = 0; i < booklist.size(); i++) {
			System.out.printf("%s\t%s%n", booklist.get(i).getTitle(), booklist.get(i).getPrice());
		}
	}

// 책이름종합
	public void printTitlelist() {
		for (int i = 0; i < booklist.size(); i++) {
			System.out.println(booklist.get(i).getTitle());
		}
	}

// 총액
	public void printTotalprice() {
		int sum = 0;
		for (int i = 0; i < booklist.size(); i++) {
			sum += booklist.get(i).getPrice();
		}
		System.out.println(sum);
	}

// 이름 검색
	public void searchBooklist(String Searchname) {
		int i;
		int c = 0;
		for (i = 0; i < booklist.size(); i++) {
			if (booklist.get(i).getTitle().equals(Searchname)) {
				System.out.printf("해당 책은 %d 번째 배열에 있습니다.%n", i);
				System.out.printf("서지정보[서명:%s  가격:%d]%n", booklist.get(i).getTitle(), booklist.get(i).getPrice());
				c++;
			}
		}
		if (c == 0) {
			System.out.println("요청하신 책은 없습니다.");
		}
	}

	
	
	
// 수정
	public void mod(String bookname) throws NumberFormatException {
		for (int i = 0; i < booklist.size(); i++) {
			if (booklist.get(i).getTitle().equals(bookname)) {
				System.out.println("수정을 원하시는 정보를 입력해주세요._서명 : 1, 가격 : 2");
				int ck = intchecker();
				if(ck!=-1){
					int key = Integer.parseInt(input.nextLine());

					if (key == 1) {
						System.out.println("바꿀 서명을 입력해주세요.");
						booklist.get(i).setTitle(input.nextLine().trim());
						booklist.get(i).display();
						
					} else if (key == 2) {
						System.out.println("바꿀 가격을 입력해주세요.");
						int ck2 = intchecker();
						if(ck2!=-1){
							booklist.get(i).setPrice(Integer.parseInt(input.nextLine().trim()));
							booklist.get(i).display();
						}
					} else {
						System.out.println("1(서명)이나 2(가격)를 입력해주세요");
					}
					return;
				}
			}
		}
		System.out.println("찾으시는 책이 없습니다.");
	}
//정렬
	public void sort() {

		// Arrays.sort(booklist);
		Collections.sort(booklist);
		for (int i = 0; i < booklist.size(); i++) {
			System.out.printf("%s\t%s%n", booklist.get(i).getTitle(), booklist.get(i).getPrice());
		}
	}
//정수입력 예외확인 메소드
	public int intchecker() throws NumberFormatException {
		Scanner input = new Scanner(System.in);
		int ck=-1;
		try{
			ck = Integer.parseInt(input.nextLine().trim());
		}catch (NumberFormatException e){
			System.out.println("숫자로 넣어주세요. 글자 말고요.");
		}finally{
			return ck;
		}
	}

}
