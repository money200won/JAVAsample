package day7;

import java.util.Arrays;

public class StudentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Student[] s = new Student[5];
		Student[] s = { new Student(), new Student(), new Student(), new Student(), new Student() };

		s[4].name = "´ÙÇö";
		s[4].score = new int[] { 30, 40, 50 };

		for (int i = 0; i < s.length; i++) {
			s[i].proc();
			s[i].display();
		}

	}

}
