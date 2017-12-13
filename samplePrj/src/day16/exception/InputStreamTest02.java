package day16.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class InputStreamTest02 {//새로운 예외처리 방법, 자원반납까지 완전 자동

	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("sample3.txt");){
			System.out.println("작업 처리");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("sample2.txt 파일을 준비해주세요");
			
		}catch(Exception e){
			
		}finally{
			System.out.println("파일이 없어요");
				
		}
		
		System.out.println();
		/*
		try (Account a = new Account("",100);){
		아무 클래스나 이런식으로 예외처리를 할 수 있는 것은 아니다. 예외중에서 클로져블한 녀석만 가능하다.
		클로져블이라는 것은 close의 예외계열들 implements한 아이들을 이야기한다.
		} catch (MoneyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		*/
		System.out.println("-------------------------------------");
		try (Scanner scanner = new  Scanner(new File("sample2.txt"));){
			Account a = new Account("",100);
			} catch (FileNotFoundException | MoneyException e) {
				System.out.println(e.getMessage());
			} 
		
		System.out.println("MainEnd");

	}

}
