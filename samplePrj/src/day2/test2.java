package day2;

import java.util.Date;
//import java.sql.Date;이런식으로 하면 Date가 두개라 오류남
//그래서 다른 패키지의 데이터를 가져올 때는 개별적으로 풀패스를 지정해줘야합니다.
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//java.util.Date now = new java.util.Date();
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getYear());
		
		java.sql.Date today = null;
		System.out.println(today);
		
		now = null;
	
		//new는 초기화를 했다는 뜻 이걸 안하면 에러 참조 데이터이기 때문
		//now는 데이트 데이터입니다. 메모리 힙에 데이트클래스를 올려서
		//처리할겁니다.
		//참조 데이터이기 때문에 경로(Path)를 하나한 지정해야한다.
		//이러는게 귀찮으니까 그냥 밖에 import를 하는 방법이 있다.
		//줄친거는 이젠 안쓰는거니까 다른거 써라하는 api
		//null 아직은 가리키고 있는 것이 없다는 뜻
		//마지막에 now = null;은 이제 now는 다 썼으니 메모리에서 내리라는 뜻
		//필요하면 new로 메모리에 올리고 다 쓰면 null로 내리고 하는건데 
		//spring에 가면 new랑 null을 안쓴다. 자동으로 해주지만 오히려 이걸
		//컨트롤하는게 또 어려울 수 있어
		
	}

}
