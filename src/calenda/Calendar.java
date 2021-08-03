package calenda;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 월마다 일수

	public int getmaxDaysOfMonth(int month) { //
		return MAX_DAYS[month - 1];
	}

	public void printCalendar() {
		System.out.println("일 월 화 수 목 금 토 일");
		System.out.println("------------------");
		for (int i = 1; i < 29; i++) {
			System.out.print(i + "  ");
			if (i % 7 == 0) {
				System.out.println();
			}
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		String PROMPT = "cal> ";
		
		System.out.println("반복횟수를 입력하세요.");
		int banbok = scanner.nextInt();		
		System.out.println("월을 입력하세요");
		
		
		while(true) {
			int month = scanner.nextInt(); // 달
			System.out.printf(PROMPT);
			if(month == -1) {
				break;
			}
			if(month>12) {
				continue;
			}
			System.out.printf(" %d 월은 %d일 까지있습니다 \n", month, cal.getmaxDaysOfMonth(month));		
		}
		System.out.println("프로그램이 종료되었어요");
//		for(int i=0; i<banbok; i++) {				
//			int month = scanner.nextInt(); // 달
//			System.out.printf(PROMPT);
//			System.out.printf(" %d 월은 %d일 까지있습니다 \n", month, cal.getmaxDaysOfMonth(month));
//			if(month == -1) {
//				System.out.println("프로그램이 종료되었어요");
//			}
//		}
		
		// String dal = scanner.next();
		// int month = Integer.parseInt(dal);
		
		
		//
		scanner.close();
	}

}
