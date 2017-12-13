package util;

public class Time {
	private int hour = 00;
	private int min = 00;
	private float sec = 00;
	private boolean am = true;// am/pm

	public Time() {
	}

	public Time(int hour, int min, float sec, boolean am) {
		this.setHour(hour);//set을 거쳐서 오기 이러면 입력값도 조건으로 거를 수 있다.
		this.setMin(min);
		this.setSec(sec);
		this.am = am;
	}
//여기까지가 생성자 함수
	
	public boolean isAm() {
		return am;
	}

	public void setAm(boolean am) {
		this.am = am;
	}

	public int getHour() {
		return hour;
	}
//private한 hour 값 호출 메소드, 나중에 호출할 때 변수이름.getHour();로 해야함
	public void setHour(int hour) {
		if (hour < 0 || hour > 23) {
			System.out.print("!시 오류");
			return;
		}
		this.hour = hour;
	}
//private한 hour 값 입력 메소드
	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if (min < 0 || min >= 60) {
			System.out.print("!분 오류");
			return;
		}
		this.min = min;
	}

	public float getSec() {
		return sec;
	}

	public void setSec(float sec) {
		if (sec < 0.0 || sec > 59.9) {
			System.out.print("!초 오류");
			return;
		}
		this.sec = sec;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", min=" + min + ", sec=" + sec + "]";
	}

}
