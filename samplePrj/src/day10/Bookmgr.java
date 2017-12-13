package day10;

import java.util.*;

public class Bookmgr {
	Book[] booklist = new Book[100];
	static int count = 0;
	Scanner input = new Scanner(System.in);
	
	public Bookmgr() {
	}

	public Bookmgr(Book[] data) {
		System.arraycopy(data, 0, booklist, count, data.length);
		count = count + data.length;
	}//기존의 생성되어있는 book배열을 먼저 등록해놓는 생성자 함수

	public int search(String Searchname) {
		int i;
		for (i = 0; i < count; i++) {
			if (booklist[i].getTitle().equals(Searchname)) {
				//System.out.printf("해당 책은 %d 번째 배열에 있습니다.%n", i);
				break;
			}
		}
		return i;
	}

	public void addBook(Book book) {

		if (count <= booklist.length) {
			booklist[count] = book;
			count++;
		}
	}
	
	public void deleteBook(String bookname){
		for (int i = 0; i < count; i++) {
		if (booklist[i].getTitle().equals(bookname)) {
			System.arraycopy(booklist, this.search(bookname)+1, booklist, this.search(bookname), count-this.search(bookname));
			count--;
			return;
			}
		}
		System.out.println("찾으시는 책이 없습니다.");
		
	}
	
	
	
	public void printBooklist() {
		for (int i = 0; i < count; i++) {
			System.out.printf("%s\t%s%n",booklist[i].getTitle(),booklist[i].getPrice());
		}
	}

	public void printTitlelist() {
		for (int i = 0; i < count; i++) {
			System.out.println(booklist[i].getTitle());
		}
	}

	public void printTotalprice() {
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += booklist[i].getPrice();
		}
		System.out.println(sum);
	}
	
	
	public void searchBooklist(String Searchname) {
		int i;
		int c = 0;
		for (i = 0; i < count; i++) {
			if (booklist[i].getTitle().equals(Searchname)) {
				System.out.printf("해당 책은 %d 번째 배열에 있습니다.%n", i);
				System.out.printf("서지정보[서명:%s  가격:%d]%n",booklist[i].getTitle(),booklist[i].getPrice());
				c++;
			}
		}
		if (c==0){
			System.out.println("요청하신 책은 없습니다.");
		}
	}
	public void mod(String bookname){
		for (int i = 0; i<count;i++){
			if (booklist[i].getTitle().equals(bookname)){
				System.out.println("수정을 원하시는 정보를 입력해주세요._서명 : 1, 가격 : 2");
				int key = Integer.parseInt(input.nextLine());
				if (key==1){
					System.out.println("바꿀 서명을 입력해주세요.");
					booklist[i].setTitle(input.nextLine().trim());
					booklist[i].display();
				}else if (key==2){
					System.out.println("바꿀 가격을 입력해주세요.");
					booklist[i].setPrice(Integer.parseInt(input.nextLine()));
					booklist[i].display();
				}
				return;
			}
		}
		System.out.println("찾으시는 값이 없습니다.");
	}
	
	
	
	
	
}
