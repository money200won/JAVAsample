package Practice;

import java.util.Arrays;

public class TestD2 {
	public static void main(String[] args) {
		int[][] data = { { 1, 1000 }, { 2, 300 }, { 3, 20 }, { 4, 50 }, { 5, 600 } };

		for (int i = 0; i < data.length; i++) {
			System.out.println(Arrays.toString(D2sort.data[i]));
		}
		D2sort.mm();
		for (int i = 0; i < data.length; i++){
			System.out.println(Arrays.toString(D2sort.data[i]));	
		}	
	}
	
}
