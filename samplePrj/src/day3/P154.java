package day3;

import java.util.Scanner;

public class P154 {

	public static void main(String[] args) {
		//키보드를 통해서 점수를 입력받고 
		//그 점수가 유효하다면 등급처리
	
	 Scanner input = new Scanner (System.in);
	 System.out.print("점수를 입력하세요 : ");
	 String score = input.nextLine();
	 char grade; 
	 int jumsu = Integer.parseInt(score); 
	 if (0<=jumsu && jumsu<=100){
		
		 switch (jumsu/10){
		 case 10:
		 case 9:
			 grade='A';
			 break;
		default:
			grade='F';
		 }
		System.out.println(grade + "&" + jumsu);
	 }else {
		System.out.println("유효한 점수를 입력해주세요.");
		return;
	 }
	
	}

}
