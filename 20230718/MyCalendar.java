import java.util.Date;
import java.util.Scanner;

public class MyCalendar {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이번달(1), 특정달(2): ");
		int confirm = scanner.nextInt();
		int year, month;
		if(confirm == 1) {
			Date date = new Date();
			year = date.getYear() + 1900;
			month = date.getMonth() + 1;
		} else {
			System.out.print("출력할 년, 월을 입력하세요: ");
			year = scanner.nextInt();
			month = scanner.nextInt();
			
		}
		
		System.out.printf("=============================\n");
		System.out.printf("        %4d년 %2d월\n", year, month);
		System.out.printf("=============================\n");
		System.out.println(" 일  월  화  수  목  금  토 ");
		System.out.printf("=============================\n");
		
		int week = weekDay(year, month, 1);
		int start = 0;
		if (month == 1) {
			start = 31 - week;
		} else {
			start = lastDay(year, month - 1) - week;
		}
		for (int i=1; i<=week; i++) {
			System.out.printf(" %2d ", ++start);
		}
		
		
		for (int i=1; i<lastDay(year, month)+1; i++) {
			System.out.printf(" %2d ", i);
			if (weekDay(year, month, i) == 6 && i != lastDay(year, month)) {
				System.out.println();
			}
		}
		
		week = weekDay(year, month, lastDay(year, month)) + 1;
		start = 0;
		for (int i=week; i<=6; i++) {
			System.out.printf(" %2d ", ++start); // start = 1이면 start++
		}
		
		System.out.printf("\n=============================\n");
	}
	
	public static boolean isLeapYear(int year) {
		
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
	}
	
	public static int totalDay(int year, int month, int day) {
		int sum = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 +
				(year - 1) / 400;
		
		for (int i=1; i<month; i++) {
			sum += lastDay(year, i);
		}
		sum += day;
		
		return sum;
		
	}

	public static int lastDay(int year, int month) {
		int [] m = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		m[1] = isLeapYear(year) ? 29 : 28;
		
		return m[month - 1];
	}

	public static int weekDay(int year, int month, int day) {
		return totalDay(year, month, day) % 7;
		
	}

}
