package day16.exception;

public class ExceptionTest02 {

	public static void main(String[] args) {
		try{
		Account account = new Account("ȫ�浿",10000);
		account.setMoney(-500);
		System.out.println(account);
		}catch(MoneyException e){
			System.out.println(e.getMessage());
		}
	}

}


class Account{
	private String name;
	private int money;
	public Account() {
		super();
	}
	public Account(String name, int money) throws MoneyException {
		super();
		this.setName(name);
		this.setMoney(money);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) throws MoneyException {
		if(money<0){
			throw new MoneyException("������ �ȵ˴ϴ�. ���� 0���� ũ�� ��������.");
		}//������ ��� �޼����� ���� � ������ �߻��� ������ �ٷ� �� �� �־���Ѵ�. �װ� ���� ����� ���� ����ó���� �����.
		this.money = money;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", money=" + money + "]";
	}
	
}

class MoneyException extends Exception {//���ܱ���� Ŭ�󽺴� �ݵ�� ���� �躸�� �ִ� ������ ����� �޾ƾ��Ѵ�.
	
	public MoneyException() {	
		super("�� ����");//���⿡ �����صθ� ����Ʈ�� ������ �Ȱ� �����.
	}
	public MoneyException(String string) {	
		super(string);
	}
	
}