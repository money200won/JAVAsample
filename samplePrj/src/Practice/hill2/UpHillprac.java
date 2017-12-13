package Practice.hill2;

import java.util.Arrays;

public class UpHillprac {

	public static void main(String[] args) {// 테스트용
		// 스태틱한 카운트가 필요
		int groundnum = 2;
		int count = 0;
		// 장애물을 만나기 전까지 같은 숫자의 개수
		int[] arr = { 1, 1, 1, 2, 2, 1, 1 };
		int i;
		boolean flag = false;
		for (i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			} else {
				System.out.println(i);//2
				System.out.println(groundnum);// 2
				System.out.println(count);// 2
				System.out.println(arr[i]);// 1
				System.out.println(arr[i + 1]);// 2
				if (count + 1 >= groundnum && arr[i + 1] == arr[i] + 1) {
					flag = true;
					System.out.println(flag);//true
					int[] tmp = new int[arr.length];
					System.arraycopy(arr, count+1, tmp, count + 1, arr.length-1-count);
					for (int k = 0; k<arr.length;k++){
						if (tmp[k]==0){
							tmp[k]=2;
						}
						
					}
					System.out.println(Arrays.toString(arr));//[1, 1, 1, 2, 2, 1, 1]
					System.out.println(Arrays.toString(tmp));//[2, 2, 1, 1]
					arr=tmp; 
					System.out.println(Arrays.toString(arr));//[2, 2, 1, 1]
					
					
				}
				break;
			} 
		}
		System.out.println(flag);
		System.out.println(arr.length);
		System.out.println(count);
	}

}
