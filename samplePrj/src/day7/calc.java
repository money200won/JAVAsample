package day7;

public class calc {

	public static int add(int a, int b) {
		// add 변수는 int값 2개가 필요하고 결과값으로 int값이 돌아와야한다는 설정
		// 리턴 타입은 모든 데이터타입이 다 올 수 있다.
		// 만약 아무것도 없으면 return이 생략된 것이라 생각하고 void가 선언되어있는걸 기대함.
		 return a+b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}
	public static int add(int a, int b, int c) {
		return a + b + c;
		//신기한게 클래스 내에서 이름이 같아도 안에 매개변수가 다르면 다른 것으로 구분한다.
	}
	public static int mlt(int a, int b) {
		return a * b;
	}
	public static int div(int a, int b) {
		return a / b;
	}

}
