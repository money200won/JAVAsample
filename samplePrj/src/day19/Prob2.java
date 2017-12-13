package day19;

import java.util.*;

public class Prob2 {
	public static void main(String[] args) {
		String str = "PROD-001#X-note#Samsung#3#6000000";
		Set<String> strs = stringSplit(str, "#");
		System.out.println("=== 문자열 처리 결과 ===");

		Iterator<String> it = strs.iterator();

		while (it.hasNext()) {

			String words = (String) it.next();
			System.out.println(words);

		} // strs 를 아래와같이 출력되도록 코드를 완성하세요

	}

	private static Set<String> stringSplit(String str1, String str2) {
		Set<String> ss = new HashSet();
		String sent = str1;
		int j = 0;
		for (int i = 0; i < str1.length(); i++) {
			String word = "" + str1.charAt(i);
			if (word.equals(str2)) {
				ss.add(sent.substring(j, i));
				j = i + 1;
				// System.out.println(sent.substring(j, i));
			} else {
			}
		}
		ss.add(sent.substring(j));

		return ss;
	}
}
