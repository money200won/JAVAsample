package Practice.hill2;

import java.util.Arrays;

public class HillTest {
	public static void main(String[] args) {
		int roadcount = 0;
		int groundnum = 2;
		/*
		int[][] oldarr = {{3, 3, 3, 3, 3, 3},{
				2, 3, 3, 3, 3, 3},{
				2, 2, 2, 3, 2, 3},{
				1, 1, 1, 2, 2, 2},{
				1, 1, 1, 3, 3, 1},{
				1, 1, 2, 3, 3, 2}};
		
		
		int[] arr={};// = { 1, 2, 1, 1, 1, 2, 1 };
		for (int x = 0; x<oldarr.length; x++){
			for (int y = 0; y<oldarr[x].length ;y++){
				System.arraycopy(arr[x], 0, oldarr[x][y], 0, 1);
			}System.out.println(arr[x]);
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int[] arr={ 1, 1, 1, 1, 2, 3, 3 };
		
		int j = 0;

		for (int i = 0; i < arr.length-1; i++) {
		
			if (arr[i] == arr[i + 1]) {
				j++;
			} else if (arr[i] == (arr[i+1] - 1 ) && UpHill.upward(arr, groundnum)) {
				j++;
				arr=UpHill.arrsave1;
			} else if (arr[i] == (arr[i+1] + 1) && DownHill.downward(arr, groundnum)) {
				j++;
				arr=DownHill.arrsave1;
			}
		}
		
		if (j == arr.length - 1){
			roadcount++;
		}
		System.out.println(roadcount);
		
		
		
		
		
		
	}
}
