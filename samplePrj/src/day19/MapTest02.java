package day19;

import java.util.*;

public class MapTest02 {

	public static void main(String[] args) {
		
		Map<String,Student> map = new HashMap();//String�� ���ȣ
		map.put("42", new Student("������","1","1���"));
		map.put("36", new Student("������","2","���ͼ�"));
		map.put("45", new Student("��ȣ��","3","����Ÿ��"));
		map.put("77", new Student("����","4","���ͼ�"));
		map.put("2", new Student("�ڹο�","6","2���"));
		map.put("14", new Student("������","7","�߰߼�"));
		map.put("16", new Student("�ս���","8","���ݼ�"));
		map.put("42", new Student("���±�","9","����"));
		
		
		Set<String> player = map.keySet();
		
		Iterator<String> it = player.iterator();
		while(it.hasNext()){
			String playerdata = it.next();
			System.out.println("�����̸� : "+map.get(playerdata).name+"\t������ : "+map.get(playerdata).pos);
		}
			
		
		
	}
}

class Student implements Comparable<Student>{
	String name;
	String WAR;
	String pos;
	
	public Student() {
		super();
	}
	public Student(String name, String WAR, String score) {
		super();
		this.name = name;
		this.WAR = WAR;
		this.pos = score;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", num=" + WAR + ", score=" + pos + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((WAR == null) ? 0 : WAR.hashCode());
		result = prime * result + ((pos == null) ? 0 : pos.hashCode());
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
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (WAR == null) {
			if (other.WAR != null)
				return false;
		} else if (!WAR.equals(other.WAR))
			return false;
		if (pos == null) {
			if (other.pos != null)
				return false;
		} else if (!pos.equals(other.pos))
			return false;
		return true;
	}
	@Override
	public int compareTo(Student o) {
			
		return name.compareTo(o.name);
	}
	
	
	
	
	
	
	
	
}
