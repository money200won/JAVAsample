package day7;

class Tv {
	String color;
	boolean power;
	int channel;

	void power() {
		this.power = !this.power;
	}

	void channelUp() {
		++this.channel;
	}

	void channelDown() {
		--this.channel;
	}
	void display(){
		System.out.printf("Tv[%s channel:%d  ����(%b)] %n", this.color, this.channel, this.power);
	}
	
}

class Tvtest {
	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("���� ä���� " + t.channel + "�Դϴ�.");
	}

}
