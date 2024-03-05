package demoJava;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		System.out.println("Bai 02");
//		- chu vi hình chữ nhật
//		- diện tích hình chữ nhật
//		- cạnh nhỏ nhất của hình chữ nhật

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap vao chieu dai: ");
		int cdai = scanner.nextInt();
		System.out.println("Nhap vao chieu rong: ");
		int crong = scanner.nextInt();

		int C = (cdai + crong) * 2;
		int S = cdai * crong;
		System.out.println("Chu vi hinh chu nhat la: " + C);
		System.out.println("Dien tich hinh chu nhat la: " + S);
		System.out.println("Canh nho nhat cua hinh chu nhat la: " + Math.min(cdai, crong));

		scanner.close();
	}
}
