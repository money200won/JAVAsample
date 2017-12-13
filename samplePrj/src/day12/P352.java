package day12;

public class P352 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//여러 객체 생성을 막는 생성자 함수의 private 처리
		SingleTone.getInstance();
		SingleTone.getInstance();
		SingleTone.getInstance();
		SingleTone.getInstance();
		//싱글톤을 호출하려면 겟인스턴스 메소드를 구해야하고 이건 static하게 단 하나만 호출됨. 여러개를 만들어도 하나의 계체만 공유해서 사용하게 된다.
		
		
	}

}
class SingleTone{
	private static SingleTone tone =  new SingleTone();
	private SingleTone(){
		System.out.println("SingleTone() 생성자");
	}
	public static SingleTone getInstance(){
		return tone;
	}
}