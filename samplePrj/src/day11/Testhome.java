package day11;

public class Testhome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object o = new Student("rlfehd", 20, 1);
		((Student) o).display();
		o = "Hello";
		if (o instanceof Student)
			((Student) o).display();
		// 캐스팅을 하면 Object.String인데 Student.display 메소드를 호출하면 오류가 나야하는데 오류가 안나옴
		// 다운캐스팅을 하면 캐스팅 에러가 있음에도 오류가 보이지 않는다. 그래서 다운캐스팅은 조심해야하고 또한
		// 무조건적인 캐스팅보단 먼저 서로 타입을 체크하는 과정이 필요하다. instanceof 구문으로 o가 Student 타입을
		// 쓸 수 있는지 확인을 하는 과정이 필요하다.

		String name = "땡땡땡";
		Student s1 = new Student("길라임", 20, 1);
		Teacher t1 = new Teacher("홍쌤", 50, "Java");
		Employee e1 = new Employee("길", 44, "교무실");

		Object[] obj = { name, s1, t1, e1 };// 주소를 다 모아서 관리할래
		Person[] p = { s1, t1, e1 };// Person의 자식들만 골라서 관리할래
		// 자바 히테로지니어스 : 상속관계를 잘 짜면 하나의 배열 안에 여러가지 타입을 넣어서 관리할 수 있다.

		System.out.println("============================================");
		for (int i = 0; i < p.length; i++) {
			if (p[i] instanceof Student)
				((Student) p[i]).display();
			if (p[i] instanceof Teacher)
				((Teacher) p[i]).display();
			if (p[i] instanceof Employee)
				((Employee) p[i]).display();
			// Person의 배열로 관리하면 핸들링할 때 자손클라스에 접근할 수 없으므로 다운캐스팅하기 전까지는
			// display메소드를 사용할 수 없다.
		}
		System.out.println("============================================");
		for (int i = 0; i < p.length; i++) {
			p[i].display();
		}
		System.out.println("============================================");
		Person pp = e1;// 여기 바인딩만 바꾸면 계속 다른 클라스의 기능을 수행한다.
		pp.display();
		// 자바 폴리모피즘(다형성) : 메소드는 하나인데 동작은 다양하게 여러 클라스의 메소드를 오버라이딩 하면서 작동함
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] instanceof Person)
				((Person) obj[i]).display();
		}
		//오브젝트 배열 안에 Person으로 다운캐스팅을 하고 그 다운캐스팅 된 것에서 display()메소드가 디폴트가 불러와지고
		//그게 다시 오버라이딩 된 각 메소드의 display()를 불러온다.
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		
		
		Employee e = new Employee("도르", 21, "회계부");
		Student s = new Student("푸린", 22, 200212);
		Teacher t = new Teacher("피카츄", 40, "JAVA");
		e.display();
		s.display();
		t.display();

	}

}
