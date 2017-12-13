package Practice.hill2;

import java.util.Arrays;

public class DownHillprac {
	public static void main(String[] args) {
		
	
	int groundnum = 2;
	int[] arr = { 2, 2, 2, 2, 2, 1, 1 };

	
		boolean flag = false;
		int count = 0;
		int i;
		for (i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			} else {
				System.out.println(i);//4
				System.out.println(groundnum);// 2
				System.out.println(count);// 4
				System.out.println(arr[i]);// 2
				System.out.println(arr[i + 1]);// 1
				if (arr.length-(count + 1) >= groundnum && arr[i + 1] == arr[i] - 1) {
					flag = true;
					System.out.println(flag);//true
					int[] tmp = new int[arr.length];
					System.arraycopy(arr, count+1, tmp, count+1, arr.length-1-count);for (int k = 0; k<arr.length;k++){
						if (tmp[k]==0){
							tmp[k]=2;
						}
					}
					System.out.println(Arrays.toString(arr));//[1, 1, 1, 2, 2, 1, 1]
					System.out.println(Arrays.toString(tmp));//[2, 1, 1]
					arr=tmp; 
					System.out.println(Arrays.toString(arr));//[2, 1, 1]
					
					
				}
				break;
			} 
		/*for (i = arr.length-1 ; i >=0 ; i--) {
			if (arr[i-1] == arr[i]) {
				count++;
				} 
			else {
				System.out.println(i);//5
				System.out.println(groundnum);// 2
				System.out.println(count);// 1
				System.out.println(arr[i]);// 1
				System.out.println(arr[i - 1]);// 1
				if (count + 1 >= groundnum && arr[i-1]+1 == arr[i]) {
					flag = true;
					int[] tmp = new int[i];
					System.arraycopy(arr, 0, tmp, 0, arr.length-count+1);
				
				}
				break;
			}*/ 
		}System.out.println(flag);
	}
	
}
