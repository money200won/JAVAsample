package day16.lang;

public class P464 {

	public static void main(String[] args) {
		String msg = "Hello Java!!!!!!";
		System.out.println(msg);
		msg.replace('!', '~');//�̷��� ó���ص� String�� �Һ����̶� ���� ���� ���� �ǵ帮�� �ʴ´�.
		System.out.println(msg);
		System.out.println(msg.replace('!', '~'));//�̷��� �ּҸ� �ٲ��� ������ �ȹٲ�
		msg.concat("sample");//�� ���� �ص� �ּҰ� �ٲ��� ������ ���� ���� ������ �ʴ´�.
		System.out.println(msg);
		
		StringBuffer sb = new StringBuffer("StringBuffer Test");//����,������ �����̳� �߰��� ����������.
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.append(" Sample");
		System.out.println(sb);
		String s =sb.toString();
	}

}
