package day3;

public class P120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = '!';
		boolean result = '0' <= c && c <= '9';
		System.out.println('0' + " 아스키값 : " + (int)'0');
		System.out.println('9' + " 아스키값 : " + (int)'9');
		System.out.println(c + " 숫자? " + result);
		System.out.println(result);
		
		System.out.println(Integer.toBinaryString(11));
		System.out.println("  "+Integer.toBinaryString(3));
		System.out.println("   "+(11 & 3));
		
		boolean f1,f2;
		boolean result1 = (f1='0' <=c) && (f2='9' >=c);	
		System.out.println(result1);
		
		
		
	}

}
