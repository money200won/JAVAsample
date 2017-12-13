package Practice;

import java.util.Arrays;
import java.util.Comparator;

public class D2sort {
	public D2sort(){
		
	}
	
	static	int[][] data = { { 1, 1000 }, { 2, 300 }, { 3, 20 }, { 4, 50 }, { 5, 600 } };
	//int[][] data = new int;

	//기능하는 부분은 확인했으니까 이제 데이터를 받아와서 메소드로 움직일 수 있도록 설정해야함
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
