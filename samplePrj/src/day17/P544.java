package day17;

import java.util.Calendar;
import java.util.Date;

public class P544 {

	public static void main(String[] args) {
		String name = "레드준표";
		System.out.printf("%s , %s , %d , %.2f%n",name,"나야나",90,5.5);
		String msg = String.format("%s , %s , %d , %.2f%n",name,"나야나",90,5.5);
		System.out.println(msg);
		
		String df = String.format("%5.2f", Math.PI);
		System.out.println(df);//이런식으로 포멧을 거쳐 저장된 것은 전부 String으로 저장된다.
		//포멧은 기호를 쓰려고 스트링을 써야하는데 계산도 해야할 때 유용하다.
		
		
		Date d =new Date(2017,11,21);
		System.out.println(d);
		//System.out.println(d.getMonth());deprecated 더 좋은 기능이 있어서 대체하면 좋은것
		//compareTo 비교를 위한 메소드, 같으면 0 앞이 크면-1 뒤가 크면 1인 정수값을 출력한다.
		Calendar c = Calendar.getInstance();
		//Calendar c = new Calendar();이런식으로는 생성되지 않음
		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		c.set(2016, 11, 21);
		System.out.println(c.get(Calendar.YEAR));
		
		df =  String.format("%tY년 %tm월 %te일 %ta요일  %n", c,c,c,c);
		System.out.println(df);
		df =  String.format("%1$tY년 %1$tm월 %1$te일 %s %n", c,"~~");
		//$표시 바인딩 : $앞의 숫자 위치에 있는 포맷의 변수의 데이터를 받는다는 걸 표시. 같은 변수가 중복될 때 사용
		System.out.println(df);
		
	}

}
