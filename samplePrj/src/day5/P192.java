package day5;

import java.util.Arrays;

public class P192 {

	public static void main(String[] args) {
		// �迭�� �ҽ�ī��(ũ�Ⱑ �������ִ� �迭�� �����ؼ� �� ū �迭�� �Ѱ��ִ� ���)
		
		int[] src = {66,77,88,99,10,32,};
		System.out.println("����\t" + Arrays.toString(src));
		//�̷� ���� �迭�� ������ ������¡�� �Ұ����ϴٴ� ������ �ִ�.
		
		int[] desti = new int[src.length*2];
		System.out.println("ī�� ��\t" + Arrays.toString(desti));
		
		System.arraycopy(src, 0, desti, src.length, src.length);
		System.out.println("ī�� ��\t" + Arrays.toString(desti));
		
		//System.arraycopy(����ҽ� ������Ʈ, ���������ġ(����), ����� �� ������Ʈ, ����� ��ġ(����), ��� �ѱ�ž�);		
		//�ּҴ� ��� ������Ʈ�̴�.
	}

}
