package calenda;

public class Calendar {
	private static final int[] MAX_DAYS = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 월마다 일수
	private static final int[] LEAP_DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 윤년

	public boolean isleapYear(int year) { // 윤년구분
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { // 4의배수 이고 100의배수는 평년이지만 400의배수는 윤년
			return true;
		} else
			return false;

	}

	public int getmaxDaysOfMonthYear(int year, int month) { // 2017 2
		if (isleapYear(year)) {
			return LEAP_DAYS[month];
		} else
			return MAX_DAYS[month]; // 일반달력
	}

	public void printCalendar(int year, int month) { // 3
		System.out.printf("   <<%d년%3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println(" ------------------");
		int weekdays = getWeekDay(year, month, 1);
		int maxDay = getmaxDaysOfMonthYear(year, month);
		int count = 7 - weekdays;
		int delim = (count < 7) ? count : 0;
		/*
		 * if(count<7){ delim=count; }else {delim=0;}
		 */
		// first print문
		for (int i = 0; i < weekdays; i++) { // weekday ==su ==0
			System.out.printf("   ");
		}
		count++;
		for (int i = 1; i < count; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();

		for (int i = count; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == delim) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
	}

	private int getWeekDay(int year, int month, int day) {
		int syear = 1970;

		
	final int STANDARD_WEEKDAY = 3;
		int count = 0;

		for (int i = syear; i < year; i++) {
			int delta = isleapYear(i) ? 366 : 365;
			count += delta;
		}
		for (int i = 1; i < month; i++) {
			int delta = getmaxDaysOfMonthYear(year, i);
			count += delta;
		}
		count += day;
		
		int weekday = (count +STANDARD_WEEKDAY) % 7;
		
		return weekday;
	}

	// test code
	public static void main(String[] args) {
		Calendar cal = new Calendar();
		System.out.println(cal.getWeekDay(1970, 1, 1) ==3); //해가바뀌면 날짜가 하루씩밀린다
		System.out.println(cal.getWeekDay(1971, 1, 1)== 4);
	}
}
