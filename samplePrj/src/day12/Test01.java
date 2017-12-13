package day12;

import day11.Animal;
import day11.Dog;
import day11.Fish;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day11.Dog d = new Dog();
		d.display();
		System.out.println("------------------------------");

		Animal[] a = { d, new Fish(), new Dog() };
		for (int i = 0; i < a.length; i++) {
			a[i].breath();
		}
	}

}
