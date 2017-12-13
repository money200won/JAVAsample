package day16.lang;

public class LangTest01 {

	public static void main(String[] args) {
		Point p = new Point(1,1);
		System.out.println(p);
		p.close();//클로즈 메소드는 오버라이딩 해서 안에 내용을 넣을 수 있으며 반드시 p=null직전에 사용해야한다.
		p=null;//가비지콜랙터에게 p는 다 썼다고 메모리 관리하라고 알리는 부분, 이 부분 주석처리하면 자원이 반납안된걸 화인가능
		
		//System.gc(); 이건 잘 안쓰는게 메모리 관리만 하느라 이걸 쓰면 죄다 끈다. 
		//자바는 finalize를 잘 안쓰고 보통 클로즈 메소드를 쓴다.
		System.out.println("Main End");
		
		}

}

class Point implements Cloneable{
	int x;
	int y;
	
	public Point() {}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	@Override
	protected void finalize() throws Throwable {
		//선별자 역할을 하는 아이
		super.finalize();
		System.out.println(getClass().getSimpleName()+"finalize() 수행");
		System.out.println("자원반납코드");
		//메인엔드 뒤에 나온다는 것은 별도의 작업공간에서 작업이 된다는 것
	}
	void close(){
		System.out.println(getClass().getSimpleName()+"finalize() 수행");
		System.out.println("자원반납코드");
		}
	@Override
	protected Point clone() {
	//오브젝트 리턴타입이므로 항상 캐스팅을 해줘야한다.
	//클론 메소드는 오버라이딩 뿐만 아니라 추가로 implements Cloneable 라고 선언부에 써줘야함
		Point obj = null;
		try {
			obj = (Point) super.clone(); //clone()을 타입변경하는 것도 가능하다 단 캐스팅 필요.  
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		return obj;
	}
	
}