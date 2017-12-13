package day16.exception;

public class ExceptionTest02 {

	public static void main(String[] args) {
		try{
		Account account = new Account("홍길동",10000);
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
			throw new MoneyException("마통은 안됩니다. 돈을 0보다 크게 넣으세요.");
		}//예외의 경우 메세지만 봐도 어떤 문제가 발생한 것인지 바로 알 수 있어야한다. 그걸 위해 사용자 정의 예외처리를 만든다.
		this.money = money;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", money=" + money + "]";
	}
	
}

class MoneyException extends Exception {//예외기반의 클라스는 반드시 예외 계보에 있는 예외의 상속을 받아야한다.
	
	public MoneyException() {	
		super("돈 에러");//여기에 설정해두면 디폴트로 문제가 된게 저장됨.
	}
	public MoneyException(String string) {	
		super(string);
	}
	
}