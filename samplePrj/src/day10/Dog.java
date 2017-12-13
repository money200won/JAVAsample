package day10;

public class Dog extends Animal {
	String name;
	String kind="강아지종류";
	public void bike(){
		System.out.println("Bark가 맞는디!");
	}
	public void display() {
		System.out.printf("Dog[%s  %s  %s]%n",this.kind,super.kind,this.name);
	}
	
}
