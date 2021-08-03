package calenda;

import java.util.Scanner;

public class Calenda {

	public static void main(String[] args) {

		System.out.println("일 월 화 수 목 금 토 일");
		System.out.println("------------------");
		for (int i = 1; i < 29; i++) {
			System.out.print(i + "  ");
			if (i % 7 == 0) {
				System.out.println();
			}
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력해주세요");
		// String dal = scanner.next();
		// int month = Integer.parseInt(dal);
		int month = scanner.nextInt(); // 달
		int[] maxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		System.out.printf(" %d 월은 %d일 까지있습니다 \n", month, maxDays[month - 1]);
		scanner.close();
	}

}
