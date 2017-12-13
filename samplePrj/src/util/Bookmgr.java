package util;

public class Bookmgr {
	Book[] booklist = new Book[100];
	static int count = 0;

	public Bookmgr() {
	}

	public Bookmgr(Book[] data) {
		System.arraycopy(data, 0, booklist, count, data.length);
		count = count + data.length;
	}

	public void search(String Searchname){
		for (int i = 0; i < count; i++) {
		if (Searchname==booklist[i].getTitle()){
			System.out.println(i);
		}
		}
	}

	public void addBook(Book book) {

		if (count <= booklist.length) {
			booklist[count] = book;
			count++;
		}
	}

	public void printBooklist() {
		for (int i = 0; i < count; i++) {
			System.out.print(booklist[i].getTitle());
			System.out.println(booklist[i].getPrice());
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
}
