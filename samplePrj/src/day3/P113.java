package day3;

public class P113 {

	public static void main(String[] args) {

		int i = 10, j = 10;
		System.out.println(i==j);
		
		String name1 = new String("hello");
		String name2 = new String("hello");
		String name3 = name1;
		//name1�� name2�� ���� hello�� ������ ������ ���� �ٸ� �ּҿ� �ִ� ���̶� �ٸ� ������ ����Ѵ�.
		System.out.println("name1==name2? _ "+(name1==name2));
		System.out.println("name1==name3? _ "+(name1==name3));
		System.out.println("name1.equals(name2)? _ "+name1.equals(name2));
		//ó�� �Ͱ� ����° ���� ���̴� �ظ� ==�����ڸ� ���� �ּҰ����� ���ƾ��ϰ� equals�� ���� �ּ� ���� ���� ���Ѵ�.
		
		System.out.println("==============================");
		
		String s1 = "java";
		String s2 = "java";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.length());
		System.out.println(s1.charAt(0));
		
		
	}

}
