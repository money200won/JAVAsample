package day15.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println("START");
		try{
			System.out.println("TRY{");
			
			System.out.println(args[0].length());
			//보기엔 문제가 없는데 런타임에 오류가 발생한다.
			int num = Integer.parseInt(args[0]);
			System.out.println(10/num);
			System.out.println("}");
			//TRY{는 실행되는데 그 아래는 수행되지 않는 이유는 거기까지 가기 전에 에러때문에 catch로 넘어가기 때문.
			//여기에 자원반납같은게 있으면 수행이 안된다. 그러니까 자원반납같은건 전부 finally에 넣어야함
		}catch (ArrayIndexOutOfBoundsException e){
			//catch(exception e){}	로 예외는 죄다 예외처리할 수도 있는데 이러면 사용자가 뭐가 문젠지 알수가 없다.
			System.out.println("접근할 수 없는 배열 인덱스 사용(입력이 없음)");
		}catch (NumberFormatException e){
			System.out.println("숫자를 입력해주세요.");
			System.out.println(e);
			//오류내용 출력
			e.printStackTrace();
			System.out.println(e.getMessage());
			//오류내용 출력
		}catch (Exception e){
			System.out.println("아 왜 오류나는지 모르겠다 !");
		}
		finally{
		System.out.println("자원반납은 여기에");
		//다른 어떤 문제가 발생하더라도 반드시 죽기전에 수행하고 죽음. 그래서 return같은 자원반납은 여기에 반드시 해야함.
		}
		System.out.println("END");
		//여기에 넣어두면 정상종료가 되는지 확인할 수 있다. 여기까지 안오면 비정상종료니까
	}

}
