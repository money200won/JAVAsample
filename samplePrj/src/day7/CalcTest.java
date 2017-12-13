package day7;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc c1 = null;
						
		System.out.println(c1.add(313, 122));
		//이렇게 주소를 써도 되긴 하지만 클래스 변수로 설정되어있는 만큼 클래스 이름으로 호출.
		System.out.println(calc.add(313, 122));
		System.out.println(calc.sub(313, 122));
		System.out.println(calc.mlt(313, 122));
		System.out.println(calc.div(313, 122));
		System.out.println(calc.add(313, 122, 543));


	}

}
