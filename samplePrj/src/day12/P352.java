package day12;

public class P352 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ��ü ������ ���� ������ �Լ��� private ó��
		SingleTone.getInstance();
		SingleTone.getInstance();
		SingleTone.getInstance();
		SingleTone.getInstance();
		//�̱����� ȣ���Ϸ��� ���ν��Ͻ� �޼ҵ带 ���ؾ��ϰ� �̰� static�ϰ� �� �ϳ��� ȣ���. �������� ���� �ϳ��� ��ü�� �����ؼ� ����ϰ� �ȴ�.
		
		
	}

}
class SingleTone{
	private static SingleTone tone =  new SingleTone();
	private SingleTone(){
		System.out.println("SingleTone() ������");
	}
	public static SingleTone getInstance(){
		return tone;
	}
}