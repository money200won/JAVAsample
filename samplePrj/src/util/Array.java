package util;

import java.util.Arrays;

public class Array {

	public static int[] sort(int[] a) {
		int[] b = new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= a.length - 1; j++) {
				if (a[i] < a[j]) {
					int tmp;
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(a));
		return a;

		// 유용하게 사용 가능한 함수를 만들어 보세요..
		// 단 source data a는 보존이 되도록만드세요

	}
}


