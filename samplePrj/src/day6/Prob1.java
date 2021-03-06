package day6;

import java.util.Arrays;

public class Prob1 {

	public static void main(String[] args) {
		// args를 이용한 입력과 입력 오류에 대한 대책

		if (args.length == 0) {
			System.out.println("값을 입력해주세요.");
			return;
		}

		int[] num = new int[Integer.parseInt(args[0])];

		flag: for (int i = 0; i < num.length; i++) {
			int j = (int) ((Math.random() * 45) + 1);
			for (int n = 0; n <= i; n++) {
				if (j == num[n]) {
					i--;
					continue flag;
				}
			}
			num[i] = j;
		}

		/*
		 * System.out.println("원본 num");
		 * System.out.println(Arrays.toString(num));
		 */

		int[] num2 = new int[num.length];
		System.arraycopy(num, 0, num2, 0, num.length);

		// num2 = num;
		/*
		 * 이런식으로 하면 마치 num2에 num이 담겨서 안바뀔것처럼 보이지만 사실 이건 주소를 담은 것이기 때문에 결국 num2와
		 * num가 변화하고 변할 곳을 바라보게 된다. 그렇기때문에 이렇게 하면 결과가 바뀐게 곳을 참조하고 있어서 같이 바뀌어있게
		 * 된다.
		 */

		int tmp;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}

		System.out.println("원본");
		System.out.println(Arrays.toString(num2));
		System.out.println("결과");
		System.out.println(Arrays.toString(num));
	}

}
