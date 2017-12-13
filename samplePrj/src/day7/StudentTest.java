package day7;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		System.out.println("贸府傈");
		s1.display();
		
		s1.name = "酒唱";
		s1.score = new int[]{88,99,100};
		s1.proc();
		
		System.out.println("贸府饶");
		s1.display();
		}

}
