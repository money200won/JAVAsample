package day5;

public class Prob3 {
	public static void main(String[] args) {
			String msg ="Hello Java";
			char[] src = msg.toCharArray();
			char[] ch = new char[src.length];
			for(int i = 0 ; i<src.length ; i++){
				if (src[i]>='A' && src[i]<='Z'){
					ch[i]=(char)(src[i]+32);
					}
				else if(src[i]==' '){
					ch[i] = src[i];
					}
				else {
					ch[i] = (char)(src[i]-32);
				}
					
			}
			System.out.println(ch);
			
			
			
			
	}
}
