package day16.exception;

public class ExceptionTest01 {

	public static void main(String[] args) {
		System.out.println("MAIN START");
		
		String name = null;
		if (name !=null && name.length() > 0 )
			//예외처리를 하기 앞서 if로 항상 처리할 수 있는지 판단해보자
		System.out.println(name.charAt(0));
			//런타임 예외
		try {
			Class.forName(name);
			//Class.forname은 풀경로를 적어줘야한다.
			//들어가보면 ClassNotFoundException이 있다. 즉 런타임 예외가 아닌 체크드 예외
		} catch (ClassNotFoundException e) {
	
			e.printStackTrace();
		}
		
		System.out.println("MAIN END");

	}

}
