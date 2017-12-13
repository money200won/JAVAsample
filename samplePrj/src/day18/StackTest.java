package day18;

import java.util.ArrayList;
import java.util.Arrays;

public class StackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if (stack.isEmpty()) {
			System.out.println("스택이 비어있습니다.");
		}

		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}

		if (stack.isFull()) {
			System.out.println("스택이 가득 찼습니다.");
		}

		System.out.println("최상위 숫자 : " + stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
		for (int i = 1; i <= 20; i++) {
			int num = stack.pop();
			//if (num != -1)
				System.out.println(num);
		}
	}

}

class MyStack {
	int num;
	int[] stack;
	static int count = 0;

	public MyStack() {
		super();
		this.stack = new int[10];
	}

	public MyStack(int num) {
		super();
		this.num = num;
		if (num >= 0) {
			this.stack = new int[num];
		} else {
			this.stack = new int[10];
		}
	}

	public void push(int pushnum) {
		if (isFull()) {
			int[] newstack = new int[2*this.stack.length];
			System.arraycopy(stack, 0, newstack, 0, stack.length-1);
			stack = newstack;
			} else {
			stack[count] = pushnum;
			count++;
		}
	}

	public boolean isEmpty() {
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		if (count == stack.length) {
			return true;
		} else {
			return false;
		}
	}

	public int top() {
		int top;
		if (stack[count - 1] != 0) {
			top = stack[count - 1];
		} else {
			top = -1;
		}
		return top;
	}

	public int pop() {
		int pop;

		if (count > 0) {
			pop = stack[count - 1];
			count--;
		} else {
			pop = -1;
		}
		return pop;
	}

}
