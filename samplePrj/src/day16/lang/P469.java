package day16.lang;

import java.util.Arrays;

public class P469 {

	public static void main(String[] args) {
		String[] ss = {"XX","aa","bb","44"};
		System.out.println(Arrays.toString(ss));
		
		Arrays.sort(ss);//사전식 자동정렬
		System.out.println(Arrays.toString(ss));
		System.out.println("XX".compareTo("aa"));
		System.out.println("aa".compareTo("bb"));
		System.out.println("aa".compareTo("aa"));
		//value.length;스트링의 배열은 value안에 있고 string이 char[]의 배열이고 이거의 길이 알아내는 법
		
		String msg =  "Hello Java Test~~";
		char[] ch = msg.toCharArray();
		int c = msg.indexOf("J");
		System.out.println(c);
		System.out.println(msg.indexOf('T'));
		System.out.println(msg.indexOf('~'));
		System.out.println(msg.indexOf(" ", 2));
		System.out.println(msg.substring(11,16));
		
		String data = "구멍가게 / 90/70/77";
		String[] data1 = data.split("/");
		int sum = 0;
		int count = 0;
		for (int i=1;i<data1.length;i++ ){
			sum += Integer.parseInt(data1[i].trim());
			count++;
		}
		int avg = sum/count;
		System.out.printf("이름 : %s , 평균 : %d , 합계 : %d",data1[0],avg,sum);
			//System.out.println(data1[i].trim());
		
		
	}

}
