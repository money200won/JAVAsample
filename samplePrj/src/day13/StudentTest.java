package day13;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("A",9);
		
		System.out.println(s);
		System.out.println(s.getClass());
		Student  s1 = s;
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		//equals 메소드에 필요한거 서로의 주소값이 같은게 아닌 안의 내용물의 비교
		//null이 배정되었을 때 고쳐야하는 것
		//다른 타입이 들어왔을 경우 해결
		//더 고민해봐야함
		
		Student[] ss = {s, new Student("S",1), new Student()};
		for(int i= 0; i<ss.length;i++){
			System.out.println(ss[i]);
		}//ss[i]를 원래 print을 하면 주소가 찍혀야 정상이지만 toString을 오버라이딩 해두면 자동으로 값이 출력되게 한다. 
		
	}

}
