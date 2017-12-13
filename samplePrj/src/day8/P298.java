package day8;

public class P298 {
	public static void main(String[] args) {
		Car c1 = new Car("Red", 4, "Auto");
		c1.display();
		
		Car c2 = c1;
		c2.display();
		
		Car c3 = new Car(c1);
		c3.display();

		//c1�� ���Ӱ� ���� �����ϴ� ���� �̰� ���� 2��° ���� ���� �ּҸ� ��������
		c1.color = "Gray";

		System.out.println("======================");
		System.out.println("Grey��ȭ �� c2�� c3�� ��");
		System.out.println("======================");
		
		c1.display();
		c2.display();
		c3.display();
	}
}

class Car {
	String color;
	int door;
	String gearType;

	Car() {
	}
	//������ �Լ�1
	Car(String color, int door, String gearType) {
		this.color = color;
		this.door = door;
		this.gearType = gearType;
	}
	//������ �Լ�2
	Car(Car c) {
		this(c.color, c.door, c.gearType);
	}
	//������ �Լ�3 : ���� c3�� �����ϱ� ���� �ʿ��� ������ �Լ�

	public void display() {
		System.out.printf("Car[%s  |  %d  |  %s]\n", color, door, gearType);
	}
}

