package calenda;

import java.util.Scanner;

public class Prompt {

//	public int pasrseDay(String week) { // 시작하는ㅇ요일
//		if (week.equals("SU"))
//			return 0;
//		else if (week.equals("MO"))
//			return 1; //
//		else if (week.equals("TU"))
//			return 2;
//		else if (week.equals("WE"))
//			return 3;
//		else if (week.equals("TH"))
//			return 4;
//		else if (week.equals("FR"))
//			return 5;
//		else if (week.equals("SA"))
//			return 6;
//		else
//			return -1;
//	}

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		int year;
		int month;

		while (true) {
			System.out.println("년을 입력하세요 -1은 종료");
			System.out.printf("YEAR ");
			year = scanner.nextInt(); // 년
			if (year == -1) {
				break;
			}
			System.out.println("월을 입력세요");
			System.out.printf("MONTH");
			month = scanner.nextInt(); // 달

			if (month > 12 || month < 1) {
				System.err.println("잘몬된 입력입니다");
				continue;
			}
			cal.printCalendar(year, month);

		//	System.out.printf(" %d 월은 %d일 까지있습니다 \n", month, cal.getmaxDaysOfMonthYear(year, month));
		}
		System.out.println("BYE");

		scanner.close();
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
