package day7;

import Practice.Prob3;

public class Prob2 {
	int j=1;
	public static String rightPad(String str, int size, char padChar) {
		/*  ���⿡ ���α׷��� �ϼ��Ͻʽÿ�. */
		
		String result="";
		if (str.length()<size){
			for (int i =0; i<size-str.length();i++){
				result += padChar;
			}
		}
		return str+result;	
	}
	public static void main(String[] args) {
		Prob2 p = new Prob2();
		p.rightPad("GG", 4, '@');
		System.out.println(p.rightPad("GG", 4, '@'));
		System.out.println(p.rightPad("GG", 4, '@').equals("GG@@"));
		System.out.println(Prob3.leftPad("KK", 8,'%'));
		//������� �������� ������ ����
		
	}
}