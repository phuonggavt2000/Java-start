package hellojava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("#,###");

		System.out.println("Nhập vào số điện của bạn");
		int elecNum = scanner.nextInt();
		if (elecNum <= 100) {
			int elecAmout = elecNum * 1000;
			System.out.println("Số điện bạn dưới 100 nên số tiền bạn là: " + elecAmout);
		} else {
			int elecAmout = 100 * 1000 + (elecNum - 100) * 1500;
			System.out.println("Số điện bạn dưới 100 nên số tiền bạn là: " + decimalFormat.format(elecAmout));
		}
		scanner.close();

	}
}
