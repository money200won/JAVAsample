package day5;

public class P185 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		String[] names = new String[3];// 배열생성을 바로
		for(String data1:names){
		System.out.print(names);//String은 초기화 되면 null이 들어있어
		}
		System.out.println("\n=====================");
		
		char[] chas;
		chas = new char[5];
		System.out.print(chas[0]+",");//String은 초기화 되면 null이 들어있어

		int[] score;
		score = new int[5];// 배열생성
		for (i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");// 기본적으로 초기화가 이루어져 공간안에 0이 있나봄
		}
		System.out.println("\n===========================");
		//새로나온 for roof 
		for(int data:score){
			System.out.print(data+" ");
		}
		
	}

}
