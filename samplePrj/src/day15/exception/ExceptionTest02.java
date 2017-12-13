package day15.exception;

public class ExceptionTest02 {

	public static void main(String[] args) {
		
		try {
			Thread.sleep(2000);
			//반드시 트라이 캐치 구문을 써야한다 체크드
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("START");


		String name = null;
		if(name != null)
			System.out.println(name.toString());
		//전부 트라이 캐치 할 필요는 없다. 그런게 언체크드
		
		System.out.println("END");
			
		
	}

}
