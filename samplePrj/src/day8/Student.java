package day8;

public class Student {

	String name;
	int num;
	int year;
	int kor;
	int eng;
	int mth;

	public Student() {
		this(1, 1, "홍길동", 0, 0, 0);
	}

	public Student(int year, int num, String name, int kor, int eng, int mth) {

		this.year = year;
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mth = mth;
	}

	/*
	 * public double avg() { double a = (this.kor + this.eng + this.mth) / 3;
	 * avg = a; return a; }
	 */
	public void display() {
		double avg = (this.kor + this.eng + this.mth) / 3;
		System.out.printf("학생정보[%d학년 %d번  %s  평점 : %.1f]", year, num, name, avg);
	}

	public static void main(String[] args) {
		Student a = new Student(1, 2, "홍스", 100, 34, 85);
		a.display();
	}

}
