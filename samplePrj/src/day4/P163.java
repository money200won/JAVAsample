package day4;

public class P163 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
	OUT:	for (i = 1; i<10;i++ ){
			for (j = 2; j<10;j++ ){
				//if(j==5) break;
				//if(j==5) continue;
				if(i==j) break OUT;//레이블링:OUT위치로 돌아가는 것
			System.out.printf("%d * %d = %d\t",j,i,i*j);
			}
			System.out.println();
			
		}
	}

}
