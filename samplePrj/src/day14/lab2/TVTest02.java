package day14.lab2;

public class TVTest02 {

	public static void main(String[] args) {
		TV user = null;
		//ó���� user�� Ŭ�� ���� �������̽� Ÿ������ ����Ǿ� �־����
		if (args[0].equals("P")){//agrs�� �׻� �迭�� ���� ���� �ѹ����� �þ �迭�� ����ȴ�.
			user = new PTV();
		}else if(args[0].equals("S")){
			user = new STV();
		}else if(args[0].equals("L")){
			user = new LTV();
		}
		//�������ε� : ���⼭ � ������ Ŭ�󽺸� ȣ���� �� �� args�� �޾Ƽ� ��Ȳ�� ���� �ٸ� Ŭ�󽺰� ȣ���
		user.poweron();
		user.poweroff();
		//���� Ŭ�� ������ ���� �ٸ� ����� ���
	}

}

interface TV {
	void poweron();
	void poweroff();
}

class LTV implements TV{

	@Override
	public void poweron() {
		System.out.println(getClass().getSimpleName()+"PowerOn()");
	}
	@Override
	public void poweroff() {
		System.out.println(getClass().getSimpleName()+"PowerOff()");
	}
	
}

class STV implements TV{

	@Override
	public void poweron() {
		System.out.println(getClass().getSimpleName()+"PowerOn()");
	}
	@Override
	public void poweroff() {
		System.out.println(getClass().getSimpleName()+"PowerOff()");
	}
	
}

class PTV implements TV{

	@Override
	public void poweron() {
		System.out.println(getClass().getSimpleName()+"PowerOn()");
	}
	@Override
	public void poweroff() {
		System.out.println(getClass().getSimpleName()+"PowerOff()");
	}
}