package hellojava;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên của bạn");
		String name = scanner.nextLine();
		System.out.println("Nhập điểm toán của bạn");
		int mathScore = scanner.nextInt();
		System.out.println("Nhập điểm văn của bạn");
		int literScore = scanner.nextInt();
		System.out.println("Nhập điểm văn của bạn");
		int engScore = scanner.nextInt();
		int averScore = Math.round(mathScore + literScore + engScore) / 3;
		System.out.println("Điểm trung bình của" + name + "là: " + averScore);
		scanner.close();

	}
}
