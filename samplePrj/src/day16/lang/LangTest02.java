package day16.lang;

import java.util.Arrays;

public class LangTest02 {

	public static void main(String[] args) {
		int[] num = {77,8,44,57};
		int[] num2 = num.clone();//�Ϲ������� Ŭ���� �����ִ�. ������Ʈ�� �ִ� �޼ҵ�, �׻� �������̵��� ĳ������ ����
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(num2));
		System.out.println(num);//�ּҰ� ���� �ߺ��� �ȵȴ�.�� ���縦 �̷� ������ �� �� �ִ�.
		System.out.println(num2);
		
		String[] name = {"����","���̹�","����"};
		String[] name2 = name.clone();
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(name2));
		System.out.println(name);//�ּҰ� ���� �ߺ��� �ȵȴ�.�� ���縦 �̷� ������ �� �� �ִ�.
		System.out.println(name2);
		

	}

}
