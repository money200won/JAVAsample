package day16.exception;

public class ExceptionTest01 {

	public static void main(String[] args) {
		System.out.println("MAIN START");
		
		String name = null;
		if (name !=null && name.length() > 0 )
			//����ó���� �ϱ� �ռ� if�� �׻� ó���� �� �ִ��� �Ǵ��غ���
		System.out.println(name.charAt(0));
			//��Ÿ�� ����
		try {
			Class.forName(name);
			//Class.forname�� Ǯ��θ� ��������Ѵ�.
			//������ ClassNotFoundException�� �ִ�. �� ��Ÿ�� ���ܰ� �ƴ� üũ�� ����
		} catch (ClassNotFoundException e) {
	
			e.printStackTrace();
		}
		
		System.out.println("MAIN END");

	}

}
