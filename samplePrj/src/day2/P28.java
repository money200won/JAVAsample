package day2;

public class P28 {
		//primative data tpye����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 5.5f;
	System.out.println("f= "+f);
	System.out.println(f);
	System.out.printf("f= %1.1f\n",f);
	System.out.println("=================");
	//System.out.printf
	//("f= %1(�Ҽ����ڸ� ���°����).1(�Ҽ��Ʒ��ڸ� ���°����)f\n",f);
	//System.out.printf("",f); ln�� �ƴ϶� f�� ������ ��Ÿ����.
	byte b = (byte) 128;
	byte c = 127;
	c=(byte) (b+1);
	
	System.out.println(b);
	System.out.println(c);
	
	char ch = 'a';
	System.out.println(ch);
	System.out.println(ch+","+(int)ch);
	//a,97 ���� a�� �װ��� �ƽ�Ű�ڵ� 97�� ��µ�
	int n = ch;
	
	System.out.println(n);
	System.out.println((char)n+","+n);
	}
	

}
