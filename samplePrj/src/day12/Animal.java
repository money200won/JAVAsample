package day12;

public abstract class Animal {
	private String kind = "동물의 종류";

	public Animal() {
		super();//디폴트 생성자를 지워도 반드시 상위 조상의 생성자 함수를 다녀온다.
		//System.out.println("Animal의 디폴트 생성자함수에요.");
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

	public abstract void breath();//abstract 메소드를 가지려면 클래스에도 abstract을 마킹해야함
}
