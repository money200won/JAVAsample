package day4;

public class P167 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		while(count<5){
			System.out.println("Hello Java");
		count++;
		}
		boolean flag = true;
		while(flag){
			System.out.println("~~~~~~~~~~");
			if (count==5) flag = !flag;
		}
		
		System.out.println("Main End");
		
	}

}
