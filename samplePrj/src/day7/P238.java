package day7;

public class P238 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv tv1 = new Tv();
		tv1.display();
		tv1.power();
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		tv1.display();
		}

}
/*
/*������ �� Ŭ������ �ƴϸ� ���� �Ʒ��� �ϳ� ���� �˴ϴ�.
 * ������ public�� ������� ���׿� �׷��� �ٸ� ������ ����� �� �� �����ϴ�.
 * �������� Ŭ������ ���� ���� ���� ���������� public �� ���� �ϳ��� �����մϴ�.
 */
/*
class TV{
	String color;
	boolean power;
	int channel;

	void power() {
		this.power = this.power;
	}

	void channelUp() {
		++this.channel;
	}

	void channelDown() {
		--this.channel;
	}
	void display(){
		System.out.printf("TV[%s channel:%d  ����(%b)] %n"+ this.color, this.channel, this.power);
	}
 */