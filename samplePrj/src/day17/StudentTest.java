package day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import util.Array;

public class StudentTest {
	public static void main(String[] args) {
		Student[] ss = new Student[100];
		int count = 0;
		
		try(Scanner scanner = new Scanner(new File("student.txt"))){//클로져블을 임플리먼트 한 녀석만 try()를 쓸 수 있어요. 항상 주의
			while(scanner.hasNextLine()){
				String readLine = scanner.nextLine();
				String[] data = readLine.split("/");
				ss[count] = new Student(data[0], Integer.parseInt(data[1]));
				count++;
			}
			// new Student(name,age);

		} catch (Exception e) {
			if (e instanceof FileNotFoundException) {
				System.out.println("문서를 준비해주세요.");
			} else {
				e.printStackTrace();
			}

		} finally {		}
		/*
		try{
		Arrays.sort(ss);
		}catch (ClassCastException e) {
			System.out.println("정렬 기준키 설정이 필요합니다.");
		}
		*/
		
		Arrays.sort(ss,0,count);
		
		for(int i = 0 ; i<count;i++){
			System.out.println(ss[i]);
		}
		
		String[] i = {"j","a","f"};
		Arrays.sort(i);//sort를 쓰려면 comparable이라는 인터페이스로 캐스팅이 가능해야한다.왠만하면 잘 안되는데 그래서 이걸 스튜던트 클라스 내에서 구현해주어야 제대로 작동한다.
		System.out.println(Arrays.toString(i));
		
		
		System.out.println("MAIN END");
	}
}

class Student implements Comparable<Student>{
	String name;
	int avg;
	int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.avg = avg;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
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
		result = prime * result + avg;
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
		if (age != other.age)
			return false;
		if (avg != other.avg)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", avg=" + avg + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		int a = name.compareTo(o.name);
			if(a==0){
				return age - o.age;
			}
		return a;
	}

}