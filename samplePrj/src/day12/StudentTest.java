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
		
		Student s = new Student("홍준표", 62, 1);
		
		System.out.println(s);
		System.out.println(s.toString());
		//다른건 결과값이 찍히는데 우리가 만든 Student 클라스는 출력이 주소를 출력한다.
		//다른 것처럼 하려면 내부적으로 toString으로 오버라이딩 되어있지 않아서 그렇다.
		
	}

}
