package bookver04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class BookFileController {

	public void saveAsObj(Object obj, String fileName) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(fileName);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			oos.writeObject(obj);
			oos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) {
					oos.close();
					oos = null;
				}
				if (bos != null) {
					bos.close();
					bos = null;
				}
				if (fos != null) {
					fos.close();
					fos = null;
				}
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
	}

	public ArrayList<Book> read(String filePath) throws FileNotFoundException {
		ArrayList<Book> booklist = new ArrayList<Book>();
		FileInputStream finput = null;
		BufferedInputStream binput = null;
		ObjectInputStream oinput = null;
		try {
			finput = new FileInputStream(filePath);
			binput = new BufferedInputStream(finput);
			oinput = new ObjectInputStream(binput);

			String db = "";

			try {
				while ((db = (String) oinput.readObject()) != null) {
					String[] bookdata = db.split(",");
					booklist.add(new Book(bookdata[0].trim(), Integer.parseInt(bookdata[1].trim())));
					System.out.println("저장성공!");
				}
				
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
		return booklist;
	}
	
	
	public void saveAstxt(ArrayList<Book> booklist, String fileName) {
		FileWriter fos = null;
		BufferedWriter bos = null;


		try {
			fos = new FileWriter(fileName);
			bos = new BufferedWriter(fos);

			Iterator it = booklist.iterator();
			
			while (it.hasNext()) {
				Book list = (Book) it.next();
				bos.write(list.getTitle()+","+list.getPrice()+"\n");
			}
			bos.flush();
			


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if (bos != null) {
					bos.close();
					bos = null;
				}
				if (fos != null) {
					fos.close();
					fos = null;
				}
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
