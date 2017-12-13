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
/*여러번 쓸 클래스가 아니면 가장 아래에 하나 만들어도 됩니다.
 * 하지만 public은 만들수가 없네요 그래서 다른 곳에서 끌어다 쓸 수 없습니다.
 * 여러개의 클래스를 만들어서 쓰는 것이 가능하지만 public 한 것은 하나만 가능합니다.
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
		System.out.printf("TV[%s channel:%d  전원(%b)] %n"+ this.color, this.channel, this.power);
	}
 */