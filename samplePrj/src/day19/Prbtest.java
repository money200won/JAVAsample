package day19;

import java.util.HashSet;
import java.util.Set;

public class Prbtest {

	public static void main(String[] args) {
		Set<String> ss = new HashSet();
		String str = "PROD-001#X-note#Samsung#3#6000000";
		
		int tag = str.indexOf("#");
		int tag1 = str.lastIndexOf("#");
		ss.add(str.substring(0, tag));
		System.out.println(str.charAt(0));
		System.out.println(ss);
		System.out.println(tag);
		System.out.println(tag1);

	}

}
