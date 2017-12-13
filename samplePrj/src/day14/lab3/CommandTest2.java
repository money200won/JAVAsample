package day14.lab3;

public class CommandTest2 {

	public static void main(String[] args) throws Exception {
		Command cmd = null;
		
		Class cls = Class.forName(args[0]);
		//DB연동할 때 계속 계속 쓸 구문 args[0]에 띄울 클래스 이름을 받아오겠다. = 클래스이름을 가져와 args[0]에 넣음
		cmd =(Command) cls.newInstance();
		cmd.exe();
		cmd.newMethod();

	}

}
