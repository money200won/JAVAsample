package day13;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("A",9);
		
		System.out.println(s);
		System.out.println(s.getClass());
		Student  s1 = s;
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		//equals �޼ҵ忡 �ʿ��Ѱ� ������ �ּҰ��� ������ �ƴ� ���� ���빰�� ��
		//null�� �����Ǿ��� �� ���ľ��ϴ� ��
		//�ٸ� Ÿ���� ������ ��� �ذ�
		//�� ����غ�����
		
		Student[] ss = {s, new Student("S",1), new Student()};
		for(int i= 0; i<ss.length;i++){
			System.out.println(ss[i]);
		}//ss[i]�� ���� print�� �ϸ� �ּҰ� ������ ���������� toString�� �������̵� �صθ� �ڵ����� ���� ��µǰ� �Ѵ�. 
		
	}

}
