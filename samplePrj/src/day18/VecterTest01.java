package day18;

import java.util.*;


public class VecterTest01 {

	public static void main(String[] args) {
		Student[] s = new Student[100];
		s[0]= new Student();
		
		List<Student> list = new ArrayList<Student>();//�ݷ����� �� ���� �ظ��ϸ� ���ʸ��� Ÿ���� ����������
//���
		list.add(new Student("G1��Ʈ���",100,22));
		list.add(new Student("A2��Ʈĳ��",86,75));
		list.add(new Student("B3��Ʈ����",10,92));
		list.add(new Student("4�뽬",90,45));
		
//����
		/*
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.remove(list.get(1));
		System.out.println(list);
		*/
//���ϴ� �����͸� ������ ���ϴ� �޼ҵ� �����Ű��
		/*
		int delindex = -1;
		for (int i=0;i<list.size();i++){
				Student data = list.get(i);
				data.avg();
				//list.remove(data); for�� �ȿ� ���� ���� ���Ÿ� �ϸ鼭 ��� list.size()�� �۾����� ����� �۵����� �ʴ´�.
				if(data.name.equals("4�뽬")){
					delindex = i;
				}
		}
		list.remove(delindex);
		System.out.println(list);
		*/
//���γ��� for�� ���� : JDK1.5����, ��ȸ�ؼ� �������� �뵵�� ����. ���� set�� ������ ���� ���.
		for(Student data : list){
			System.out.println(data);
			data.avg();
		}
		System.out.println(list);
		
//Iterator�� �̿��� ����		
		Iterator<Student> it = list.iterator();
		
		while (it.hasNext()){
			Student data = it.next();
			if (data.name.equals("4�뽬"))
			it.remove();
		}
		System.out.println(list);
		System.out.println("===============================");
//�˻�
		System.out.println(list.contains(new Student("2��Ʈĳ��",86,75)));
		//equals �޼ҵ带 �������̵� �ؾ� �� ������ �񱳰����ϴ�.
		
		System.out.println("===============================");
//����
		Student[] tmp = (Student[]) list.toArray();
		Arrays.sort(tmp);
		
		Student[] tmp2 = new Student[list.size()];
		list.toArray(tmp2);
		
		for(Student data : list){
			System.out.println(data);
			System.out.println("===============================");
		}
		System.out.println(list.toArray());
		
}
}