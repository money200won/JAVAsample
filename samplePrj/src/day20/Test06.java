package day20;

public class Test06 {

	public static void main(String[] args) {
		F1 f = new F1(){
			@Override
			public int max(int a, int b) {
				return a > b ? a : b;
			}
			
		};
		System.out.println(f.max(45, 16));
		
		F1 f2 = (int a,int b)->{
			return a > b ? a:b;
		};
		System.out.println(f2.max(23, 12));
		
		F2<Integer,Integer> f3 = (a,b)->{
			return a < b ? a:b;
		};
		System.out.println(f3.min(23, 12));

	}

}

@FunctionalInterface
interface F1{
	int max(int a, int b);
}
@FunctionalInterface
interface F2<T,V>{
	int min(T a, V b);
}