package day3;

public class P113 {

	public static void main(String[] args) {

		int i = 10, j = 10;
		System.out.println(i==j);
		
		String name1 = new String("hello");
		String name2 = new String("hello");
		String name3 = name1;
		//name1과 name2는 같은 hello를 가지고 있지만 서로 다른 주소에 있는 것이라 다른 것으로 취급한다.
		System.out.println("name1==name2? _ "+(name1==name2));
		System.out.println("name1==name3? _ "+(name1==name3));
		System.out.println("name1.equals(name2)? _ "+name1.equals(name2));
		//처음 것과 세번째 것의 차이는 극명 ==연산자를 쓰면 주소값까지 같아야하고 equals를 쓰면 주소 안의 값을 비교한다.
		
		System.out.println("==============================");
		
		String s1 = "java";
		String s2 = "java";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.length());
		System.out.println(s1.charAt(0));
		
		
	}

}
