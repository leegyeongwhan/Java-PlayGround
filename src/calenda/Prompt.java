package calenda;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		while (true) {
			System.out.println("년을 입력하세요");
			System.out.printf("YEAR");
			int year = scanner.nextInt(); // 년

			System.out.println("월을 입력하세요");
			System.out.printf("DAY");
			int month = scanner.nextInt(); // 달

			if (month == -1) { // 종료
				break;
			}
			if (month > 12) {
				continue;
			}
			cal.printCalendar(year, month);

			System.out.printf(" %d 월은 %d일 까지있습니다 \n", month, cal.getmaxDaysOfMonthYear(year, month));
		}
		System.out.println("BYE");

		scanner.close();
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
