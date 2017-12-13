package day19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 1; i<=10;i++){
			stack.push(i);
		}
		/*
		Stack<String> stack = new Stack<String>();
		for(int i = 1; i<=10;i++){
			stack.push(""+i);
		}이런식으로 콜랙션 프레임워크에서는 타입의 자유도가 높고 쉽게 변환할 수 있다.
		 */
		
		System.out.println(stack.pop());
		
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i = 0; i<=10 ; i++){
			queue.offer(i);
		}
		System.out.println(queue.poll());
	}

}
