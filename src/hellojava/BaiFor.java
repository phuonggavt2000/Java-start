package hellojava;

import java.util.Arrays;
import java.util.Scanner;

public class BaiFor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập số lượng phần tử của mảng: ");
		int size = scanner.nextInt();
		int[] arrayNum = new int[size];
		System.out.println("Nhập các phần tử của mảng: ");
		for (int i = 0; i < size; i++) {
			System.out.println("Phần tử " + (i + 1) + ": ");

			arrayNum[i] = scanner.nextInt();
		}
		Arrays.sort(arrayNum);
		System.out.println("Mảng là: " + Arrays.toString(arrayNum));
		System.out.println("Số nhỏ nhất của mảng là: " + arrayNum[0]);
		System.out.println("Số lớn nhất của mảng là: " + arrayNum[arrayNum.length - 1]);
	}

}
