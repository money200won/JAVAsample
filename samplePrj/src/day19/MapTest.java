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
		map.put("BTG01", "10101");// Ű ���� ��ġ�ϹǷ� �� �������� �� ���� ���.
		map.put("BCC02", "10101");// �� ������ Ű���� ������� =���� �̾�ٿ����� ����Ѵ�.
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

		System.out.println("�α��� ó��");
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		boolean flag = true;
		while (flag) {
			System.out.println("���̵� �Է��ϼ���. ID :_");
			String id = scanner.nextLine();
			System.out.println("����� �Է��ϼ���. PW :_");
			String pw = scanner.nextLine();
			if (map.containsKey(id)) {
				if (map.get(id).equals(pw)) {
					System.out.println("ȯ���մϴ�.");
					flag = false;
					count = 0;
					
				} else {
					System.out.println("����� Ʋ�Ƚ��ϴ�." + count + "ȸ �Է� ����");
					count++;
				}
			} else {
				System.out.println("���̵� �����ϴ�. ȸ�������ϼ���.");
			}
		}

		/*
		 * System.out.println(map); 
		 * System.out.println(map.get("BTG01"));//get�� �̿��� key���� value ã��
		 * 
		 * System.out.println(map.keySet());//Ű �̸��� �����ϴ� keyset
		 *  Set<String> keys = map.keySet(); 
		 *  Iterator<String> it = keys.iterator(); 
		 *  while (it.hasNext()) 
		 *  { String keydata = (String) it.next();
		 * System.out.println("ID: "+keydata+", PASSWORD: "+map.get(keydata)); }
		 */
	}

}
