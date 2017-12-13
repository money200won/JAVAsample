package day10;

import java.util.*;

public class TestMod {
	Book[] booklist = new Book[100];
	static int count = 0;
	Scanner input = new Scanner(System.in);
	
	public TestMod() {
	}

	public TestMod(Book[] data) {
		System.arraycopy(data, 0, booklist, count, data.length);
		count = count + data.length;
	}
	
	public void mod(String bookname){
		for (int i = 0; i<count;i++){
			if (booklist[i].equals(bookname)){
				System.out.println("������ ���Ͻô� ������ �Է����ּ���._���� : 1, ���� : 2");
				int key = Integer.parseInt(input.nextLine());
				if (key==1){
					System.out.println("�ٲ� ������ �Է����ּ���.");
					booklist[i].setTitle(input.nextLine());
					booklist[i].display();
				}else if (key==2){
					System.out.println("�ٲ� ������ �Է����ּ���.");
					booklist[i].setPrice(Integer.parseInt(input.nextLine()));
					booklist[i].display();
				}
			}
		}
	}
	
	
	
}
