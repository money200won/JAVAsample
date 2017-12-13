package day6;

import java.util.Arrays;

public class P201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 45)+1;
		}
		
		System.out.println("원본 num");
		System.out.println(Arrays.toString(num));
		
		int[] num2 = new int[num.length];
		System.arraycopy(num, 0, num2, 0, num.length);
		//num2 = num;
		//이런식으로 하면 마치 num2에 num이 담겨서 안바뀔것처럼 보이지만
		//사실 이건 주소를 담은 것이기 때문에 결국 num2와 num가 변화하고 변할 곳을 바라보게 된다.
		//그렇기때문에 이렇게 하면 결과가 바뀐게 곳을 참조하고 있어서 같이 바뀌어있게 된다.
		int tmp;
		for (int i=0; i<num.length-1; i++){
			for (int j=i+1; j<num.length; j++){
			if (num[i]<num [j]){
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
