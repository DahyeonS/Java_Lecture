import java.util.Date;
import java.util.Scanner;

public class CalendarTest {
//	메소드의 형식, [ ]로 묶여 있는 내용은 생략이 가능하다.
//	[접근권한자] [static] 리턴타입 메소드이름 ([매개변수, ...,]) { // 메소드의 머리(메소드 선언부)
//		메소드가 실행할 문장;
//		...;
//		[return 값];
//	} // { } 블록을 메소드의 몸통(구현부)
	
//	리턴타입: 메소드가 실행되고 난 후 결과를 되돌려 줄 때 결과의 자료형을 적어준다.
//	=> 리턴 값과 일치하는 자료형 또는 자동 형변환이 가능한 타입이어야 한다.
//	=> 메소드를 실행한 후 결과를 되돌려 줄 필요가 없다면 return을 생략할 수 있고,
//	리턴타입에는 "void"라고 적어준다.
	
//	접근권한자: 클래스, 멤버변수(필드), 메소드, 생성자에서 사용가능
//	private: 클래스, 멤버변서(필드)에서 사용, 현재 클래스 외부에서 접근할 수 있다.
//	=> 현재 클래스 내부에서 접근이 가능
//	protected: 현재 클래스를 상속받은 자식 클래스(다른 패키지도 가능), 같은 패키지 내의
//	클래스에서 접근 가능
//	package(default): 접근제어자(접근권한자) 생략 시 지정, 같은 패키지에서는 public처럼 사용되고
//	다른 패키지에서는 접근 불가
//	public: 현재 클래스 내부, 외부 어디에서나 자유롭게 접근 가능
	
//	static(정적 메소드): 메소드를 작성한 클래스의 객체를 생성하지 않고 클래스 이름에 "."을 찍어서
//	실행할 수 있다. => 자주 사용하는 메소드들을 정적 메소드로 만들어 사용하면 편리하다.

//	매개변수: 함수를 호출할 때 전달하고, 함수가 실행될 때 사용된다.(전달된 매개변수 이용)
	
//	static은 자바 프로그램이 실행되기 전에 static으로 선언된 메소드(함수)나 변수를 메모리에 
//	올려준다.
//	main 메소드가 실행되기 위해서는 메모리가 적재되어야 한다.
//	main 메소드가 메모리에 적재되어 있지 않으면 프로그램의 시작점이 main() 메소드를 호출할 때
//	메모리에 main() 메소드가 없으므로 실행할 수 없다.
//	그래서 main() 메소드는 누군가 호출하기 전에 자바가상머신(JVM)이 메모리에 적재시킨다.
	
	public static void main(String[] args) {
//		static 메소드는 static 메소드에만 접근할 수 있다.
//		System.out.println(isLeapYear(2020));
//		System.out.println(lastDay(2023, 7));
//		System.out.println(totalDay(2023, 7, 18));
//		System.out.println(weekDay(2023, 7, 18));
//		isLeapYear(2023);
		
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
		
//		1일의 출력될 위치를 맞추기 위해 1일의 요일만큼 반복하여 빈 칸(날짜당 4칸)을 출력한다.
//		for (int i=1; i<=weekDay(year, month, 1); i++) {
//			System.out.print("    ");
//		}
		
//		1일이 출력될 위치를 맞추기 위해 1일의 요일만큼 반복하며 전달 날짜를 출력한다.
		int week = weekDay(year, month, 1);
		int start = 0;
		if (month == 1) {
//			start = lastDay(year - 1, 12) - week; // 1월
			start = 31 - week;
		} else {
			start = lastDay(year, month - 1) - week; // 2 ~ 12월
		}
		for (int i=1; i<=week; i++) {
			System.out.printf(" %2d ", ++start);
		}
		
		
//		1일부터 달력을 출력할 달의 마지막 날짜까지 반복하며 날짜를 출력한다.
		for (int i=1; i<lastDay(year, month)+1; i++) {
			System.out.printf(" %2d ", i);
			if (weekDay(year, month, i) == 6 && i != lastDay(year, month)) {
				System.out.println();
			}
		}
		
//		날짜를 다 출력해도 남은 빈칸에 다음 달 1일의 요일부터 토요일까지 반복해서 날짜를 출력한다.
//		if (month == 12) {
//			week = weekDay(year + 1, 1, 1); // 12dnjf
//		} else {
//			week = weekDay(year, month + 1, 1); // 1 ~ 11월
//		}
//		
//		if (week != 0) {
//			start = 0;
//			for (int i=week; i<=6; i++) {
//				System.out.printf(" %2d ", ++start);
//			}
//		}
		week = weekDay(year, month, lastDay(year, month)) + 1;
		start = 0;
		for (int i=week; i<=6; i++) {
			System.out.printf(" %2d ", ++start); // start = 1이면 start++
		}
		
		System.out.printf("\n=============================\n");
	}
	
//	년도를 인수로 넘겨 받아려 윤년, 평년을 판단해서 윤년이면 true, 평년이면 false를 리턴하는 메소드
//	논리값을 기억하는 변수나 논리값을 리턴하는 메소드의 이름은 "is"로 시작하는 것이 관행이다.
	public static boolean isLeapYear(int year) {
//		boolean result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
	}
	
//	public static void isLeapYear(int year) {
////		boolean result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
//		
//		System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
//		
//	}
	
//	년, 월, 일을 인수로 넘겨받아 1년 1얼 1일부터 지난 날짜를 계산해 리턴하는 메소드
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
	
//	년, 월, 일을 인수로 넘겨받아 요일 숫자로 계산해 리턴하는 메소드
//	일요일(0), 월요일(1), 화요일(2), 수요일(3), 목요일(4), 금요일(5), 토요일(6)
	public static int weekDay(int year, int month, int day) {
		return totalDay(year, month, day) % 7;
		
	}
	
	
}
