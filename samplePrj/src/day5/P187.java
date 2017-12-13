package day5;

import java.util.Arrays;
import java.util.Scanner;

public class P187 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("뽑을 숫자 개수를 입력하세요._");
		
		int[] num;
		
		num = new int[Integer.parseInt(input.nextLine())];
		int i;
		for (i = 0; i < num.length; i++) {
			
			num[i]=(int)(Math.random()*45+1);
			//num[i] = i * 10 + 10; 0번째부터 시작하기 때문에 처음에 +10이 필요합니다.
		}
		/*
		 * num[0]=10; num[1]=20; num[2]=30; num[3]=40; num[4]=50;
		 */
		for (i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
		
		System.out.println("\n========================================");
		
		
		System.out.println(Arrays.toString(num));
		System.out.println(Math.random());//난수생성 0보다 크거나같고 1보다 작은 랜덤한 수
		System.out.println((int)(Math.random()*45+1));
		//난수에 45를 곱한걸 정수로 나타내라(0<=난수<44)
		
		
		
		
	}

}
