package day16.lang;

public class LangTest01 {

	public static void main(String[] args) {
		Point p = new Point(1,1);
		System.out.println(p);
		p.close();//Ŭ���� �޼ҵ�� �������̵� �ؼ� �ȿ� ������ ���� �� ������ �ݵ�� p=null������ ����ؾ��Ѵ�.
		p=null;//�������ݷ��Ϳ��� p�� �� ��ٰ� �޸� �����϶�� �˸��� �κ�, �� �κ� �ּ�ó���ϸ� �ڿ��� �ݳ��ȵȰ� ȭ�ΰ���
		
		//System.gc(); �̰� �� �Ⱦ��°� �޸� ������ �ϴ��� �̰� ���� �˴� ����. 
		//�ڹٴ� finalize�� �� �Ⱦ��� ���� Ŭ���� �޼ҵ带 ����.
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
		//������ ������ �ϴ� ����
		super.finalize();
		System.out.println(getClass().getSimpleName()+"finalize() ����");
		System.out.println("�ڿ��ݳ��ڵ�");
		//���ο��� �ڿ� ���´ٴ� ���� ������ �۾��������� �۾��� �ȴٴ� ��
	}
	void close(){
		System.out.println(getClass().getSimpleName()+"finalize() ����");
		System.out.println("�ڿ��ݳ��ڵ�");
		}
	@Override
	protected Point clone() {
	//������Ʈ ����Ÿ���̹Ƿ� �׻� ĳ������ ������Ѵ�.
	//Ŭ�� �޼ҵ�� �������̵� �Ӹ� �ƴ϶� �߰��� implements Cloneable ��� ����ο� �������
		Point obj = null;
		try {
			obj = (Point) super.clone(); //clone()�� Ÿ�Ժ����ϴ� �͵� �����ϴ� �� ĳ���� �ʿ�.  
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		return obj;
	}
	
}