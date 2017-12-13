package day17;

import java.awt.List;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		int[] i;
		String[] s;
		Student[] ss;
		Object[] obj;
		
		ArrayList list1 = new ArrayList();//오브젝트의 배열을 관리 제너릭이 없으므로.
		//내부적으로 10개가 기본으로 만들어지고 카운트를 위한 size를 가지고 순서를 표시. 사이즈를 넘기면 2배로 배열이 커짐
		list1.add(new Student("홍준표",66));
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
