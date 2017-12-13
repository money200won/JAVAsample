package day20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.regex.Pattern;

public class P661 {

	public static void main(String[] args) {
		Properties p = new Properties();
		
		try {
			p.load(new FileInputStream("dbinfo.txt"));
			String url;
			String driver;
			String username;
			String pw;
			
			url=p.getProperty("url");
			driver=p.getProperty("driver");
			username=p.getProperty("user");
			pw=p.getProperty("pw");
			
			p.storeToXML(new FileOutputStream("data.xml"),"DB info");
			System.out.println("dbinfo 정보가 data.xml로 저장되었습니다.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(p);
		System.out.println("Main End");

	}

}
