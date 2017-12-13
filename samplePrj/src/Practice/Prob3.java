package Practice;

public class Prob3 {
	int j=1;
	public static String leftPad(String str, int size, char padChar) {
		/*  여기에 프로그램을 완성하십시오. */
		
		String result="";
		if (str.length()<size){
			for (int i =0; i<size-str.length();i++){
				result += padChar;
			}
		}
		return result+str;	
	}
	public static void main(String[] args) {
		Prob3 p = new Prob3();
		p.leftPad("GG", 4, '@');
		System.out.println(p.leftPad("GG", 4, '@'));
		System.out.println(p.leftPad("GG", 4, '@').equals("@@GG"));
		//결과값과 예측값이 같은지 검증
		
	}
}