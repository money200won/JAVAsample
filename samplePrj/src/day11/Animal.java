package day11;

public class Animal {
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

	public void breath() {
		System.out.println("�� ȣ��");
	}
}
