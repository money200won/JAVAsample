package util;

public class Account {
	
	static int count = 0;
	int cnum;
	{
		++count;
		cnum=count;
		//2���� �迭��
	}
	
	String accnum;
	String bal;
	String in;
	String out;
	String accnum2;
	String info;

	public Account() {
		this("391-910", "10000", "0", "0", "333-111", "�ù�");
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
	}//�� ���� �Ա�
	
	public static int accout(int bal, int out) {
		return bal -= out;
	}//�� ���� ���
	
	public void display(){
		System.out.printf("ACCOUNT[���¹�ȣ:%s �ܾ�:%s ����:%s]",accnum,bal,info);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

/*
 * =================���� �ϼ��� Account_�̸� ======================= Account Ŭ���� ���¹�ȣ ,
 * �ܰ� , �Ա� , ���, ������ü, ����������� }
 */