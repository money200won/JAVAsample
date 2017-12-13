package day16.lang;

public class LangTest04 {

	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(5, 5), 3);
		Circle c2 = c1.clone();
		System.out.println(c1);
		System.out.println(c2);
		c1.p.setX(10);
		System.out.println(c1);
		System.out.println(c2);
		//깊은 복사와 얕은 복사, 한번만 복사하면 변화한 주소 안의 값이 둘다 적용된다. 깊은 복사 필요
	}

}

class Circle implements Cloneable {
	Point p;
	double r;

	public Circle() {
		super();
	}

	public Circle(Point p, double r) {
		super();
		this.p = p;
		this.r = r;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p == null) ? 0 : p.hashCode());
		long temp;
		temp = Double.doubleToLongBits(r);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Circle other = (Circle) obj;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}

	@Override
	protected Circle clone() {
		Circle c = null;
		try {
			c = (Circle) super.clone();//먼저 c에 clone()의 조상 메소드를 캐스팅해서 복사해 넣고 (오버라이딩 한 내껄 쓰면 안되니까)
			Point p = c.p.clone();//c.p 의 클론한 값을 p에 저장한 다음
			c.p=p;//p의 값을 c.p의 값에 저장해준다. 이러면 c.p가 강제로 원본의 주소 속 값을 가지게 된다.
		} catch (CloneNotSupportedException e) {
		}
		return c;
	}

}