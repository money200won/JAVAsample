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
	}//������ �����Ǿ��ִ� book�迭�� ���� ����س��� ������ �Լ�

	public int search(String Searchname) {
		int i;
		for (i = 0; i < count; i++) {
			if (booklist[i].getTitle().equals(Searchname)) {
				//System.out.printf("�ش� å�� %d ��° �迭�� �ֽ��ϴ�.%n", i);
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
		System.out.println("ã���ô� å�� �����ϴ�.");
		
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
				System.out.printf("�ش� å�� %d ��° �迭�� �ֽ��ϴ�.%n", i);
				System.out.printf("��������[����:%s  ����:%d]%n",booklist[i].getTitle(),booklist[i].getPrice());
				c++;
			}
		}
		if (c==0){
			System.out.println("��û�Ͻ� å�� �����ϴ�.");
		}
	}
	public void mod(String bookname){
		for (int i = 0; i<count;i++){
			if (booklist[i].getTitle().equals(bookname)){
				System.out.println("������ ���Ͻô� ������ �Է����ּ���._���� : 1, ���� : 2");
				int key = Integer.parseInt(input.nextLine());
				if (key==1){
					System.out.println("�ٲ� ������ �Է����ּ���.");
					booklist[i].setTitle(input.nextLine().trim());
					booklist[i].display();
				}else if (key==2){
					System.out.println("�ٲ� ������ �Է����ּ���.");
					booklist[i].setPrice(Integer.parseInt(input.nextLine()));
					booklist[i].display();
				}
				return;
			}
		}
		System.out.println("ã���ô� ���� �����ϴ�.");
	}
	
	
	
	
	
}
