package day12;

public class StudentTest2 {

	public static void main(String[] args) {
		String name =  new String("no more pain");
		String name2 =  new String("no more pain");
		System.out.println(name==name2);//�ּҺ�
		System.out.println(name.equals(name2));//����
		
		java.util.Date date = new java.util.Date();
		java.util.Date date2 = new java.util.Date();
		System.out.println(date==date2);
		System.out.println(date.equals(date2));
		
		Student s = new Student("ȫ��ǥ", 62, 1);
		Student s2 = new Student("ȫ��ǥ", 62, 1);
		Student s3 = null;
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s3));
		
		
		
	}

}
