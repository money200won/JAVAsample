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
		//Ŭ���� ������ static�� �κ��� �����͸� �ҷ��´�. �׷��� static�κ��� �θ��� �̷��� ����
		
		
		System.out.println("End");

	}
}

class Product {
	static int count = 0;
	int serialNum;
	static {
		//System.out.println("Static{   }");
		count=0;
	}// Static�� �ڿ��� �����ϴ� ��, 1���� ȣ��, static �����̴�.
	{
		// System.out.println("{}");
		++count;
		serialNum = count;
	}// �ν��Ͻ��� �ʱ�ȭ�ϴ� ��, ��ü�� ������ ������ ȣ��

	public Product() {
		//System.out.println("Product() �⺻������");
	}// �⺻�������Լ�
}