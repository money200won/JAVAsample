package day4;

public class prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strData  =  "Java Programming";
		int n;
		char w;
		String s="";
		for (n=strData.length()-1;n>=0;n--){
			//System.out.print(strData.charAt(n));
			s += strData.charAt(n);
			
		}
		System.out.println(s);
	}

}
