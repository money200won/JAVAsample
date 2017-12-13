package day14.lab3;

public class CommandTest1 {

	public static void main(String[] args) {
		Command cmd = null;
		if (args[0].equals("D")){
			cmd = new DeleteCommand();
		}else if(args[0].equals("I")){
			cmd = new InsertCommand();
		}//기능 확장을 할 때마다 계속 업데이트를 해줘야하는 불편함이 있다.
		
		cmd.exe();
		cmd.newMethod();

	}

}
