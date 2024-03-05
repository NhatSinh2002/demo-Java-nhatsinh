package LAB02;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		System.out.println("Lab2 bai 1");
//		Cho phương trình ax + b = 0
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao he so a: ");
		int a = scanner.nextInt();

		System.out.println("Nhap vao he so b: ");
		int b = scanner.nextInt();
		float x = (float) -b / a;
		if (a == 0 && b == 0) {
			System.out.println("Phuong trinh vo so nghiem!");
		} else if (a == 0 && b != 0) {
			System.out.println("Phuong trinh vo nghiem!");
		} else if (a != 0 && b != 0) {
			System.out.println("Phuong trinh co nghiem la: " + x);
		}
	}
}
