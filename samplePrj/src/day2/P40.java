package day2;

import java.util.Scanner;

public class P40 {

	public static void main(String[] args) {
	//키보드로부터 메세지를 입력받는 system.in
	
		Scanner input = null;
	//스캐너에 인풋이라는 변수를 만들고 메인안에 있는거라 null로 초기화
	//참조 변수이기 때문에 초기화null이랑 메모리에 올리는 new가 필요
		input = new Scanner(System.in);
	//스케너에 인풋 객체를 만든거
		System.out.print("학생 이름을 입력하세요 :_");
		String name = input.nextLine();
		
		System.out.print("점수를 입력하게요 ex)90 _");
		int score = input.nextInt();
		input.nextLine();
		//여기서 발생할 수 있는 문제점은 엔터가 끝에 남아있게 된다.
		//그래서 엔터를 없에주는input.nextLine();명령을 추가로 입력해야하는 문제가 있다.
		//int score = Integer.parseInt(input.nextLine());
		//내가 입력한 문자열이 정수로 다시 변환되어야하는 경우 이렇게 하고
		//그냥 정수를 입력하고 싶을 떄는 input.nextInt로 하면 된다.
	//String name = "홍길동";
	//참조 데이터라 String name = new string ("홍길동");이게 맞지만
	//생략해도 괜찮은 특별한 경우가 String 너무 많이 써서
		System.out.printf("이름: %s, 점수 %d %n",name,score);
	//%s string값이 온다 %d int값이온다 %n 줄바꿈
		input.close();
	//더이상 입력을 받지않는다.
		input = null;
		
	}

}
