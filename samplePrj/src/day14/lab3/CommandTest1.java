package day14.lab3;

public class CommandTest1 {

	public static void main(String[] args) {
		Command cmd = null;
		if (args[0].equals("D")){
			cmd = new DeleteCommand();
		}else if(args[0].equals("I")){
			cmd = new InsertCommand();
		}//��� Ȯ���� �� ������ ��� ������Ʈ�� ������ϴ� �������� �ִ�.
		
		cmd.exe();
		cmd.newMethod();

	}

}
