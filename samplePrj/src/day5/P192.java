package day5;

import java.util.Arrays;

public class P192 {

	public static void main(String[] args) {
		// 배열의 소스카피(크기가 정해져있는 배열을 복사해서 더 큰 배열로 넘겨주는 방법)
		
		int[] src = {66,77,88,99,10,32,};
		System.out.println("원본\t" + Arrays.toString(src));
		//이런 식의 배열의 단점은 리사이징이 불가능하다는 단점이 있다.
		
		int[] desti = new int[src.length*2];
		System.out.println("카피 전\t" + Arrays.toString(desti));
		
		System.arraycopy(src, 0, desti, src.length, src.length);
		System.out.println("카피 후\t" + Arrays.toString(desti));
		
		//System.arraycopy(복사소스 오브젝트, 복사시작위치(정수), 복사될 곳 오브젝트, 복사될 위치(정수), 몇개나 넘길거야);		
		//주소는 모두 오브젝트이다.
	}

}
