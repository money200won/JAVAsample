package day16.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class InputStreamTest01 {
		public static void main(String[] args) {
			
			FileInputStream fis = null;//파일과 연결하는 클라스, 반드시 자원반납을 해줘야 안전하다.
			Scanner scanner = null;
			
			try {
				fis = new FileInputStream("sample3.txt");
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
				System.out.println("sample2.txt 파일을 준비해주세요");
				
			}catch(Exception e){
				
			}finally{
				try {
					if(fis!=null){
						System.out.println("파일이 없어요");
					fis.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("MainEnd");
		}

}
