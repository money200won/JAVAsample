package day20;

import java.util.*;

public class Test02 {

	public static void main(String[] args) {
		Command cmd = null;
		
		Command delete =new DeleteCommand();
		Command update =new UpdateCommand();
		Command insert =new InsertCommand();
		Command select =new SelectCommand();
		/*
		if(args[0].length() == 0){
		System.out.println("주어진 단어들만 입력해주세요");
		return;
		}
		if(args[0].equals(delete)){
			delete.exe();
		}else if(args[0].equals(delete)){
			delete.exe();
		}else if(args[0].equals(delete)){
			delete.exe();
		}
		*/
		Map<String, Command> map = new HashMap();
		map.put("delete", delete);
		map.put("update", update);
		map.put("insert", insert);
		map.put("select", select);
		
		
		if(args[0].length() == 0){
			System.out.println("주어진 단어들만 입력해주세요");
			return;
		}
		map.get(args[0]).exe();
		
		
		
	}

}
