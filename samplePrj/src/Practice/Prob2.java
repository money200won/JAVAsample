package Practice;

public class Prob2 {
	public static void main(String[] args) {
		int year = 2400;
		String test = "";
		if (year % 400 == 0) {
			test = "¿±≥‚";
		} else if (year % 100 == 0) {
			test = "∆Ú≥‚";
		} else if (year % 4 == 0) {
			test = "¿±≥‚";
		} else
			test = "∆Ú≥‚";

		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println("¿±≥‚¿‘¥œ¥Ÿ.");
		}

		System.out.println(test);
	}

}
