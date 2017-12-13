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
			// 상대주소로 읽어오며 어디에서 불어오느냐에 따라 불러오는 위치가 달라진다. 지금은 bin안에 있는듯 아마도
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fis != null)// nulpoint예외는 트라이캐치보다 이렇게 해결하는 것이 좋다.
					fis.close();// 자원반납이라고 하더라도 예외처리는 필요하다. 예외가 있을 수도 있으니까
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("END");
	}

}
