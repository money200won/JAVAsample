package day14.lab2;

public class TVTest02 {

	public static void main(String[] args) {
		TV user = null;
		//처음에 user가 클라스 통합 인터페이스 타입으로 선언되어 있어야함
		if (args[0].equals("P")){//agrs는 항상 배열로 들어간다 띄어쓰기 한번마다 늘어난 배열에 저장된다.
			user = new PTV();
		}else if(args[0].equals("S")){
			user = new STV();
		}else if(args[0].equals("L")){
			user = new LTV();
		}
		//동적바인딩 : 여기서 어떤 종류의 클라스를 호출해 올 지 args로 받아서 상황에 따라 다른 클라스가 호출됨
		user.poweron();
		user.poweroff();
		//들어온 클라스 종류에 따라 다른 결과를 출력
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