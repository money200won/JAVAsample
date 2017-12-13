package util;

public class TimeTest {
	public static void main(String[] args) {
		Time t1 = new Time(12, 23, 59, false);
		Time t2 = new Time(05, 42, 56, true);
		Time t3 = new Time(01, 26, 53, true);
		// System.out.println(t1.hour);
		t1.setHour(05);
		System.out.println(t1.getHour() + "½Ã");
		t2.setMin(-9);
		System.out.println(t2.getMin());
		System.out.println("==========================");
		Time t4 = new Time(-10,-77,-22,true);
		System.out.println(t4);
	}
}
