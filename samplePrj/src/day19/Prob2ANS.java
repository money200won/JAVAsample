package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prob2ANS {

	public static void main(String[] args) {
		String str = "PROD-001#X-note#Samsung#3#6000000#";
		Set<String> strs = stringSplit(str, "#");
		System.out.println("=== 문자열 처리 결과 ===");

		Iterator<String> it = strs.iterator();

		while (it.hasNext()) {

			String words = (String) it.next();
			System.out.println(words);
		}

	}

	private static Set<String> stringSplit(String str1, String str2) {
		Set<String> set = new HashSet();
		int p = -1;

		// p = str1.indexOf("#", p+1);
		// set.add(str1.substring(0,p));

		do {
			if (p + 1 >= str1.length())
				break;
			;
			set.add(str1.substring(p + 1, p = str1.indexOf("#", p + 1)));
		} while (p != -1);

		return set;

	}
}
