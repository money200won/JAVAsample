package day10;

public class Dog extends Animal {
	String name;
	String kind="����������";
	public void bike(){
		System.out.println("Bark�� �´µ�!");
	}
	public void display() {
		System.out.printf("Dog[%s  %s  %s]%n",this.kind,super.kind,this.name);
	}
	
}
