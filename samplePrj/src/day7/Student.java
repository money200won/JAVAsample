package day7;

import java.util.Arrays;

public class Student {
	String name;
	int[] score = new int[3];
	int sum;
	double avg;

	public void proc() {
		sum=0;
		//프로세스를 두번 호출하면 합계가 기존의 합계에 다시 합하는 문제를 해결하기 위한 부분
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		avg = sum / score.length;
	}
	public void display(){
		System.out.println("=================================");
		System.out.println("성적처리 결과값");
		System.out.println("이름_"+name);
		System.out.println("성적_"+Arrays.toString(score));
		System.out.println("총합_"+sum);
		System.out.println("평균_"+avg);
		System.out.println("=================================");
		
		}
}
