package day19;

import java.util.*;

public class SetTest02 {

	public static void main(String[] args) {
		Employee emp1 = new Employee("김","001");
		Employee emp2 = emp1;
		
		Set<Employee> set = new TreeSet<Employee>();
		set.add(emp1);
		set.add(emp2);//ArrayList와 Set의 가장 큰 차이점은 이렇게 같은 주소의 다른 변수들도 다 저장하는가 아닌가의 문제
		System.out.println(set);
		
		set.add(new Employee("고","002"));
		set.add(new Employee("고","002"));
		set.add(new Employee("고","002"));//equals메소드를 오버라이딩 하지 않으면 기본적으로 다른 주소의 내용중복검사를 못함.
		set.add(new Employee("박","002"));
		set.add(new Employee("고","022"));//equals메소드를 조정해서 어떤 변수만 중복검사를 할지도 조정할 수 있음
		System.out.println(set);
		for (Employee data :set){
			System.out.println(data);
			System.out.println("--------------------------");
			//들어간 순서대로 나오지는 않습니다.
		}
		System.out.println("++++++++++++++++++++++++++++");
		Iterator<Employee> it = set.iterator();
		while (it.hasNext()) {
			Employee data = it.next();
			System.out.println(data);
			System.out.println("--------------------------");
		}
		
		
		
		
		
		
	}

}

class Employee implements Comparable<Employee>{
	String name;
	String num;
	public Employee() {
		super();
	}
	public Employee(String name, String num) {
		super();
		this.name = name;
		this.num = num;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", num=" + num + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((num == null) ? 0 : num.hashCode());
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}
	@Override
	public int compareTo(Employee o) {
		
		return num.compareTo(o.num);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
