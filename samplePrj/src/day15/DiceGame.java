package day15;

public class DiceGame {

	public static void main(String[] args) {
		DiceGame game = new DiceGame();
		

		int result1;
		try {
			result1 = game.countSameEye(10);
			System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		int result2;
		try {
			result2 = game.countSameEye(-10);
			System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	int countSameEye(int n) throws Exception {
		if (n <0)
			throw new Exception("�ֻ��� ���� Ƚ���� ����� �Է����ּ���");
		Dice d1 = new Dice(8);
		Dice d2 = new Dice(8);
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (d1.play() == d2.play()) {
				count++;
			}
		}
		return count;
	}

}
