package day5;

public class P206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scors = {99,30,33,41,100};
		String[] names = {"홍길동","박가분","지코바","펑펑펑","구르르"}; 
		//int[]와 String[]의 차이는 int는 만들어진 배열안에 값이 들어가있는 것이고
		//String의 경우에는 배열이 주소를 담고있기 때문에 .을 쓸 수 있다.
		
		for(int i=0;i<scors.length;i++){	
			System.out.println(names[i].charAt(0)+ "**\t" + scors[i]);
			//names[i].을 쓸수 있는게 스트링타입인 덕분이란걸 잊지말자
		}
		
		System.out.println("==========================================");
		
		for(int data:scors){
			System.out.println(data);
		}
		for(String data:names){
			System.out.println(data);
		}
	}

}
