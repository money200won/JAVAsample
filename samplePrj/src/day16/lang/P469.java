package day16.lang;

import java.util.Arrays;

public class P469 {

	public static void main(String[] args) {
		String[] ss = {"XX","aa","bb","44"};
		System.out.println(Arrays.toString(ss));
		
		Arrays.sort(ss);//������ �ڵ�����
		System.out.println(Arrays.toString(ss));
		System.out.println("XX".compareTo("aa"));
		System.out.println("aa".compareTo("bb"));
		System.out.println("aa".compareTo("aa"));
		//value.length;��Ʈ���� �迭�� value�ȿ� �ְ� string�� char[]�� �迭�̰� �̰��� ���� �˾Ƴ��� ��
		
		String msg =  "Hello Java Test~~";
		char[] ch = msg.toCharArray();
		int c = msg.indexOf("J");
		System.out.println(c);
		System.out.println(msg.indexOf('T'));
		System.out.println(msg.indexOf('~'));
		System.out.println(msg.indexOf(" ", 2));
		System.out.println(msg.substring(11,16));
		
		String data = "���۰��� / 90/70/77";
		String[] data1 = data.split("/");
		int sum = 0;
		int count = 0;
		for (int i=1;i<data1.length;i++ ){
			sum += Integer.parseInt(data1[i].trim());
			count++;
		}
		int avg = sum/count;
		System.out.printf("�̸� : %s , ��� : %d , �հ� : %d",data1[0],avg,sum);
			//System.out.println(data1[i].trim());
		
		
	}

}
