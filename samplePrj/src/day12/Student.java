package day12;

import java.util.Date;

public class Student {
	private String name;
	private int age;
	private int id;
	
	
	public Student() {
		super();
	}
	public Student(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		// return "Student["+name+","+age+","+id+"]";아주 비효율적인 코딩
		StringBuilder sb = new StringBuilder();
		sb.append("Student[");
		sb.append(name);
		sb.append(",");
		sb.append(age);
		sb.append(",");
		sb.append(id);
		sb.append("]");
		return sb.toString();
	}
	@Override
	public boolean equals(Object obj){
		/*
		if (obj instanceof Student){
			if (this.name != ((Student) obj).getName())
				return false;
			if (this.age != ((Student) obj).getAge())
				return false;
			if (this.id != ((Student) obj).getId()){
				return false;
			} return true;
		} return false;
		*/
		//아직 null값을 못잡았다.
		return (obj instanceof Student) && toString().equals(((Student) obj).toString());
		
	}
	
	
	
	
}
