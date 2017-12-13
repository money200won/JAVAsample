package day15.inner3;

public class InnerTest01 {
	public static void main(String[] args) {
		if(args.length==0){//args는 비어있지 않기 때문에 길이로 검증해야한다.
			System.out.println("글자를 넣어요 글자를");
			return;
		}
		
		else if (args[0].equals("delete")) {
		Command delete = new DeleteCommand();
		delete.exe();
		}
		else if (args[0].equals("insert")) {
			Command insert = new Command() {// 이름이 없는 Command를 implement한 클래스를
											// 생성합니다.(익명클래스)
				public void exe() {
					System.out.println("INSERT");
				}
			};
			insert.exe();
		}
		
		else if (args[0].equals("update")) {
			Command update = new Command() {
				
				public void exe() {
					System.out.println("UPATE");
				}
			};
			update.exe();
		}
		
		else if (args[0].equals("select")) {
			Command select = new Command() {
				
				public void exe() {
					System.out.println("SELECT");
				}
			};
			select.exe();
		}
		
		else if (args[0].equals("search")) {
			Command search = new Command() {
				
				public void exe() {
					System.out.println("SEARCH");
				}
			};
			search.exe();
		}
		else{
			System.out.println("헛소리하지마 임마");
		}
		
		
	}
}

interface Command {
	void exe();
}

class DeleteCommand implements Command{
		public void exe() {
			System.out.println("DELETE");
		}
}
