package day13test;
//인터페이스 클라스는 추상변수 추상메소드만 가능 abstract 클라스는 둘 다 가능했다는 것이 다름
//클라스 이름 끝에 able이 붙는 것이 일반적
public interface Drawable {
	//인스턴스 변수는 전부 파이널 처리가 되고 인스턴스 메소드는 오지도 못함 int name;-파이널 할거니 초기화하라고 오류
	public abstract void draw();
}
interface Colorable{
		void drawcolor();
}