package day17;

import java.awt.List;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		int[] i;
		String[] s;
		Student[] ss;
		Object[] obj;
		
		ArrayList list1 = new ArrayList();//������Ʈ�� �迭�� ���� ���ʸ��� �����Ƿ�.
		//���������� 10���� �⺻���� ��������� ī��Ʈ�� ���� size�� ������ ������ ǥ��. ����� �ѱ�� 2��� �迭�� Ŀ��
		list1.add(new Student("ȫ��ǥ",66));
		list1.add("Hello JAVA");
		
		System.out.println(list1.size());
		System.out.println(list1.get(1));
		((String)list1.get(1)).toUpperCase();
		
		ArrayList<String> list2 = new ArrayList<String>();
		for (int j=0;j<100;j++){
		list2.add("TEST"+j);
		}
		
		System.out.println(list2.get(0));
		list2.remove(1);
		list2.add(3, "gasgnou");
		//System.out.println(list2);
		System.out.println(list2.size());
		/*
		for (int j=0;j<list2.size();j++){
		//System.out.println(list2.get(j).substring(list2.get(j).length()-2));
		System.out.println(list2.get(j).toUpperCase());
		}
		*/
	}

}
