package day7;

public class Prob1 {
	public void main(String args[]) {
		Prob1 prob1 = new Prob1();
		
		System.out.println( prob1.leftPad("SDS", 6, '#') );
		System.out.println( prob1.leftPad("SDS", 5, '$') ); 
		System.out.println( prob1.leftPad("SDS", 2, '&') ); 
	}
	public String leftPad(String str, int size, char padChar) {
		/*  ���⿡ ���α׷��� �ϼ��Ͻʽÿ�. */
		
		String result="";
		if (str.length()<size){
			for (int i =0; i<size-str.length();i++){
				result += padChar;
			}
		}
		return result+str;	
	}
}