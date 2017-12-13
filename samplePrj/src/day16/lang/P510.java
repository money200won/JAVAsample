package day16.lang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P510 {

	public static void main(String[] args) {
		String filename = "sample2.txt";
		int sum = 0;
		// ����
		// ��������-------------------------------------------------------------------
		try (Scanner scanner = new Scanner(new File(filename));) {
			while (scanner.hasNextLine()) {
				String data = scanner.nextLine();
				System.out.println(data);
				String[] data1 = data.split("/");
				int count = 0;
				int sum2 = 0;
				double avg = 0;
				for (int i = 1; i < data1.length; i++) {
					sum2 += Integer.parseInt(data1[i].trim());
					count++;
					avg = sum2 / count;
				}
				System.out.printf("���� : %s , ���� : %d , ���� : %5.2f\n",data1[0],sum2,avg);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		// ����
		// ��������-------------------------------------------------------------------
		System.out.println("Main End###############");

	}

}
