package day3;

import java.util.Scanner;

public class P142 {

	public static void main(String[] args) {
		//Ű���带 ���ؼ� ������ �Է¹ް� 
		//�� ������ ��ȿ�ϴٸ� ���ó��
	
	 Scanner input = new Scanner (System.in);
	 System.out.print("������ �Է��ϼ��� : ");
	 String score = input.nextLine();
	 char grade; 
	 int jumsu = Integer.parseInt(score); 
	 if (0<=jumsu && jumsu<=100){
		 if (jumsu>=90){
			 grade= 'A';
		 }else if (jumsu>=80) {
			 grade= 'B';
		 }else if (jumsu>=70) {
			 grade= 'C';
		 }else {
			 grade= 'F';
		 }
		System.out.println(grade + "&" + jumsu);
	 }else {
		System.out.println("��ȿ�� ������ �Է����ּ���.");
		return;
	 }
	
	}

}
