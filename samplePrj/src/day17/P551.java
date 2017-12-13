package day17;

import java.io.File;
import java.text.MessageFormat;
import java.util.Scanner;

public class P551 {

	public static void main(String[] args) throws Exception {
		String tableName = "CUST_INFO";
		String fileName = "data4.txt";
		String msg = "INSERT INTO "+ tableName + "VALUES (이름: {0},전화: {1},나이: {2},생일: {3});";
		
		Scanner scanner = new Scanner(new File(fileName));
		
		String pattern = "{0},{1},{2},{3}";
		MessageFormat mf = new MessageFormat(pattern);
		
		while (scanner.hasNextLine()){
			String line = scanner.nextLine();
			Object[] objs = mf.parse(line);
			System.out.println(MessageFormat.format(msg, objs));
		}
		
		scanner.close();

	}

}
