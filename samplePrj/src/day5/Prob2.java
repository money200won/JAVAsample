package day5;

public class Prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		for (int i = 0; i<arr.length; i++ ){
			sum += arr[i];
			//sum = sum + arr[i];
		}
		System.out.println("sum= " + sum);
	}

}
