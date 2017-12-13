package day20;

public class Test04 {

	public static void main(String[] args) {

		if(args[0].length() == 0){
			System.out.println("�־��� �ܾ�鸸 �Է����ּ���");
			return;
		}
		Command delete =new DeleteCommand(){
			public void exec(){
				System.out.println("~~~����");
			}
		};
		Command update =new UpdateCommand(){
			public void exec(){
				System.out.println("~~~����");
			}
		};
		Command insert =new InsertCommand(){
			public void exec(){
				System.out.println("~~~����");
			}
		};
		Command select =new SelectCommand(){
			public void exec(){
				System.out.println("~~~");
			}
		};
			
		insert.exe();
		update.exe();
		delete.exe();
		select.exe();
			
	}

}
