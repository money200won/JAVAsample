package day8;

public class P298 {
	public static void main(String[] args) {
		Car c1 = new Car("Red", 4, "Auto");
		c1.display();
		
		Car c2 = c1;
		c2.display();
		
		Car c3 = new Car(c1);
		c3.display();

		//c1을 새롭게 만들어서 복제하는 법은 이게 맞음 2번째 꺼는 같은 주소를 보고있음
		c1.color = "Gray";

		System.out.println("======================");
		System.out.println("Grey변화 후 c2와 c3의 비교");
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
	//생성자 함수1
	Car(String color, int door, String gearType) {
		this.color = color;
		this.door = door;
		this.gearType = gearType;
	}
	//생성자 함수2
	Car(Car c) {
		this(c.color, c.door, c.gearType);
	}
	//생성자 함수3 : 위에 c3가 성립하기 위해 필요한 생성자 함수

	public void display() {
		System.out.printf("Car[%s  |  %d  |  %s]\n", color, door, gearType);
	}
}

