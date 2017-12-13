package day20;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class P659 {

	public static void main(String[] args) {
		Properties pros = new Properties();//<String,String>으로 받아왔음
		
		pros.setProperty("java01", "1234");
		pros.setProperty("java02", "5234");
		pros.setProperty("java05", "6234");
		

		System.out.println(pros);
		System.out.println(pros.getProperty("java05"));
		
		Set proset = pros.keySet();//오브젝트로 관리하고 있다.key이름들을 set안에 넣어두는 작업이다.
		Iterator<Object> it = proset.iterator();
		while (it.hasNext()) {
			String data = (String) it.next();
			System.out.println(data);
			System.out.println(pros.getProperty(data));
			
		}
	}

}
