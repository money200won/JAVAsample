package day5;

public class Prob1 {

	public static void main(String[] args) {
		String sourceString = 
				"everyday we have is one more than we deserve";
				String encodedString = "";
				
				
				for (int i=0 ; i<sourceString.length() ; i++){
					if ('a'<=sourceString.charAt(i) && sourceString.charAt(i)<='w'){
					//sourceString.charAt(i);
						encodedString += (char)(sourceString.charAt(i)+3);
					}else if(sourceString.charAt(i)==' '){
						encodedString += sourceString.charAt(i);
					}else{
						encodedString += (char)(sourceString.charAt(i)-23);
					}
					
				
				}

				
				
				// ���α׷��� ������ ����.	
				// ���� : ���� 'a'�� �������� 97�̸�, 'z'�� 122�Դϴ�. 
				
				// ���α׷� ������ ��.
				
				System.out.println("��ȣȭ�� ���ڿ� : " + sourceString);
				System.out.println("��ȣȭ�� ���ڿ� : " + encodedString);

	}

}
