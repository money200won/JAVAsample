package day13product;

public class ProductTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer buyer = new Buyer();
				
		Tv t = new Tv();
		Computer c = new Computer();
		Audio a = new Audio();
		
		buyer.buy(t);
		buyer.buy(c);
		buyer.buy(a);
		buyer.buy(a);
	}
	
}

class Product{
	int price;
	int point;
}

class Tv extends Product{}
class Computer extends Product{}
class Audio extends Product{}

class Buyer{
	int money = 1000;
	int bonuspoint = 0;
	/*
	public void buy(Tv t){
		money -= t.price;
		bonuspoint += t.point;
	}//�� �޼ҵ�� Tv�� �� �� �ִ� �޼ҵ�

	public void buy(Computer c){
		money -= c.price;
		bonuspoint += c.point;
	}
	public void buy(Audio a){
		money -= a.price;
		bonuspoint += a.point;
	}//�޼ҵ� �����ε��� ���� �̷��� �ϴ� ���� ����
	*/
	public void buy(Product p){
		money -= p.price;
		bonuspoint += p.point;
	}//����� ����ϸ� �̷��� ���ϴ�.
}