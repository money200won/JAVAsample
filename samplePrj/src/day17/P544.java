package day17;

import java.util.Calendar;
import java.util.Date;

public class P544 {

	public static void main(String[] args) {
		String name = "������ǥ";
		System.out.printf("%s , %s , %d , %.2f%n",name,"���߳�",90,5.5);
		String msg = String.format("%s , %s , %d , %.2f%n",name,"���߳�",90,5.5);
		System.out.println(msg);
		
		String df = String.format("%5.2f", Math.PI);
		System.out.println(df);//�̷������� ������ ���� ����� ���� ���� String���� ����ȴ�.
		//������ ��ȣ�� ������ ��Ʈ���� ����ϴµ� ��굵 �ؾ��� �� �����ϴ�.
		
		
		Date d =new Date(2017,11,21);
		System.out.println(d);
		//System.out.println(d.getMonth());deprecated �� ���� ����� �־ ��ü�ϸ� ������
		//compareTo �񱳸� ���� �޼ҵ�, ������ 0 ���� ũ��-1 �ڰ� ũ�� 1�� �������� ����Ѵ�.
		Calendar c = Calendar.getInstance();
		//Calendar c = new Calendar();�̷������δ� �������� ����
		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		c.set(2016, 11, 21);
		System.out.println(c.get(Calendar.YEAR));
		
		df =  String.format("%tY�� %tm�� %te�� %ta����  %n", c,c,c,c);
		System.out.println(df);
		df =  String.format("%1$tY�� %1$tm�� %1$te�� %s %n", c,"~~");
		//$ǥ�� ���ε� : $���� ���� ��ġ�� �ִ� ������ ������ �����͸� �޴´ٴ� �� ǥ��. ���� ������ �ߺ��� �� ���
		System.out.println(df);
		
	}

}
