package day16.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class InputStreamTest01 {
		public static void main(String[] args) {
			
			FileInputStream fis = null;//���ϰ� �����ϴ� Ŭ��, �ݵ�� �ڿ��ݳ��� ����� �����ϴ�.
			Scanner scanner = null;
			
			try {
				fis = new FileInputStream("sample3.txt");
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
				System.out.println("sample2.txt ������ �غ����ּ���");
				
			}catch(Exception e){
				
			}finally{
				try {
					if(fis!=null){
						System.out.println("������ �����");
					fis.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("MainEnd");
		}

}
