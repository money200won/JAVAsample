package day16.lang;

import java.util.Arrays;

public class LangTest02 {

	public static void main(String[] args) {
		int[] num = {77,8,44,57};
		int[] num2 = num.clone();//일반적으로 클론은 막혀있다. 오브젝트에 있는 메소드, 항상 오버라이딩과 캐스팅을 하자
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(num2));
		System.out.println(num);//주소가 서로 중복이 안된다.즉 복사를 이런 식으로 할 수 있다.
		System.out.println(num2);
		
		String[] name = {"구글","네이버","다음"};
		String[] name2 = name.clone();
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(name2));
		System.out.println(name);//주소가 서로 중복이 안된다.즉 복사를 이런 식으로 할 수 있다.
		System.out.println(name2);
		

	}

}
