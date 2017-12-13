package day4;

public class P168 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int sum=0;
			for (i=1;i<=100;i++){
			sum += i;
			}
			System.out.println(sum);
	
		int j=1;
		int sumj=0;
			while (j<=100){
				sumj += j;
				j++;
				
			}
			System.out.println(sumj);
			
		while(sumj!=5050){
			System.out.println("!!!");
			break;
		}
		boolean flag = false;
		do{
			
			System.out.println("do while "+ flag);
			//break;
			
		}while(flag);
			
		args[1] = "???";
			
	
	
	}
	
}
