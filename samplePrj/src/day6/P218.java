package day6;

public class P218 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int korTatal = 0, engTotal = 0, mathTotal = 0;
		int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 },{60,60,60} };

		System.out.println("¹øÈ£  ±¹¾î  ¿µ¾î  ¼öÇÐ  ÃÑÁ¡  Æò±Õ");
		System.out.println("==========================");
		int i, j;
		
		for (i = 0; i < score.length; i++) {
			int sum = 0;
			double avg = 0.0;
			
			System.out.print(i + 1);
			korTatal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];

			for (j = 0; j < score[i].length; j++) {
				System.out.printf("%5d", score[i][j]);
				sum += score[i][j];
				avg = sum / score[i].length;
			}
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		System.out.println("==========================");
		System.out.println("ÃÑÁ¡" + korTatal + engTotal + mathTotal);
	}

}
