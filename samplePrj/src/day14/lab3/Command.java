package day14.lab3;

public interface Command {
	void exe();
	default void newMethod(){//����Ʈ �޼ҵ带 �������� ���� ��ɱ����� �� �� �ִ� ���(JDK1.8)
		System.out.println("����Ʈ");
	}
	
}

class DeleteCommand implements Command{

	@Override
	public void exe() {
		System.out.println("����");
			
	}
	
}
class InsertCommand implements Command{

	@Override
	public void exe() {
		System.out.println("�Է�");
			
	}

	@Override
	public void newMethod() {
		// TODO Auto-generated method stub
		//Command.super.newMethod();
		System.out.println("�μ�Ʈ�� ����Ʈ �޼ҵ�");
	}
	
}
