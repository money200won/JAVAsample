package Practice;

public class Gear {
	public static void main(String[] args) {
		int control=1;
		int num=0;
		int[][] arr =	{{1,1,1,1,1,1,1,0},
						{1,1,1,1,1,1,1,1},
						{1,1,1,1,1,1,1,1},
						{1,1,1,1,1,1,1,1}};
		//gear ¹è¿­·Î »¬±î?
		int numofpick = 2;
		
			if (control==1){
				if(arr[num][4]==arr[num+1][0]){
				int tmp=arr[num][7];
				System.arraycopy(arr[num], 0, arr[num], 1, 7);
				arr[num][0]=tmp;
				}
		}
			if (control==-1){
				if(arr[num][4]==arr[num+1][0]){
				int tmp=arr[num][0];
				System.arraycopy(arr[num], 1, arr[num], 0, 7);
				arr[num][7]=tmp;
				}
		}
		
		
		System.out.println(java.util.Arrays.toString(arr[0]));
				
	}
}
