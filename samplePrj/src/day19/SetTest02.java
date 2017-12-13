package day19;

import java.util.*;

public class SetTest02 {

	public static void main(String[] args) {
		Employee emp1 = new Employee("��","001");
		Employee emp2 = emp1;
		
		Set<Employee> set = new TreeSet<Employee>();
		set.add(emp1);
		set.add(emp2);//ArrayList�� Set�� ���� ū �������� �̷��� ���� �ּ��� �ٸ� �����鵵 �� �����ϴ°� �ƴѰ��� ����
		System.out.println(set);
		
		set.add(new Employee("��","002"));
		set.add(new Employee("��","002"));
		set.add(new Employee("��","002"));//equals�޼ҵ带 �������̵� ���� ������ �⺻������ �ٸ� �ּ��� �����ߺ��˻縦 ����.
		set.add(new Employee("��","002"));
		set.add(new Employee("��","022"));//equals�޼ҵ带 �����ؼ� � ������ �ߺ��˻縦 ������ ������ �� ����
		System.out.println(set);
		for (Employee data :set){
			System.out.println(data);
			System.out.println("--------------------------");
			//�� ������� �������� �ʽ��ϴ�.
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
