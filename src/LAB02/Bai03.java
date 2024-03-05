package LAB02;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		System.out.println("Lab2 bai 1");
//		Tinh tien dien
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so dien: ");
		int a = scanner.nextInt();
		int x = 100 * 1000 + (a - 100) * 1500;
		if (a <= 100) {
			System.out.println("So tien dien là: " + a * 1000);
		} else if (a > 100) {
			System.out.println("So tien dien là:" + x);
		}
	}
}
