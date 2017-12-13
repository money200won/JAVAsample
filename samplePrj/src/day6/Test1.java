package day6;

public class Test1 {

	public static void main(String[] args) {

		String name;
		Employee emp1= new Employee();
		//컴파일러는 지금 작업하고 있는 패키지 안에서 Employee 데이터타입을 찾고있는데
		//만든 적이 없기때문에 찾을 수가 없고 에러가 난다.
		//내가 동일한 이름의 새로운 클래스를 패키지 안에 만들면 오류가 사라진다.
		emp1.display();
	}

}
