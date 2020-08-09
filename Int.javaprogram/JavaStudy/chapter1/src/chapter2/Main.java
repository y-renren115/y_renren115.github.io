package chapter2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int base;
		int height;

		System.out.println("三角形の面積を計算します。");
		base = input.nextInt();
		height = input.nextInt();

		method1 are = new method1();
		are.putsqu(base,height);
	}
}
