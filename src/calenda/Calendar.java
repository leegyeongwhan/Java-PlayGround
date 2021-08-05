package calenda;

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

	public void printCalendar(int year, int month, int weekday) { // 3
		System.out.printf("   <<%d년%3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println(" ------------------");
		int maxDay = getmaxDaysOfMonthYear(year, month);
		int count = 7 - weekday;
		int delim = (count<7) ? count : 0;
		/*
		  if(count<7){
		  	delim=count;
		  }else {delim=0;}
		 */		
		// first print문
		for (int i = 0; i < weekday; i++) { // weekday ==su ==0
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

}
