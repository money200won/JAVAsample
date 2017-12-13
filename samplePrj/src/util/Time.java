package util;

public class Time {
	private int hour = 00;
	private int min = 00;
	private float sec = 00;
	private boolean am = true;// am/pm

	public Time() {
	}

	public Time(int hour, int min, float sec, boolean am) {
		this.setHour(hour);//set�� ���ļ� ���� �̷��� �Է°��� �������� �Ÿ� �� �ִ�.
		this.setMin(min);
		this.setSec(sec);
		this.am = am;
	}
//��������� ������ �Լ�
	
	public boolean isAm() {
		return am;
	}

	public void setAm(boolean am) {
		this.am = am;
	}

	public int getHour() {
		return hour;
	}
//private�� hour �� ȣ�� �޼ҵ�, ���߿� ȣ���� �� �����̸�.getHour();�� �ؾ���
	public void setHour(int hour) {
		if (hour < 0 || hour > 23) {
			System.out.print("!�� ����");
			return;
		}
		this.hour = hour;
	}
//private�� hour �� �Է� �޼ҵ�
	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if (min < 0 || min >= 60) {
			System.out.print("!�� ����");
			return;
		}
		this.min = min;
	}

	public float getSec() {
		return sec;
	}

	public void setSec(float sec) {
		if (sec < 0.0 || sec > 59.9) {
			System.out.print("!�� ����");
			return;
		}
		this.sec = sec;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", min=" + min + ", sec=" + sec + "]";
	}

}
