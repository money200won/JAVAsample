package bookver04;

import java.util.ArrayList;

public class BookAutoSave implements Runnable {
	ArrayList<Book> booklist;
	BookFileController bfc = new BookFileController();
	private long lastsave = System.currentTimeMillis();

	public BookAutoSave(ArrayList<Book> booklist) {
		super();
		this.booklist = booklist;
	}

	private boolean needsave() {

		if (System.currentTimeMillis() - lastsave >= 60 * 1000) {
			lastsave = System.currentTimeMillis();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void run() {
		while (true){
			if (needsave()) {
				bfc.saveAstxt(booklist, "c://file/booksample.txt");
				//System.out.println("자동저장을 해버렸어!");
			}
		}
	}

}
