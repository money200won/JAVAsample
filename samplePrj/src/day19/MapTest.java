package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {


	public static void main(String[] args) {

		Map<String, String> map = new HashMap();
		map.put("BTG01", "00100");
		map.put("BTG01", "10101");// 키 값이 일치하므로 맨 마지막에 들어간 것이 뜬다.
		map.put("BCC02", "10101");// 맵 구조는 키값과 밸류값을 =으로 이어붙여놓고 출력한다.
		map.put("POWE3", "10101");
		map.put("XRP111", "10101");
		map.put("GO2", "30101");
		map.put("GTC12", "80101");
		map.put("NTC52", "19101");
		map.put("HTC12", "10301");
		map.put("JTC82", "10111");
		map.put("OTCr2", "10106");
		map.put("ATC42", "14101");
		map.put("CTC02", "10701");
		map.put("RTC02", "101891");
		map.put("QTC02", "193101");

		System.out.println("로그인 처리");
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		boolean flag = true;
		while (flag) {
			System.out.println("아이디를 입력하세요. ID :_");
			String id = scanner.nextLine();
			System.out.println("비번을 입력하세요. PW :_");
			String pw = scanner.nextLine();
			if (map.containsKey(id)) {
				if (map.get(id).equals(pw)) {
					System.out.println("환영합니다.");
					flag = false;
					count = 0;
					
				} else {
					System.out.println("비번이 틀렸습니다." + count + "회 입력 실패");
					count++;
				}
			} else {
				System.out.println("아이디가 없습니다. 회원가입하세요.");
			}
		}

		/*
		 * System.out.println(map); 
		 * System.out.println(map.get("BTG01"));//get을 이용한 key값의 value 찾기
		 * 
		 * System.out.println(map.keySet());//키 이름만 추출하는 keyset
		 *  Set<String> keys = map.keySet(); 
		 *  Iterator<String> it = keys.iterator(); 
		 *  while (it.hasNext()) 
		 *  { String keydata = (String) it.next();
		 * System.out.println("ID: "+keydata+", PASSWORD: "+map.get(keydata)); }
		 */
	}

}
