package day12;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name =  new String("no more pain");
		
		System.out.println(name);
		System.out.println(name.toString());
		
		java.util.Date date = new java.util.Date();
		
		System.out.println(date);
		System.out.println(date.toString());
		
		Student s = new Student("ȫ��ǥ", 62, 1);
		
		System.out.println(s);
		System.out.println(s.toString());
		//�ٸ��� ������� �����µ� �츮�� ���� Student Ŭ�󽺴� ����� �ּҸ� ����Ѵ�.
		//�ٸ� ��ó�� �Ϸ��� ���������� toString���� �������̵� �Ǿ����� �ʾƼ� �׷���.
		
	}

}
