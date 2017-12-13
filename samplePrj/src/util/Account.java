package util;

public class Account {
	
	static int count = 0;
	int cnum;
	{
		++count;
		cnum=count;
		//2차원 배열용
	}
	
	String accnum;
	String bal;
	String in;
	String out;
	String accnum2;
	String info;

	public Account() {
		this("391-910", "10000", "0", "0", "333-111", "냉무");
	}
	
	public Account(String accnum,String bal,String in, String out, String accnum2, String info) {
		this.accnum = accnum;
		this.bal = bal;
		this.in = in;
		this.out = out;
		this.accnum2 = accnum2;
		this.info = info;
	}
	

	public static int accin(int bal, int in) {
		return bal += in;
	}//내 계좌 입금
	
	public static int accout(int bal, int out) {
		return bal -= out;
	}//내 계좌 출금
	
	public void display(){
		System.out.printf("ACCOUNT[계좌번호:%s 잔액:%s 정보:%s]",accnum,bal,info);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

/*
 * =================제출 하세요 Account_이름 ======================= Account 클래스 계좌번호 ,
 * 잔고 , 입금 , 출금, 계좌이체, 통장정보출력 }
 */