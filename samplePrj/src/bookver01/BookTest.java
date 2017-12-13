package bookver01;

public class BookTest {
	public static void main(String[] args) {
	Book[] data = {new Book("adhr", 13000),new Book("rook", 20500)};
	Book b1 = new Book("Ja Program",10000);
	Book b2 = new Book("Jav Program",20000);
	Book b3 = new Book("Java Program",30000);
	Book b4 = new Book("Java1 Program",40000);
	Book b5 = new Book("Java2 Program",50000);
	
	Bookmgr bookmgr1 = new Bookmgr(data);
	bookmgr1.addBook(b1);
	bookmgr1.addBook(b2);
	bookmgr1.addBook(b3);
	
	System.out.println("======================================");
	
	System.out.println(bookmgr1.search("Ja Program"));
	bookmgr1.deleteBook("Ja Program");
	bookmgr1.printBooklist();
	bookmgr1.printTitlelist();
	bookmgr1.printTotalprice();
	/*
	 * 
	Bookmgr bookmgr2 = new Bookmgr();
	bookmgr2.addBook(b4);
	bookmgr2.addBook(b5);
	
	bookmgr1.printBooklist();
	bookmgr1.printTotalprice();
	 */
}
}
