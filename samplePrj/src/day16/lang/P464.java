package day16.lang;

public class P464 {

	public static void main(String[] args) {
		String msg = "Hello Java!!!!!!";
		System.out.println(msg);
		msg.replace('!', '~');//이렇게 처리해도 String은 불변형이라 원해 값을 절대 건드리지 않는다.
		System.out.println(msg);
		System.out.println(msg.replace('!', '~'));//이렇게 주소를 바꾸지 않으면 안바뀜
		msg.concat("sample");//뭔 짓을 해도 주소가 바뀌지 않으면 안의 값은 변하지 않는다.
		System.out.println(msg);
		
		StringBuffer sb = new StringBuffer("StringBuffer Test");//버퍼,빌더는 수정이나 추가가 가능해진다.
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.append(" Sample");
		System.out.println(sb);
		String s =sb.toString();
	}

}
