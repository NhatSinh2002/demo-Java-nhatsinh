package LAB02;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		System.out.println("Lab2 bai 2");

//		Cho phương trình ax^2 + bx + c = 0

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao he so a: ");
		int a = scanner.nextInt();
		System.out.println("Nhap vao he so b: ");
		int b = scanner.nextInt();
		System.out.println("Nhap vao he so c: ");
		int c = scanner.nextInt();

		switch (a) {
		case 0:
			float x = (float) -c / b;
			if (b == 0 && c == 0) {
				System.out.println("Phuong trinh vo so nghiem!");
			} else if (b == 0 && c != 0) {
				System.out.println("Phuong trinh vo nghiem!");
			} else if (b != 0 && c != 0) {
				System.out.println("Phuong trinh co nghiem la: " + x);
			}
			break;
		default:
			float delta = (float) b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem!");
			} else if (delta == 0) {
				x = -b / (2 * a);
				System.out.println("Phuong trinh co nghiem kep la: " + x);
			} else if (delta != 0) {
				float x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
				float x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Phuong trinh co hai nghiem la " + x1 + " va " + x2);
			}
			break;
		}

	}
}
