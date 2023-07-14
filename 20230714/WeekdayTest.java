import java.util.Scanner;

public class WeekdayTest {
	public static void main(String[] args) {
//		요일을 계산할 년, 월, 일을 입력받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("요일을 계산할 년, 월, 일을 입력하세요:(ex) 2023 7 14)");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		
//		서기 1년 1월 1일부터 요일을 계산하기 위해 입력한 날짜까지 지난 날짜수를 계산한다.
//		계산된 날짜를 7로 나눈 나머지가 0이면 일요일, 1이면 월요일, 2면 화요일, ... , 6이면 토요일
		
//		서기 1년 1월 1월부터 입력한 날짜의 전년도 12월 31일까지 지난 날짜를 계산한다.
//		int sum = (year - 1) * 365;
//		for (int i=1; i<year; i++) {
//			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
//				sum++;
//			}
//		}
		
		int sum = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 +
				(year - 1) / 400;
		System.out.println(sum);
		
//		전년도 12월 31일부터 지난 날짜의 전달까지 지난 날짜를 더한다.
//		31(1, 3, 5, 7, 8, 10, 12), 28/29(2), 30(4, 6, 9, 11) => switch 이용
		
		int sum2 = 0;
			for (int i=1; i<=month-1; i++) {
				switch (i) {
					case 2 : 
						sum2 += year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ?
								29 : 28;
						break;
					case 4 : case 6 : case 9 : case 11 : sum2 += 30; break;
//					case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
						default : sum2 += 31;
				}
			}
			System.out.println(sum2);
			
			
//		배열을 이용해서 처리한다. => 각 달의 마지막 날짜를 기억하는 배열을 선언한다.
		int[] m = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		m[1] = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
		for (int i=0; i<month-1; i++) {
			sum += m[i];
		}
				
//		입력한 날짜의 전달까지 일수에 일(day)를 더해준다.
		sum += day;
		System.out.println(sum);
		System.out.println(sum % 7);
		
		switch (sum % 7) {
			case 0 : System.out.println("일요일"); break;
			case 1 : System.out.println("월요일"); break;
			case 2 : System.out.println("화요일"); break;
			case 3 : System.out.println("수요일"); break;
			case 4 : System.out.println("목요일"); break;
			case 5 : System.out.println("금요일"); break;
			case 6 : System.out.println("토요일"); break;
		}
		
		String[] week = {"일요일", "월요일", "화요일", "수요일",
				"목요일", "금요일", "토요일"};
		System.out.println(week[sum % 7]);
		
		char[] week2 = {'일', '월', '화', '수', '목', '금', '토'};
		System.out.println(week2[sum % 7] + "요일");
		
	}

}
