package day10;

public class Fish extends Animal {
	String name;
	public void breath(){
		System.out.println("�ư��� ȣ��");//�������̵�
		//����! �������̵� �� �޼ҵ�� �θ��� �޼ҵ带 ȣ���ص�((Animal)f).breath(); �������̵� �� ���� ȣ���Ѵ�.
		//ĳ�������δ� �Ұ����ϰ� ��Ȯ�� ��� �����ϸ� ȣ���� �����ϱ� ��. super.f.breath();
	}
}
