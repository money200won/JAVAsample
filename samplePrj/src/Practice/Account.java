package Practice;

import java.util.Arrays;

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
		this("391910", "10000", "0", "0", "333111", "000");
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
	
	public void sample(){
		int[][] ac= new int[cnum][3];
		for(int i=0;i<=cnum-1;i++){
		ac[i][0]=Integer.parseInt(this.accnum);
		ac[i][1]=Integer.parseInt(this.bal);
		ac[i][2]=Integer.parseInt(this.info);
		}
		
	System.out.println(Arrays.toString(ac[1]));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

/*
 * =================���� �ϼ��� Account_�̸� ======================= Account Ŭ���� ���¹�ȣ ,
 * �ܰ� , �Ա� , ���, ������ü, ����������� }
 */