package day15.inner3;

public class InnerTest01 {
	public static void main(String[] args) {
		if(args.length==0){//args�� ������� �ʱ� ������ ���̷� �����ؾ��Ѵ�.
			System.out.println("���ڸ� �־�� ���ڸ�");
			return;
		}
		
		else if (args[0].equals("delete")) {
		Command delete = new DeleteCommand();
		delete.exe();
		}
		else if (args[0].equals("insert")) {
			Command insert = new Command() {// �̸��� ���� Command�� implement�� Ŭ������
											// �����մϴ�.(�͸�Ŭ����)
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
			System.out.println("��Ҹ������� �Ӹ�");
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
