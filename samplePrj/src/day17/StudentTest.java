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
		
		try(Scanner scanner = new Scanner(new File("student.txt"))){//Ŭ�������� ���ø���Ʈ �� �༮�� try()�� �� �� �־��. �׻� ����
			while(scanner.hasNextLine()){
				String readLine = scanner.nextLine();
				String[] data = readLine.split("/");
				ss[count] = new Student(data[0], Integer.parseInt(data[1]));
				count++;
			}
			// new Student(name,age);

		} catch (Exception e) {
			if (e instanceof FileNotFoundException) {
				System.out.println("������ �غ����ּ���.");
			} else {
				e.printStackTrace();
			}

		} finally {		}
		/*
		try{
		Arrays.sort(ss);
		}catch (ClassCastException e) {
			System.out.println("���� ����Ű ������ �ʿ��մϴ�.");
		}
		*/
		
		Arrays.sort(ss,0,count);
		
		for(int i = 0 ; i<count;i++){
			System.out.println(ss[i]);
		}
		
		String[] i = {"j","a","f"};
		Arrays.sort(i);//sort�� ������ comparable�̶�� �������̽��� ĳ������ �����ؾ��Ѵ�.�ظ��ϸ� �� �ȵǴµ� �׷��� �̰� ��Ʃ��Ʈ Ŭ�� ������ �������־�� ����� �۵��Ѵ�.
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