package day3;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {

        /*
        ������ �빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ��Դϴ�.
        ���� ch�� ����� ���ڰ� �빮�� �� ��쿡�� 
	�ҹ��ڷ� �����ϴ� �ڵ带 �ϼ� �մϴ�.
  	*/
	char ch = 'P';
	char lowerCase = (65<=ch && ch<=90)? (char)(ch+32) : ch;
	System.out.print("ch:"+ch);
	System.out.println(" to lowerCase :"+lowerCase);


/*
 �Ʒ��� ���� num�� ��������  ��� ���� 0�� ����ϴ� �ڵ��Դϴ�.
���� �����ڸ� �̿��ؼ� �� �˸��� �ڵ带 �ϼ��ϼ���. 
*/
	Scanner input = new Scanner(System.in);
	System.out.println("���ڸ� �Է��ϼ���. _ ");
	String n = input.nextLine();
	int num = Integer.parseInt(n);
	String result = (num>0)? "���" : (num<0)? "����": "0" ;
	System.out.println(result);
	

	
	System.out.println(0.1f==0.1f);
	System.out.println(0.1f==0.1d);
	System.out.println(0.1d==0.1f);
	System.out.println(0.1d==0.1d);
	
	
	}
}          
