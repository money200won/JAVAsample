package day20;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class P659 {

	public static void main(String[] args) {
		Properties pros = new Properties();//<String,String>���� �޾ƿ���
		
		pros.setProperty("java01", "1234");
		pros.setProperty("java02", "5234");
		pros.setProperty("java05", "6234");
		

		System.out.println(pros);
		System.out.println(pros.getProperty("java05"));
		
		Set proset = pros.keySet();//������Ʈ�� �����ϰ� �ִ�.key�̸����� set�ȿ� �־�δ� �۾��̴�.
		Iterator<Object> it = proset.iterator();
		while (it.hasNext()) {
			String data = (String) it.next();
			System.out.println(data);
			System.out.println(pros.getProperty(data));
			
		}
	}

}
