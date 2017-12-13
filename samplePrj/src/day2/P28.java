package day2;

public class P28 {
		//primative data tpye연습
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 5.5f;
	System.out.println("f= "+f);
	System.out.println(f);
	System.out.printf("f= %1.1f\n",f);
	System.out.println("=================");
	//System.out.printf
	//("f= %1(소수윗자리 몇번째까지).1(소수아랫자리 몇번째까지)f\n",f);
	//System.out.printf("",f); ln이 아니라 f는 형식을 나타낸다.
	byte b = (byte) 128;
	byte c = 127;
	c=(byte) (b+1);
	
	System.out.println(b);
	System.out.println(c);
	
	char ch = 'a';
	System.out.println(ch);
	System.out.println(ch+","+(int)ch);
	//a,97 글자 a와 그것의 아스키코드 97이 출력됨
	int n = ch;
	
	System.out.println(n);
	System.out.println((char)n+","+n);
	}
	

}
