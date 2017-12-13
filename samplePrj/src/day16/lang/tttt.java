package day16.lang;

public class tttt {
	int number = 100;
	public void printValue(){
		int number = 100;
		change(number);
		System.out.println(number);
		System.out.println(this.number);
	}
	
	public void change(int number){
		number += number;
	}
	public static void main(String[] args) {
		tttt t = new tttt();
		t.printValue();
	}
	
}
