package calenda;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 월마다 일수
	private static final int[] LEAP_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 윤년

	public boolean isleapYear(int year) { // 윤년구분
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { // 4의배수 이고 100의배수는 평년이지만 400의배수는 윤년
			return true;
		} else
			return false;

	}

	public int getmaxDaysOfMonthYear(int year, int month) { // 2017 2
		if (isleapYear(year)) {
			return LEAP_DAYS[month - 1];
		} else
			return MAX_DAYS[month - 1]; // 일반달력
	}

	public void printCalendar(int year, int month) { // 3
		System.out.printf("   <<%d년%3d월>>\n", year, month);
		System.out.println("  일 월 화 수 목 금 토 일");
		System.out.println("  ------------------");
		int maxDay = getmaxDaysOfMonthYear(year, month);

		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();

	}

}
