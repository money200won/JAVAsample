package Practice;

import java.util.Arrays;
import java.util.Comparator;

public class D2sort {
	public D2sort(){
		
	}
	
	static	int[][] data = { { 1, 1000 }, { 2, 300 }, { 3, 20 }, { 4, 50 }, { 5, 600 } };
	//int[][] data = new int;

	//����ϴ� �κ��� Ȯ�������ϱ� ���� �����͸� �޾ƿͼ� �޼ҵ�� ������ �� �ֵ��� �����ؾ���
	static	int[][] mm() {
		Arrays.sort(data, new Comparator<int[]>() {

			public int compare(final int[] entry1, final int[] entry2) {
				final int time1 = entry1[1];
				final int time2 = entry2[1];
				return Integer.compare(time2, time1);
			}

		});
		return data;
	}

}
