package day4;

import java.util.Scanner;

public class P155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char gender;
		String regNo;
		Scanner input = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �ּ���. (��:000101-1000101) ");
		regNo = input.nextLine();
		
		if(regNo.length()==14){
		
			gender = regNo.charAt(7);
			switch(gender){
				case '1': 
				case '3':
				System.out.println("����");
				break;
				case '2': 
				case '4':
				System.out.println("����");
				break;
				default:
				System.out.println("���� �����Դϴ�.");
				;
			}
			
			
			String result = (gender == '1' || gender == '3')? "Male":"Female";
			System.out.println(result);
			
			
		}else{
			
			System.out.println("�ֹι�ȣ�� ����� �Է��ϼ���.");
			return;
		//if�����̳� switch�������� ����� ��� �ɱ��?
		}
		
	}

}
