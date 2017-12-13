package day8;

public class Calc {

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add() {
		return 0;
	}
	// ���Ʒ��� ���� add�̸��ε� �Ű������� �޶� ������ �����ϱ� ������ ������ �ȳ���.

	public static double add(double a, double b) {
		return a + b;
	}
	/**
	 * 
	 * @param a ���� ������
	 * @return �հ谡 ���ϵ˴ϴ�.
	 */
	// ������ Ÿ���� �޶� ������ ����
	public static int add(int...a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	// int...a�� ���������� �迭�� ���� ���°� �ȴ�.JDK1.5���� ����.
	//int[] a = {1,2,3,4,5,6,7}�� �������� �ʱ�ȭ �Ǿ ����ִ�.
	public static int add2(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	
	
	// �ϳ��� Ŭ���� �ȿ� ������ �̸��� �޼ҵ尡 ������ �ִ� �� �żҵ� �����ε��̶�� �θ���.
	// ������ �Ű������� Ÿ���̳� ������ �ٸ��� �����ϴ�. ����ΰ� �޶���ϸ� ����Ÿ�Ը� �޶󼭴� ����

	public static void main(String[] args) {
		// Test �غ���
		System.out.println(Calc.add(4, 3));
		System.out.println("����� ������ �����ϱ�?" + String.valueOf(Calc.add(4, 3) == 7));
		System.out.println(Calc.add());
		System.out.println(Calc.add(3.4, 4.5));
		System.out.println(Calc.add(4,5,6,7,9));

		// ��Ʈ��+Ŭ������ � �޼ҵ尡 ���Ǿ����� Ȯ���غ���
	}

}
