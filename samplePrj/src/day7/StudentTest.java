package day7;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		System.out.println("처리전");
		s1.display();
		
		s1.name = "아나";
		s1.score = new int[]{88,99,100};
		s1.proc();
		
		System.out.println("처리후");
		s1.display();
		}

}
