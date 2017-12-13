package day15.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println("START");
		try{
			System.out.println("TRY{");
			
			System.out.println(args[0].length());
			//���⿣ ������ ���µ� ��Ÿ�ӿ� ������ �߻��Ѵ�.
			int num = Integer.parseInt(args[0]);
			System.out.println(10/num);
			System.out.println("}");
			//TRY{�� ����Ǵµ� �� �Ʒ��� ������� �ʴ� ������ �ű���� ���� ���� ���������� catch�� �Ѿ�� ����.
			//���⿡ �ڿ��ݳ������� ������ ������ �ȵȴ�. �׷��ϱ� �ڿ��ݳ������� ���� finally�� �־����
		}catch (ArrayIndexOutOfBoundsException e){
			//catch(exception e){}	�� ���ܴ� �˴� ����ó���� ���� �ִµ� �̷��� ����ڰ� ���� ������ �˼��� ����.
			System.out.println("������ �� ���� �迭 �ε��� ���(�Է��� ����)");
		}catch (NumberFormatException e){
			System.out.println("���ڸ� �Է����ּ���.");
			System.out.println(e);
			//�������� ���
			e.printStackTrace();
			System.out.println(e.getMessage());
			//�������� ���
		}catch (Exception e){
			System.out.println("�� �� ���������� �𸣰ڴ� !");
		}
		finally{
		System.out.println("�ڿ��ݳ��� ���⿡");
		//�ٸ� � ������ �߻��ϴ��� �ݵ�� �ױ����� �����ϰ� ����. �׷��� return���� �ڿ��ݳ��� ���⿡ �ݵ�� �ؾ���.
		}
		System.out.println("END");
		//���⿡ �־�θ� �������ᰡ �Ǵ��� Ȯ���� �� �ִ�. ������� �ȿ��� ����������ϱ�
	}

}
