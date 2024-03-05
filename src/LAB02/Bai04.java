package LAB02;

import java.util.Scanner;

public class Bai04 {
	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất|");
		System.out.println("| 2. Giải phương trình bậc hai|");
		System.out.println("| 3. Tính số tiền điện|");
		System.out.println("| 4. Kết thúc|");
		System.out.println("++ ------------------ ++");
		Scanner scanner = new Scanner(System.in);
		int z = scanner.nextInt();
		switch (z) {
		case 1:
			System.out.println("Lab2 bai 1");
//			Cho phương trình ax + b = 0
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
			break;
//		case 2:
//			System.out.println("Lab2 bai 2");
////			Cho phương trình ax^2 + bx + c = 0
//			System.out.println("Nhap vao he so a: ");
//			int a = scanner.nextInt();
//			System.out.println("Nhap vao he so b: ");
//			int b = scanner.nextInt();
//			System.out.println("Nhap vao he so c: ");
//			int c = scanner.nextInt();
//
//			switch (a) {
//			case 0:
//				float x = (float) -c / b;
//				if (b == 0 && c == 0) {
//					System.out.println("Phuong trinh vo so nghiem!");
//				} else if (b == 0 && c != 0) {
//					System.out.println("Phuong trinh vo nghiem!");
//				} else if (b != 0 && c != 0) {
//					System.out.println("Phuong trinh co nghiem la: " + x);
//				}
//				break;
//			default:
//				float delta = (float) b * b - 4 * a * c;
//				if (delta < 0) {
//					System.out.println("Phuong trinh vo nghiem!");
//				} else if (delta == 0) {
//					x = -b / (2 * a);
//					System.out.println("Phuong trinh co nghiem kep la: " + x);
//				} else if (delta != 0) {
//					float x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
//					float x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
//					System.out.println("Phuong trinh co hai nghiem la " + x1 + " va " + x2);
//				}
//				break;
//			}
//
//			break;
		case 3:
			System.out.println("Lab2 bai 1");
//			Tinh tien dien
			System.out.println("Nhap vao so dien: ");
			int a1 = scanner.nextInt();
			int x1 = 100 * 1000 + (a1 - 100) * 1500;
			if (a1 <= 100) {
				System.out.println("So tien dien là: " + a1 * 1000);
			} else if (a1 > 100) {
				System.out.println("So tien dien là:" + x1);
			}
			break;
		case 4:
			System.exit(0);
		}
	}
}
