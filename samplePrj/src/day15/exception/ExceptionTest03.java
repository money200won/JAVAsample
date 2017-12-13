package day15.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest03 {

	public static void main(String[] args) {
		System.out.println("START");

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("sample2.txt");
			// ����ּҷ� �о���� ��𿡼� �Ҿ�����Ŀ� ���� �ҷ����� ��ġ�� �޶�����. ������ bin�ȿ� �ִµ� �Ƹ���
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fis != null)// nulpoint���ܴ� Ʈ����ĳġ���� �̷��� �ذ��ϴ� ���� ����.
					fis.close();// �ڿ��ݳ��̶�� �ϴ��� ����ó���� �ʿ��ϴ�. ���ܰ� ���� ���� �����ϱ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("END");
	}

}
