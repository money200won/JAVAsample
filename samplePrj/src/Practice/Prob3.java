package Practice;

public class Prob3 {
	int j=1;
	public static String leftPad(String str, int size, char padChar) {
		/*  ���⿡ ���α׷��� �ϼ��Ͻʽÿ�. */
		
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
		//������� �������� ������ ����
		
	}
}