package day2;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		char c ='a';
		System.out.println(c+" 숫자니? "+Character.isDigit(c));
		
		//Integer.parseInt("1"); string 문자열을 정수로 변환
		//예를들어 입력된 값은 보통 문자열로 입력이 되는데 이걸 정수로 변환
		//Double.parseDouble("5.5");
		Double num = Double.parseDouble("5.5");
		System.out.println(num/100);
		int a = '가';
		int d = '거';
		int b = '나';
		System.out.println(a);
		System.out.println(d);
		System.out.println(b);
		
	}

}
