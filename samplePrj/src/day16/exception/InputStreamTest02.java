package day16.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class InputStreamTest02 {//���ο� ����ó�� ���, �ڿ��ݳ����� ���� �ڵ�

	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("sample3.txt");){
			System.out.println("�۾� ó��");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("sample2.txt ������ �غ����ּ���");
			
		}catch(Exception e){
			
		}finally{
			System.out.println("������ �����");
				
		}
		
		System.out.println();
		/*
		try (Account a = new Account("",100);){
		�ƹ� Ŭ������ �̷������� ����ó���� �� �� �ִ� ���� �ƴϴ�. �����߿��� Ŭ�������� �༮�� �����ϴ�.
		Ŭ�������̶�� ���� close�� ���ܰ迭�� implements�� ���̵��� �̾߱��Ѵ�.
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
