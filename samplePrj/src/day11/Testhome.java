package day11;

public class Testhome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object o = new Student("rlfehd", 20, 1);
		((Student) o).display();
		o = "Hello";
		if (o instanceof Student)
			((Student) o).display();
		// ĳ������ �ϸ� Object.String�ε� Student.display �޼ҵ带 ȣ���ϸ� ������ �����ϴµ� ������ �ȳ���
		// �ٿ�ĳ������ �ϸ� ĳ���� ������ �������� ������ ������ �ʴ´�. �׷��� �ٿ�ĳ������ �����ؾ��ϰ� ����
		// ���������� ĳ���ú��� ���� ���� Ÿ���� üũ�ϴ� ������ �ʿ��ϴ�. instanceof �������� o�� Student Ÿ����
		// �� �� �ִ��� Ȯ���� �ϴ� ������ �ʿ��ϴ�.

		String name = "������";
		Student s1 = new Student("�����", 20, 1);
		Teacher t1 = new Teacher("ȫ��", 50, "Java");
		Employee e1 = new Employee("��", 44, "������");

		Object[] obj = { name, s1, t1, e1 };// �ּҸ� �� ��Ƽ� �����ҷ�
		Person[] p = { s1, t1, e1 };// Person�� �ڽĵ鸸 ��� �����ҷ�
		// �ڹ� ���׷����Ͼ : ��Ӱ��踦 �� ¥�� �ϳ��� �迭 �ȿ� �������� Ÿ���� �־ ������ �� �ִ�.

		System.out.println("============================================");
		for (int i = 0; i < p.length; i++) {
			if (p[i] instanceof Student)
				((Student) p[i]).display();
			if (p[i] instanceof Teacher)
				((Teacher) p[i]).display();
			if (p[i] instanceof Employee)
				((Employee) p[i]).display();
			// Person�� �迭�� �����ϸ� �ڵ鸵�� �� �ڼ�Ŭ�󽺿� ������ �� �����Ƿ� �ٿ�ĳ�����ϱ� ��������
			// display�޼ҵ带 ����� �� ����.
		}
		System.out.println("============================================");
		for (int i = 0; i < p.length; i++) {
			p[i].display();
		}
		System.out.println("============================================");
		Person pp = e1;// ���� ���ε��� �ٲٸ� ��� �ٸ� Ŭ���� ����� �����Ѵ�.
		pp.display();
		// �ڹ� ����������(������) : �޼ҵ�� �ϳ��ε� ������ �پ��ϰ� ���� Ŭ���� �޼ҵ带 �������̵� �ϸ鼭 �۵���
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] instanceof Person)
				((Person) obj[i]).display();
		}
		//������Ʈ �迭 �ȿ� Person���� �ٿ�ĳ������ �ϰ� �� �ٿ�ĳ���� �� �Ϳ��� display()�޼ҵ尡 ����Ʈ�� �ҷ�������
		//�װ� �ٽ� �������̵� �� �� �޼ҵ��� display()�� �ҷ��´�.
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		
		
		Employee e = new Employee("����", 21, "ȸ���");
		Student s = new Student("Ǫ��", 22, 200212);
		Teacher t = new Teacher("��ī��", 40, "JAVA");
		e.display();
		s.display();
		t.display();

	}

}
