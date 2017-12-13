package day15;

public class Dice {
	int size;

	// 생성자
	Dice(int size) {
		this.size = size;
	}

	// 플레이 메소드
	int play() {
		int number = (int) (Math.random() * size) + 1;
		return number;
	}

}
