package day18;

import java.util.*;


public class ArrayTest01 {

	public static void main(String[] args) {
		Student[] s = new Student[100];
		s[0]= new Student();
		
		
		
		ArrayList<Student> list = new ArrayList<Student>();//콜랙션을 쓸 때는 왠만하면 제너릭한 타입을 설정해주자
//등록
		list.add(new Student("G1비트골드",100,22));
		list.add(new Student("A2비트캐쉬",86,75));
		list.add(new Student("B3비트코인",10,92));
		list.add(new Student("4대쉬",90,45));
		
//삭제
		/*
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.remove(list.get(1));
		System.out.println(list);
		*/
//원하는 데이터를 꺼내서 원하는 메소드 적용시키기
		/*
		int delindex = -1;
		for (int i=0;i<list.size();i++){
				Student data = list.get(i);
				data.avg();
				//list.remove(data); for문 안에 있을 때는 제거를 하면서 계속 list.size()가 작아져서 제대로 작동하지 않는다.
				if(data.name.equals("4대쉬")){
					delindex = i;
				}
		}
		list.remove(delindex);
		System.out.println(list);
		*/
//새로나온 for문 삭제 : JDK1.5부터, 순회해서 꺼내쓰는 용도로 쓴다. 원래 set에 쓸려고 나온 기능.
		for(Student data : list){
			System.out.println(data);
			data.avg();
		}
		System.out.println(list);
		
//Iterator를 이용한 삭제		
		Iterator<Student> it = list.iterator();
		
		while (it.hasNext()){
			Student data = it.next();
			if (data.name.equals("4대쉬"))
			it.remove();
		}
		System.out.println(list);
		System.out.println("===============================");
//검색
		System.out.println(list.contains(new Student("2비트캐쉬",86,75)));
		//equals 메소드를 오버라이딩 해야 저 값들을 비교가능하다.
		
		System.out.println("===============================");
//정렬
		Student[] tmp = list.toArray(new Student[list.size()]);
		Arrays.sort(tmp);
		
		
		Student[] tmp2 = new Student[list.size()];
		list.toArray(tmp2);
		Arrays.sort(tmp2);
		
		for(Student data : tmp){
			System.out.println(data);
			System.out.println("===============================");
		}
		System.out.println(list.toArray());
		
}

}

class Student implements Comparable<Student>{
	String name;
	int ko;
	int math;
	double avg;
	
	public void avg(){
		avg=(ko+math)/2.;//더블형으로 만들어주기 위해 .을 붙여준다.	
	}

	public Student() {
		super();
	}

	public Student(String name, int ko, int math) {
		super();
		this.name = name;
		this.ko = ko;
		this.math = math;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", avg=" + avg + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKo() {
		return ko;
	}

	public void setKo(int ko) {
		this.ko = ko;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ko;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Student other = (Student) obj;
		if (ko != other.ko)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		
		return name.compareTo(o.getName());
	}
	
	
	
}
