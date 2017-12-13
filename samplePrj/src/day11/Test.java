package day11;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.display();
		
		Dog d1 = new Dog("Áø¶Ë°³","»ïº¹ÀÌ");
		d1.display();
		Dog d2 = new Dog("°­¾ÆÁö°ú","Áø¶Ë°³","»ïº¹ÀÌ");
		d2.display();
		
		Animal a = new Animal();
		a.breath();
		
		Animal ad = new Dog();
		ad.breath();
		
		
		
		
	}

}
