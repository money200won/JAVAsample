package day8;

public class Calc {

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add() {
		return 0;
	}
	// 위아래가 같은 add이름인데 매개변수가 달라서 구분이 가능하기 때문에 에러가 안난다.

	public static double add(double a, double b) {
		return a + b;
	}
	/**
	 * 
	 * @param a 더할 데이터
	 * @return 합계가 리턴됩니다.
	 */
	// 데이터 타입이 달라서 구분이 가능
	public static int add(int...a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	// int...a는 내부적으로 배열과 같은 형태가 된다.JDK1.5부터 가능.
	//int[] a = {1,2,3,4,5,6,7}의 형식으로 초기화 되어서 들어있다.
	public static int add2(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	
	
	// 하나의 클래스 안에 동일한 이름의 메소드가 여러개 있는 걸 매소드 오버로딩이라고 부른다.
	// 조건은 매개변수의 타입이나 내용이 다르면 가능하다. 선언부가 달라야하며 리턴타입만 달라서는 오류

	public static void main(String[] args) {
		// Test 해보자
		System.out.println(Calc.add(4, 3));
		System.out.println("결과가 예측과 같습니까?" + String.valueOf(Calc.add(4, 3) == 7));
		System.out.println(Calc.add());
		System.out.println(Calc.add(3.4, 4.5));
		System.out.println(Calc.add(4,5,6,7,9));

		// 컨트롤+클릭으로 어떤 메소드가 사용되었는지 확인해보기
	}

}
