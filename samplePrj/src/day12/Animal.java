package day12;

public abstract class Animal {
	private String kind = "������ ����";

	public Animal() {
		super();//����Ʈ �����ڸ� ������ �ݵ�� ���� ������ ������ �Լ��� �ٳ�´�.
		//System.out.println("Animal�� ����Ʈ �������Լ�����.");
	}

	public Animal(String kind) {
		super();
		this.kind = kind;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public abstract void breath();//abstract �޼ҵ带 �������� Ŭ�������� abstract�� ��ŷ�ؾ���
}
