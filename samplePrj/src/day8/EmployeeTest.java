package day8;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee n1 = new Employee();
		n1.display();
		n1.num = "1";
		n1.display();
		n1.name = "홍";
		n1.display();
		n1.dept = "기획부";
		n1.display();

		Employee n2 = new Employee("2", "최", "재경부");
		n2.display();

		Employee n3 = new Employee("3", "김", "감사과");
		n3.display();

		Employee[] nn = new Employee[3];
		for (int i = 0; i < nn.length; i++) {
			nn[i] = new Employee(String.valueOf("00"+i), "김", "인사과");
			nn[i].display();
		}
		//배열로 만들어보기

	}

}
