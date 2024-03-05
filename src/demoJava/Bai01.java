package demoJava;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		System.out.println("Bai 01");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap ten:");
		String name = scanner.nextLine();
		System.out.println("Nhap diem:");
		float dtb = scanner.nextFloat();

		System.out.println("Ten hoc sinh: " + name + "; Diem trung binh: " + dtb);
		scanner.close();
	}
}
