package day14.lab3;

public class CommandTest2 {

	public static void main(String[] args) throws Exception {
		Command cmd = null;
		
		Class cls = Class.forName(args[0]);
		//DB������ �� ��� ��� �� ���� args[0]�� ��� Ŭ���� �̸��� �޾ƿ��ڴ�. = Ŭ�����̸��� ������ args[0]�� ����
		cmd =(Command) cls.newInstance();
		cmd.exe();
		cmd.newMethod();

	}

}
