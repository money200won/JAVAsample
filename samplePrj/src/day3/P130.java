package day3;

public class P130 {

	public static void main(String[] args) {
		int jumsu = 90;
		if(0 <= jumsu && jumsu <= 100){
			String result = (80<=jumsu)? "Pass" : "Fail";
			System.out.println(result);
		}else{
			System.out.println("점수 오류");
		
		}
		
		System.out.println("================");
		
		char c = (0 <= jumsu && jumsu <= 100) ? 'O' : 'X' ;

		
		
		String result = (80<=jumsu)? "Pass" : "Fail";
		
		System.out.println(c+" & "+result);

		System.out.println("================");
		
		int i=100, j=200;
		int max = (i>j)? i : j ;
		System.out.println(max);
		System.out.println("max : " + ((i>j)? i : j));
		
	}

}
