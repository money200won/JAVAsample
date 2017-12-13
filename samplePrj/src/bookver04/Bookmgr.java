package bookver04;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Bookmgr {
	Book[] book;
	private ArrayList<Book> booklist = new ArrayList<Book>();
	Book[] b;
	BookFileController bfc = new BookFileController();
	Scanner input = new Scanner(System.in);

	

	public Bookmgr() throws FileNotFoundException {
		/*
		 * String fileName = "c:/file/booksample.txt";
		 * 
		 * try (Scanner s = new Scanner(new File(fileName))) { while
		 * (s.hasNextLine()) { String readLine = s.nextLine(); String[] bookdata
		 * = readLine.split(","); booklist.add(new Book(bookdata[0].trim(),
		 * Integer.parseInt(bookdata[1].trim()))); } } catch (Exception e) {
		 * System.out.println(e.getMessage()); } finally { }
		 */

	}

	public Bookmgr(Book[] data) {
		for (int i = 0; i < data.length; i++) {
			booklist.add(0, data[i]);
		}
	}

	public void Bookmgrinput(String filePath){
		

		FileReader finput = null;
		BufferedReader binput = null;

		try {
			finput = new FileReader(filePath);
			binput = new BufferedReader(finput);
			String data = "";
			while ((data = binput.readLine()) != null) {
				// System.out.println(data);
				// booklist = new ArrayList<Book>();
				String[] bookdata = data.split(",");
				booklist.add(new Book(bookdata[0].trim(), Integer.parseInt(bookdata[1].trim())));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				if (binput != null) {
					binput.close();
					binput = null;
				}
				if (finput != null) {
					finput.close();
					finput = null;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	// �迭��ġ�˻�
	public int search(String Searchname) {
		int i;
		for (i = 0; i < booklist.size(); i++) {
			if (booklist.get(i).getTitle().equals(Searchname)) {
				// System.out.printf("�ش� å�� %d ��° �迭�� �ֽ��ϴ�.%n", i);
				break;
			}
		}
		return i;
	}

	// �߰�
	public void addBook(String title, int price) {
		for (int i = 0; i < booklist.size(); i++) {
			if (booklist.get(i).getTitle().equals(title)){
				System.out.println("�ش� å�� �̹� �����մϴ�.");
				return;
			}
		}
		booklist.add(new Book(title, price));
	}

	// ����
	public void deleteBook(String bookname) {
		int flag = 0;
		Iterator<Book> it = booklist.iterator();
		while (it.hasNext()) {
			Book data = (Book) it.next();
			if (data.getTitle().equals(bookname)) {
				it.remove();
				System.out.println(data + "�� �����Ǿ����ϴ�.");
				flag++;
			}
		}
		if(flag==0){
		System.out.println("ã���ô� å�� �����ϴ�.");
		}
	}

	// ���
	public void printBooklist() {
		for (int i = 0; i < booklist.size(); i++) {
			System.out.printf("%s\t%s%n", booklist.get(i).getTitle(), booklist.get(i).getPrice());
		}
	}

	// å�̸�����
	public void printTitlelist() {
		for (int i = 0; i < booklist.size(); i++) {
			System.out.println(booklist.get(i).getTitle());
		}
	}

	// �Ѿ�
	public void printTotalprice() {
		int sum = 0;
		for (int i = 0; i < booklist.size(); i++) {
			sum += booklist.get(i).getPrice();
		}
		System.out.println(sum);
	}

	// �̸� �˻�
	public void searchBooklist(String Searchname) {
		int i;
		int c = 0;
		for (i = 0; i < booklist.size(); i++) {
			if (booklist.get(i).getTitle().equals(Searchname)) {
				System.out.printf("�ش� å�� %d ��° �迭�� �ֽ��ϴ�.%n", i);
				System.out.printf("��������[����:%s  ����:%d]%n", booklist.get(i).getTitle(), booklist.get(i).getPrice());
				c++;
			}
		}
		if (c == 0) {
			System.out.println("��û�Ͻ� å�� �����ϴ�.");
		}
	}

	// ����
	public void mod(String bookname) throws NumberFormatException {
		for (int i = 0; i < booklist.size(); i++) {
			if (booklist.get(i).getTitle().equals(bookname)) {
				System.out.println("������ ���Ͻô� ������ �Է����ּ���._���� : 1, ���� : 2");
				int ck = intchecker();
				if (ck != -1) {
					int key = Integer.parseInt(input.nextLine());

					if (key == 1) {
						System.out.println("�ٲ� ������ �Է����ּ���.");
						booklist.get(i).setTitle(input.nextLine().trim());
						booklist.get(i).display();

					} else if (key == 2) {
						System.out.println("�ٲ� ������ �Է����ּ���.");
						int ck2 = intchecker();
						if (ck2 != -1) {
							booklist.get(i).setPrice(Integer.parseInt(input.nextLine().trim()));
							booklist.get(i).display();
						}
					} else {
						System.out.println("1(����)�̳� 2(����)�� �Է����ּ���");
					}
					return;
				}
			}
		}
		System.out.println("ã���ô� å�� �����ϴ�.");
	}

	// ����
	public void sort() {

		// Arrays.sort(booklist);
		Collections.sort(booklist);
		for (int i = 0; i < booklist.size(); i++) {
			System.out.printf("%s\t%s%n", booklist.get(i).getTitle(), booklist.get(i).getPrice());
		}
	}

	// �����Է� ����Ȯ�� �޼ҵ�
	public int intchecker() throws NumberFormatException {
		Scanner input = new Scanner(System.in);
		int ck = -1;
		try {
			ck = Integer.parseInt(input.nextLine().trim());
		} catch (NumberFormatException e) {
			System.out.println("���ڷ� �־��ּ���. ���� �����.");
		} finally {
			return ck;
		}
	}

	public void save(){
		bfc.saveAstxt(booklist, "c://file/booksample.txt");
	}
	
	public void auto(){
	Thread auto = new Thread(new BookAutoSave(booklist));
	auto.start();
	}
	
	
}
