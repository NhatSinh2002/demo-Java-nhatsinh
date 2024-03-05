package demoJava;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		System.out.println("Bai 03");
		System.out.println("Nhap vao canh cua hinh lap phuong:");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("The tich cua hinh lap phuong la: " + Math.pow(a, 3));

		scanner.close();
	}
}
