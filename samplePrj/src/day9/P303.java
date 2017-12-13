package day9;

public class P303 {
	public static void main(String[] args) {
		System.out.println("Start");
		Product b1 = new Product();
		Product b2 = new Product();
		Product b3 = new Product();

		System.out.println(b1.serialNum);
		System.out.println(b2.serialNum);
		System.out.println(b3.serialNum);

		System.out.println(b1.count);
		System.out.println(b2.count);
		System.out.println(b3.count);

		System.out.println(Product.count);
		//클래스 변수는 static한 부분의 데이터를 불러온다. 그래서 static부분을 부를떈 이렇게 가능
		
		
		System.out.println("End");

	}
}

class Product {
	static int count = 0;
	int serialNum;
	static {
		//System.out.println("Static{   }");
		count=0;
	}// Static한 자원을 생성하는 블럭, 1번만 호출, static 영역이다.
	{
		// System.out.println("{}");
		++count;
		serialNum = count;
	}// 인스턴스를 초기화하는 블럭, 개체가 생성될 때마다 호출

	public Product() {
		//System.out.println("Product() 기본생성자");
	}// 기본생성자함수
}