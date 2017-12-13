package day4;

public class P157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int count = 0;count<10;count++){
			System.out.println("Hello Java"+count);
		}

		for(int ch = 'A'; ch<='z';ch++ ){
			System.out.println((char)ch+"ดย_"+ch);
		}
		char c ='a', d='A';
		for(int count=0;count<26;count++){
			System.out.println(c+"  "+(int)(c++)+","+d+"  "+(int)d++);
		}
	}

}
