package Practice;

public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = Integer.parseInt(args[0]);

	        // create n-by-n array of integers 1 through n
	        int[][] a = new int[n][n];
	        for (int i = 0; i < n; i++)
	            for (int j = 0; j < n; j++)
	                a[i][j] = 1 + n*i + j;

	        // print n-by-n array of integers 1 through n
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.printf("%2d ", a[i][j]);
	            }
	            System.out.println();
	        }
	        System.out.println();

	        // spiral
	        for (int i = n-1, j = 0; i > 0; i--, j++) {
	            for (int k = j; k < i; k++)
	                System.out.println(a[j][k]);
	            for (int k = j; k < i; k++)
	                System.out.println(a[k][i]);
	            for (int k = i; k > j; k--)
	                System.out.println(a[i][k]);
	            for (int k = i; k > j; k--)
	                System.out.println(a[k][j]);
	        }
	     
	        // special case for middle element if n is odd
	        if (n % 2 != 0)
	            System.out.println(a[(n-1)/2][(n-1)/2]);

	}

}
