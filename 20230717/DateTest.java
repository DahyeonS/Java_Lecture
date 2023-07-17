import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
//		날짜, 시간 서식 지정하기
//		서식문자를 제외한 나머지 문자는 입력한 그대로 출력한다.
//		SimpleDateFormat sdf = new SimpleDateFormat("날짜/시간 서식");
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초");
		System.out.println(sdf.format(date));
		SimpleDateFormat sdf2 = 
				new SimpleDateFormat("yy. MM. dd(E) a h:mm:ss.SSS");
		System.out.println(sdf2.format(date));
		
//		Date 클래스는 1900년을 기준으로 날짜를 처리하므로 년도는 1900을 더해줘야 한다.
		System.out.println("년: " + (date.getYear() + 1900));
//		Date 클래스는 월을 0 ~ 11월로 처리하므로 1을 더해줘야 한다.
		System.out.println("월: " + (date.getMonth() + 1));
		System.out.println("일: " + date.getDate());
		System.out.println("시: " + date.getHours());
		System.out.println("분: " + date.getMinutes());
		System.out.println("초: " + date.getSeconds());
//		숫자요일 => 0: 일요일 / 1: 월요일 / 2: 화요일 / ... / 6: 토요일
		System.out.println("요일: " + date.getDay());
//		getTime(): 1970년 1월 1일 자정부터 이 메소드가 실행되는 순간까지 지난 시간을 밀리초
//		단위로 표시한다 => 13자리의 정수를 얻어온다.
		System.out.println(date.getTime());
		System.out.println("밀리초: " + date.getTime() % 1000);
		
//		=============================================================
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
//		Calender 클래스를 객체를 이용해서 날짜/시간 서식을 적용하려면 getTime() 메소드를
//		이용해야 한다. => getTime()을 이용해서 날짜/시간 정보만 얻어와서 서식 적용
//		System.out.println(sdf.format(calendar)); // 예외발생(에러)
		
		System.out.println(sdf.format(calendar.getTime()));
		
		System.out.println("년: " + calendar.get(Calendar.YEAR));
		System.out.println("월: " + (calendar.get(Calendar.MONTH) + 1));
		System.out.println("일: " + calendar.get(Calendar.DATE));
		System.out.println("시: " + calendar.get(Calendar.HOUR));
		System.out.println("분: " + calendar.get(Calendar.MINUTE));
		System.out.println("초: " + calendar.get(Calendar.SECOND));
		System.out.println("밀리초: " + calendar.get(Calendar.MILLISECOND));
//		숫자요일 => 1: 일 / 2: 월 / 3: 화 / ... / 7: 토
		System.out.println("요일: " + calendar.get(Calendar.DAY_OF_WEEK));
//		currentTimeMillis(): 1970년 1월 1일 자정부터 이 메소드가 실행되는 순간까지
//		지난 시간을 밀리초 단위로 표시한다.
		System.out.println(System.currentTimeMillis());
		
		long start = System.currentTimeMillis(); // 시작 시간
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis(); // 종료 시간
		
		System.out.println(start);
		System.out.println(end);
		
		System.out.println("실행 시간: " + (end - start) / 1000. + "초");
		SimpleDateFormat sdf3 = new SimpleDateFormat("실행시간: HH:mm:ss.SSS초");
//		currentTimeMills() 메소드를 이용해서 얻어온 시간 데이터를 연산할 경우 일반적인
//		사칙연산을 실행할 경우 별 문제가 발생하지 않지만, 연산 결과를 SimpleDateFormat
//		클래스 객체를 사용해 서식을 지정하면 offset 값이 포함된 시간으로 서식이 적용된다.
//		=> 연산 결과에서 offset 값을 빼면 된다.
		System.out.println(sdf3.format(end - start - 32400000));
		
		
	}

}
