package day15.exception;

public class ExceptionTest02 {

	public static void main(String[] args) {
		
		try {
			Thread.sleep(2000);
			//�ݵ�� Ʈ���� ĳġ ������ ����Ѵ� üũ��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("START");


		String name = null;
		if(name != null)
			System.out.println(name.toString());
		//���� Ʈ���� ĳġ �� �ʿ�� ����. �׷��� ��üũ��
		
		System.out.println("END");
			
		
	}

}
