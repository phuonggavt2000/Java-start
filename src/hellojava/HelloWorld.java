package hellojava;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào sô thứ nhất");
		int firstNumber = scanner.nextInt();
		System.out.println("Nhập số thứ hai");
		int secondNumber = scanner.nextInt();
		System.out.println("Số nhỏ nhất : " + Math.min(firstNumber, secondNumber));
		scanner.close();
	}

}
