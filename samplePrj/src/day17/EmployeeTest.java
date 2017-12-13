package day17;

public class EmployeeTest {
//제너릭 적용해보기
	public static void main(String[] args) {
		Employee<String,Integer> e2 = new Employee();
		System.out.println(e2);
		e2.number = 2017;
		//System.out.println(e2.number.indexOf("7"));
		Employee<String,Integer> e1 = new Employee();
		//e1.number = "2015";T가 정수로 바뀌면서 자연스럽게 스트링타입은 불가하게 됨
		System.out.println(e1);
		e1.number = 2017;
	
		Employee e3 = new Employee();
		System.out.println(e3);
		e3.number = 2222;
		e3.number = "444";//이렇게 타입이 정의되지 않으면 오브젝트 타입으로 만들어져서 내부에 주소를 계속 생성한다.
		//어라 둘다 되네? JDK1.5부터 지원하는 제너릭 기능.
	}

}

class Employee<T,T1> implements Comparable<T>{//제너릭 기능
	T name;
	T1 number;
	int age;
	
	
	
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public T1 getNumber() {
		return number;
	}
	public void setNumber(T1 number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
	@Override
	public int compareTo(T o) {
		
		return ((String) name).compareTo(((Employee<String, Integer>) o).getName());
	}	
	
	
}

