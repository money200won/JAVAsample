package day20;

import java.util.*;

public class Prob1 {

	public static void main(String[] args) {
		
		String[] datas = new String[10];
		for (int i =0; i<10;i++){
			datas[i]=String.valueOf(i);
		}
		
		System.out.println(moveToVector(datas));
	}

static Vector<String> moveToVector(String datas[]) {
		
		if (datas.length == 0 && datas.equals(null)){
			System.out.println("처리할 값이 없습니다.");
			return null;
		}
		
		Vector<String> vs= new Vector<String>();
		
		for (int i=datas.length-1;i>=0;i--){
			vs.add(datas[i]);
		}
		
		
		return vs;
	}

	
}

	