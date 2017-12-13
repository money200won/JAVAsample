package day20;

public class Test05 {

	public static void main(String[] args) {
		//람다식 변수에 함수 등록, 객체하고는 약간 다른 시스템
		
		Command delete = ()->{
			System.out.println("딜리트 수행~~");
		};
		Command update = ()->{
			System.out.println("업뎃 수행~~");
		};
		Command insert = ()->{
			System.out.println("언써트 수행~~");
		};
		Command select = ()->{
			System.out.println("셀렉 수행~~");
		};
		
		select.exe();
		

	}

}


@FunctionalInterface
interface Command {//펑셔널 인터패이스는 추상메소드가 단 하나만 들어가진다. 근데 디폴트 메소드는 예외적으로 다 가능!
	
	void exe();
	default void print(){
		System.out.println("다른건 몰라도 디폴트라면 가능합니다.");
		
	};
	
}

class InsertCommand implements Command{

	@Override
	public void exe() {
		System.out.println("삽입 실행");
		
	}

}


class DeleteCommand implements Command {

	@Override
	public void exe() {
		System.out.println("지우기 실행");
		
	}

}

class UpdateCommand implements Command {

	@Override
	public void exe() {
		System.out.println("업뎃 실행");
		
	}

}

class SelectCommand implements Command {

	@Override
	public void exe() {
		System.out.println("선택 실행");
		
	}

}