package day2;

public class P95 {
	
	public static void main(String[] args) {
		float x = 'a';
		double y = 7 + 8 * x;
	System.out.printf("y= %.0f %n",y);
	
	int i=5, j=5;
	System.out.printf("������ : i>j %b %n",i,j);
	//%s ���ڿ�, �� �𸣰��� ��� ����. %b boolean Ÿ��
	System.out.printf("�� : i = %d,j = %d %n",i,j);
	System.out.println(++i);
	//++�����ڿ� i�� ����ֳ��� ���� �ٸ����
	//�տ� ������ ���� �ҷ����� ���� ���ϰ�
	//�ڿ� ������ ���� ���� �ҷ�����
	System.out.printf("�� : i = %d,j = %d %n",i,j);
	System.out.printf("�� : i = %d,j = %d : i==j -> %s %n",i,j,i==j);
	//==�������� Ư¡
	//i==j�� ������ �⺻ �����͸� ���ϴ� ��
	//������������ ���(Ȥ�� ��ü) name1==name2�ȵǰ� name.equals(name2)�� �ؾ���
	//����� ���� ���� ���� !(name.equals(name2))
	int sum = 100;
	sum += (int)y;
	System.out.println(sum);
	System.out.println(sum % 100);
	System.out.println(sum / 10);
	
	}
}
