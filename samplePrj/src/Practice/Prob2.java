package Practice;

public class Prob2 {
	public static void main(String[] args) {
		int year = 2400;
		String test = "";
		if (year % 400 == 0) {
			test = "����";
		} else if (year % 100 == 0) {
			test = "���";
		} else if (year % 4 == 0) {
			test = "����";
		} else
			test = "���";

		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println("�����Դϴ�.");
		}

		System.out.println(test);
	}

}
