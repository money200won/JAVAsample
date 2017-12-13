package day20;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {
		Student<String,Double> s1 = new Student("",0.0);
		Student<String,Integer> s2 = new Student("",0);
		
		List<String> l;
		List<Integer> l2;
		Map<String, Student> map;
	}

}

class Student<T,V extends Number>{//V에는 넘버의 하위 타입들만 들어오도록 제한.
	T name;
	V avg;
	public Student() {
		super();
	}
	public Student(T name, V avg) {
		super();
		this.name = name;
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", avg=" + avg + "]";
	}
	
	
}
