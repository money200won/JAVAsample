package day2;

import java.util.Date;
//import java.sql.Date;�̷������� �ϸ� Date�� �ΰ��� ������
//�׷��� �ٸ� ��Ű���� �����͸� ������ ���� ���������� Ǯ�н��� ����������մϴ�.
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//java.util.Date now = new java.util.Date();
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getYear());
		
		java.sql.Date today = null;
		System.out.println(today);
		
		now = null;
	
		//new�� �ʱ�ȭ�� �ߴٴ� �� �̰� ���ϸ� ���� ���� �������̱� ����
		//now�� ����Ʈ �������Դϴ�. �޸� ���� ����ƮŬ������ �÷���
		//ó���Ұ̴ϴ�.
		//���� �������̱� ������ ���(Path)�� �ϳ��� �����ؾ��Ѵ�.
		//�̷��°� �������ϱ� �׳� �ۿ� import�� �ϴ� ����� �ִ�.
		//��ģ�Ŵ� ���� �Ⱦ��°Ŵϱ� �ٸ��� ����ϴ� api
		//null ������ ����Ű�� �ִ� ���� ���ٴ� ��
		//�������� now = null;�� ���� now�� �� ������ �޸𸮿��� ������� ��
		//�ʿ��ϸ� new�� �޸𸮿� �ø��� �� ���� null�� ������ �ϴ°ǵ� 
		//spring�� ���� new�� null�� �Ⱦ���. �ڵ����� �������� ������ �̰�
		//��Ʈ���ϴ°� �� ����� �� �־�
		
	}

}
