package day2;

public class P95 {
	
	public static void main(String[] args) {
		float x = 'a';
		double y = 7 + 8 * x;
	System.out.printf("y= %.0f %n",y);
	
	int i=5, j=5;
	System.out.printf("참거짓 : i>j %b %n",i,j);
	//%s 문자열, 잘 모르겠을 경우 쓴다. %b boolean 타입
	System.out.printf("전 : i = %d,j = %d %n",i,j);
	System.out.println(++i);
	//++연산자에 i가 어디있나에 따라 다른결과
	//앞에 있으면 먼저 불러들인 다음 더하고
	//뒤에 있으면 더한 것을 불러들임
	System.out.printf("후 : i = %d,j = %d %n",i,j);
	System.out.printf("후 : i = %d,j = %d : i==j -> %s %n",i,j,i==j);
	//==연산자의 특징
	//i==j가 같은지 기본 데이터를 비교하는 것
	//참조데이터의 경우(혹은 객체) name1==name2안되고 name.equals(name2)로 해야함
	//참고로 같지 않은 것은 !(name.equals(name2))
	int sum = 100;
	sum += (int)y;
	System.out.println(sum);
	System.out.println(sum % 100);
	System.out.println(sum / 10);
	
	}
}
