package day11;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish f = new Fish();
		f.display();
		
		f=new Fish("구피");
		f=new Fish("어류","구피");
		
		f.display();
		f.breath();
		
	}

}
