package day20;

public class Test05 {

	public static void main(String[] args) {
		//���ٽ� ������ �Լ� ���, ��ü�ϰ�� �ణ �ٸ� �ý���
		
		Command delete = ()->{
			System.out.println("����Ʈ ����~~");
		};
		Command update = ()->{
			System.out.println("���� ����~~");
		};
		Command insert = ()->{
			System.out.println("���Ʈ ����~~");
		};
		Command select = ()->{
			System.out.println("���� ����~~");
		};
		
		select.exe();
		

	}

}


@FunctionalInterface
interface Command {//��ų� �������̽��� �߻�޼ҵ尡 �� �ϳ��� ������. �ٵ� ����Ʈ �޼ҵ�� ���������� �� ����!
	
	void exe();
	default void print(){
		System.out.println("�ٸ��� ���� ����Ʈ��� �����մϴ�.");
		
	};
	
}

class InsertCommand implements Command{

	@Override
	public void exe() {
		System.out.println("���� ����");
		
	}

}


class DeleteCommand implements Command {

	@Override
	public void exe() {
		System.out.println("����� ����");
		
	}

}

class UpdateCommand implements Command {

	@Override
	public void exe() {
		System.out.println("���� ����");
		
	}

}

class SelectCommand implements Command {

	@Override
	public void exe() {
		System.out.println("���� ����");
		
	}

}