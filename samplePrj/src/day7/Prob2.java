package day7;

import Practice.Prob3;

public class Prob2 {
	int j=1;
	public static String rightPad(String str, int size, char padChar) {
		/*  여기에 프로그램을 완성하십시오. */
		
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
		//결과값과 예측값이 같은지 검증
		
	}
}