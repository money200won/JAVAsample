package day20;

public class Test04 {

	public static void main(String[] args) {

		if(args[0].length() == 0){
			System.out.println("주어진 단어들만 입력해주세요");
			return;
		}
		Command delete =new DeleteCommand(){
			public void exec(){
				System.out.println("~~~삭제");
			}
		};
		Command update =new UpdateCommand(){
			public void exec(){
				System.out.println("~~~삭제");
			}
		};
		Command insert =new InsertCommand(){
			public void exec(){
				System.out.println("~~~삭제");
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
