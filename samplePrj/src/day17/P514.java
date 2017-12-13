package day17;

import java.util.Arrays;
import java.util.StringTokenizer;

import util.Array;

public class P514 {

	public static void main(String[] args) {
		String msg = "홍준표: 90/100/80";
		String[] data = msg.split(":");
		System.out.println(Arrays.toString(data));
		String[] jumsu = data[1].split("/");
		System.out.println(Arrays.toString(jumsu));
		//어려가지 나누는 기호가 있을 때 여러 방법으로 나누는 방법
		StringTokenizer st = new StringTokenizer(msg, ":/");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()){
			String s = st.nextToken().trim();
			System.out.println(s);
		}
		

	}

}
