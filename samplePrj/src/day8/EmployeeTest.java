package day8;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee n1 = new Employee();
		n1.display();
		n1.num = "1";
		n1.display();
		n1.name = "ȫ";
		n1.display();
		n1.dept = "��ȹ��";
		n1.display();

		Employee n2 = new Employee("2", "��", "����");
		n2.display();

		Employee n3 = new Employee("3", "��", "�����");
		n3.display();

		Employee[] nn = new Employee[3];
		for (int i = 0; i < nn.length; i++) {
			nn[i] = new Employee(String.valueOf("00"+i), "��", "�λ��");
			nn[i].display();
		}
		//�迭�� ������

	}

}
