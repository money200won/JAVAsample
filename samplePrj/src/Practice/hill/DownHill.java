package Practice.hill;

public class DownHill {
	// �޾ƿ��ų� ������ ���
static int[] arrsave1 ={};
	public static boolean downward(int[] arr, int groundnum) {
		boolean flag = false;
		int count = 0;
		int i;
		for (i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			} else {
				if (arr.length - (count + 1) >= groundnum && arr[i + 1] == arr[i] - 1) {
					flag = true;
					int[] tmp = new int[arr.length];
					System.arraycopy(arr, count+1, tmp, count+1, arr.length-1-count);for (int k = 0; k<arr.length;k++){
						if (tmp[k]==0){
							tmp[k]=2;
						}
					}
					arrsave1=tmp;

				}
				break;
			}
		}
		return flag;
	}
	public int[] arrsave(){
		return arrsave1;
	}
}