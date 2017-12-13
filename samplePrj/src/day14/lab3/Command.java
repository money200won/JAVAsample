package day14.lab3;

public interface Command {
	void exe();
	default void newMethod(){//디폴트 메소드를 만들어서에러 없이 기능구현을 할 수 있는 기능(JDK1.8)
		System.out.println("디폴트");
	}
	
}

class DeleteCommand implements Command{

	@Override
	public void exe() {
		System.out.println("삭제");
			
	}
	
}
class InsertCommand implements Command{

	@Override
	public void exe() {
		System.out.println("입력");
			
	}

	@Override
	public void newMethod() {
		// TODO Auto-generated method stub
		//Command.super.newMethod();
		System.out.println("인서트의 디폴트 메소드");
	}
	
}
