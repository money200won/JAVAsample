package day5;

public class P206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scors = {99,30,33,41,100};
		String[] names = {"ȫ�浿","�ڰ���","���ڹ�","������","������"}; 
		//int[]�� String[]�� ���̴� int�� ������� �迭�ȿ� ���� ���ִ� ���̰�
		//String�� ��쿡�� �迭�� �ּҸ� ����ֱ� ������ .�� �� �� �ִ�.
		
		for(int i=0;i<scors.length;i++){	
			System.out.println(names[i].charAt(0)+ "**\t" + scors[i]);
			//names[i].�� ���� �ִ°� ��Ʈ��Ÿ���� �����̶��� ��������
		}
		
		System.out.println("==========================================");
		
		for(int data:scors){
			System.out.println(data);
		}
		for(String data:names){
			System.out.println(data);
		}
	}

}
