package day15;

public class Dice {
	int size;

	// ������
	Dice(int size) {
		this.size = size;
	}

	// �÷��� �޼ҵ�
	int play() {
		int number = (int) (Math.random() * size) + 1;
		return number;
	}

}
