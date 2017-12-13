package day4;

import java.util.Scanner;

public class P155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char gender;
		String regNo;
		Scanner input = new Scanner(System.in);
		System.out.println("주민번호를 주세요. (예:000101-1000101) ");
		regNo = input.nextLine();
		
		if(regNo.length()==14){
		
			gender = regNo.charAt(7);
			switch(gender){
				case '1': 
				case '3':
				System.out.println("남성");
				break;
				case '2': 
				case '4':
				System.out.println("여성");
				break;
				default:
				System.out.println("성별 오류입니다.");
				;
			}
			
			
			String result = (gender == '1' || gender == '3')? "Male":"Female";
			System.out.println(result);
			
			
		}else{
			
			System.out.println("주민번호를 제대로 입력하세요.");
			return;
		//if구문이나 switch구문으로 만들면 어떻게 될까요?
		}
		
	}

}
