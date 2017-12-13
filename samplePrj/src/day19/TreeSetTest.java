package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		set.add("java 09");
		set.add("java 02");
		set.add("java 06");
		set.add("java 01");//들어간 순서가 정렬되어있다.
		set.add("java 01");//중복을 허용하지 않는다.중복이 나타나면 가장 나중에 들어온 중복으로 처리한다.
		
		System.out.println(set);
		set.remove("java 02");
		System.out.println(set);
		
		Iterator<String> it1 = set.iterator();
		while (it1.hasNext()) {
			String data = it1.next();
			System.out.println(data);
			System.out.println(data.substring(data.length()-2));
			
		}
		
		Iterator<String> it2 = set.iterator();
		while (it2.hasNext()) {
			Object data = it2.next();
			System.out.println(data);
			//data.substring(data.length()-2); 오브젝트 타입으로 다음 줄을 받으면 subString을 못쓴다.
						
		}
		
		set.add("java 12");
		set.add("java 13");
		set.add("java 14");
		System.out.println(set);
		
		
		
				
	}

}
