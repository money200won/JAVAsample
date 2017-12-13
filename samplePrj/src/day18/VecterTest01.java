package day18;

import java.util.*;


public class VecterTest01 {

	public static void main(String[] args) {
		Student[] s = new Student[100];
		s[0]= new Student();
		
		List<Student> list = new ArrayList<Student>();//콜랙션을 쓸 때는 왠만하면 제너릭한 타입을 설정해주자
//등록
		list.add(new Student("G1비트골드",100,22));
		list.add(new Student("A2비트캐쉬",86,75));
		list.add(new Student("B3비트코인",10,92));
		list.add(new Student("4대쉬",90,45));
		
//삭제
		/*
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.remove(list.get(1));
		System.out.println(list);
		*/
//원하는 데이터를 꺼내서 원하는 메소드 적용시키기
		/*
		int delindex = -1;
		for (int i=0;i<list.size();i++){
				Student data = list.get(i);
				data.avg();
				//list.remove(data); for문 안에 있을 때는 제거를 하면서 계속 list.size()가 작아져서 제대로 작동하지 않는다.
				if(data.name.equals("4대쉬")){
					delindex = i;
				}
		}
		list.remove(delindex);
		System.out.println(list);
		*/
//새로나온 for문 삭제 : JDK1.5부터, 순회해서 꺼내쓰는 용도로 쓴다. 원래 set에 쓸려고 나온 기능.
		for(Student data : list){
			System.out.println(data);
			data.avg();
		}
		System.out.println(list);
		
//Iterator를 이용한 삭제		
		Iterator<Student> it = list.iterator();
		
		while (it.hasNext()){
			Student data = it.next();
			if (data.name.equals("4대쉬"))
			it.remove();
		}
		System.out.println(list);
		System.out.println("===============================");
//검색
		System.out.println(list.contains(new Student("2비트캐쉬",86,75)));
		//equals 메소드를 오버라이딩 해야 저 값들을 비교가능하다.
		
		System.out.println("===============================");
//정렬
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