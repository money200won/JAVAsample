package Practice;

public class Array {

	public static int[] sort(int[] a) {
		int[] b = new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 1; j < a.length - 1; j++) {
				if (a[i] < a[j]) {
					int tmp;
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		return a;

		// �����ϰ� ��� ������ �Լ��� ����� ������..
		// �� source data a�� ������ �ǵ��ϸ��弼��

	}
	
	public static int[][] sort(int[][] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 1; j < a.length - 1; j++) {
				if (a[i][1] < a[j][1]) {
					int[] tmp = new int[a.length];
					System.arraycopy(a[i], 0, tmp, 0, a.length); 
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		return a;
	}
	
}


