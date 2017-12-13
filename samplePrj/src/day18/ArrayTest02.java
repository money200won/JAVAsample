package day18;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayTest02 {

	public static void main(String[] args) {
		Employee[] emp = new Employee[100];
		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee("002", "레드홍", "회계부"));
		list.add(new Employee("003", "초박형", "영업부"));
		list.add(new Employee("004", "구준표", "기획부"));
		list.add(new Employee("008", "너굴맨", "홍보부"));
		list.add(new Employee("009", "이상해씨", "기술부"));

		Collections.sort(list);

		for (Employee data : list) {
			System.out.println(data);
		}
		System.out.println("========================================");
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee data = it.next();
			if (data.getNum().equals("004")) {
				System.out.println(data + "이 정보를 제거합니다.");
				it.remove();
			}
		}

		for (Employee data : list) {
			System.out.println(data);
		}
		
		System.out.println("검색할 사람 이름을 내놓으세요.");
		for (Employee data : list){
			Pattern pattern =Pattern.compile("너.*");
			Matcher matcher = pattern.matcher(data.getName());
			System.out.println(matcher);
			//if (data.getName().equals(matcher))
			if(matcher.matches())
				System.out.println(data);
		}

		System.out.println("========================================");
		Employee[] data = new Employee[list.size()];
		list.toArray(data);
		System.out.println(Arrays.toString(data));
		
	}

}

class Employee extends Object implements Comparable<Employee> {
	String num;
	String name;
	String dept;

	public Employee() {
		super();
	}

	public Employee(String num, String name, String dept) {
		super();
		this.num = num;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [num=" + num + ", name=" + name + ", dept=" + dept + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
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
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
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

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public int compareTo(Employee o) {

		return num.compareTo(o.num);
	}

}