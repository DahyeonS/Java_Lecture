
public class PrintTest {
	public static void main(String[] args) {
		System.out.print("5 + 3 = ");
		System.out.println(5 + 3); // 5 + 3 = 8
//		"+"의 역할
//		=> 양쪽 모두가 숫자일 때: 덧셈 실행 => 1 + 3 + 4
//		=> 한쪽이라도 문자열일 때: 문자열 연결
		System.out.println(5 + "+" + 3 + "=" + 5 + 3); // 5+3=53
		System.out.println(5 + "+" + 3 + "=" + (5 + 3)); // 5+3=8
		System.out.println(5 + " - " + 3 + " = " + (5 - 3)); // 5 - 3 = 2
		System.out.println(5 + " * " + 3 + " = " + 5 * 3); // 5 * 3 = 15
//		자바는 정수와 정수의 연산 결과는 정수이다.(버림)
		System.out.println(5 + " / " + 3 + " = " + 5 / 3); // 몫 (5 / 3 = 1)
		System.out.println(5 + " / " + 3 + " = " + 5. / 3); // 5 / 3 = 1.6666666666666667
		System.out.println(5. + " / " + 3 + " = " + 5. / 3); // 5.0 / 3 = 1.6666666666666667
		System.out.println(5. + " / " + 3. + " = " + 5 / 3.); // 5.0 / 3.0 = 1.6666666666666667
		System.out.println(5. + " / " + 3. + " = " + 5. / 3.); // 5.0 / 3.0 = 1.6666666666666667
		System.out.println(5 + " % " + 3 + " = " + 5 % 3); // 나머지 (5 % 3 = 2)
		System.out.println("===============================================");
		
//		자바의 자료형: 기본 자료형 / 참조 자료형
//		기본 자료형(타입) => 기본 자료형을 이용한 변수는 실제 값을 저장
//		boolean: 1바이트, 논리값(True, False)
		
//		byte: 1바이트, 2진 데이터 전송에 사용한다.
//		char: 2바이트, 문자 1개
//		short: 2바이트, -32768 ~ 32767 사이의 정수
//		int: 4바이트, -2,147,483,648 ~ 2,147,483,647 사이의 정수
//		long: 8바이트, -2의 63제곱 ~ 2의 63제곱 - 1 사이의 정수
//		float: 4바이트, 소수점 아래 약 6자리 정도의 실수(단정도 실수)
//		double: 8바이트, 소수점 아래 약 16자리 정도의 실수(배정도 실수)

//		참조 자료형: 기본 자료형을 제외한 나머지 타입 / 객체의 주소를 저장한다.
		
//		형변환: 변수 또는 상수의 타입을 다른 타입으로 변환하는 것
//		자동(묵시적 / 암시적) 형변환
//		=> 자료형의 크기가 서로 다른 자료의 연산 결과는 크기가 큰 자료혀으로 자동 변환된다.
//		=> byte => short(char) => int => long => float => double
//		=> char => int
//		=> 기존의 값을 최대한 보존할 수 있는 타입으로 자동 형변환한다.
		System.out.println(5. + " / " + 3 + " = " + 5. / 3); // 5.0 / 3 = 1.6666666666666667
		System.out.println('A' + " + " + 32 + " = " + ('A' + 32)); // 문자열 A가 숫자 65로 변환 (A + 32 = 97)
		System.out.println('a' + " - " + 32 + " = " + ('a' - 32)); // 문자열 a가 숫자 97로 변환 (a - 32 = 65)
		System.out.println("===============================================");
		
//		명시적 형변환(강제 형변환) => casting: (변경할 자료형)값
//		프로그래머가 그 순간의 자료형을 지정할 수 있다. => 원하는 순간에 형변환 가능
//		묵시적 형변환의 반대
		System.out.println(5 + " / " + 3 + " = " + (double)5 / 3); // 5 / 3 = 1.6666666666666667
		System.out.println('A' + " + " + 32 + " = " + (char)('A' + 32)); // A + 32 = a
		System.out.println('a' + " - " + 32 + " = " + (char)('a' - 32)); // a - 32 = A
//		boolean을 제외한 나머지 7개의 기본형은 서로 형변환이 가능하다.
//		기본형과 참조형은 서로 형변환 할 수 없다.
		System.out.println("===============================================");
		
//		출력서식
//		printf("출력 서식", 출력할 데이터)
//		출력 서식은 서식문자를 제외한 나머지 내용은 입력한 그대로 출력된다.
//		출력서식 문자: d(정수) / f(실수) / s(문자열) / c(문자)
//		출력 서식의 형식: %[-][0][n][.m]서식문자
//		n: 출력할 전체 자리수, 전체 자리수가 지정되면 오른쪽에 맞춰서 출력한다.
//		-: 전체 자리수가 지정된 경우 왼쪽에 맞춰서 출력한다.
//		0: 전체 자리수가 지정된 경우 남은 자리를 "0"으로 채워준다.
//		m: 소수점 아래 자리수, 잘리는 자리에서 반올림하여 화면에 표시한다.
		System.out.println(100); // 100
		System.out.println(1); // 1
		System.out.println(10000); // 10000
		System.out.println("===============================================");
		System.out.printf("%d\n", 100); // 100
		System.out.printf("%d\n", 1); // 1
		System.out.printf("%d\n", 10000); // 10000
		System.out.println("===============================================");
		System.out.printf("%5d\n", 100); // (  100)
		System.out.printf("%5d\n", 1); // (    1)
		System.out.printf("%05d\n", 1); // (00001)
		System.out.printf("%-5d\n", 1); // (1    )
		System.out.println("===============================================");
		System.out.printf("%s\n", "asd"); // asd
		System.out.printf("%s\n", "a"); // a
		System.out.printf("%s\n", "asdfg"); // asdfg
		
		System.out.printf("%5s\n", "asd"); // (  asd)
		System.out.printf("%5s\n", "a"); // (    a)
		System.out.printf("%5s\n", "asdfg"); // (asdfg)
		
		System.out.printf("%-5s\n", "a"); // (a    )
//		FormatFlagsConversionMismatchException 예외 발생
//		System.out.printf("%05s\n", "a"); // 예외 => 0은 문자열에서 사용할 수 없다.
		System.out.println("===============================================");
//		IllegalFormatConversionException 예외 발생
//		=> 출력 서식 문자와 출력할 데이터 타입이 다를 때
//		System.out.printf("%f\n", 100); // 예외 발생
		System.out.printf("%f\n", 100.); // 100.000000
		System.out.printf("%6.2f\n", 100.); // 100.00
		System.out.printf("%6.2f\n", 62.12); // ( 62.12)
		System.out.printf("%6.2f\n", 62.1); // ( 62.10)
		System.out.printf("%6.2f\n", 12.345); // ( 12.35)
		System.out.printf("%6.0f\n", 12.345); // (   12)
		System.out.println("===============================================");
		System.out.println('A' + 32); // 97
		System.out.printf("%d\n", 'A' + 32); // 97
		System.out.printf("%c\n", 'A'); // A
		System.out.println((char)'A' + 32); // 97
		System.out.printf("%c\n", 'A' + 32); // a
		System.out.printf("%c\n", 48); // 0
		System.out.println("===============================================");
		
		System.out.println(5 + "+" + 3 + "=" + (5 + 3)); // 5+3=8
		System.out.printf("%d + %d = %d\n", 5, 3, 5+3); // 5 + 3 = 8
		System.out.printf("%d - %d = %d\n", 5, 3, 5 - 3); // 5 - 3 = 2
		System.out.printf("%d * %d = %d\n", 5, 3, 5 * 3); // 5 * 3 = 15
		System.out.printf("%d / %d = %d\n", 5, 3, 5 / 3); // 5 / 3 = 1
		System.out.printf("%d / %d = %f\n", 5, 3, 5. / 3); // 5 / 3 = 1.666667
//		출력 서식에 "%" 자체를 출력하려면 "%%"와 같이 입력해야 한다.
		System.out.printf("%d %% %d = %d\n", 5, 3, 5 % 3); // 5 % 3 = 2
		System.out.println("===============================================");
//		출력 서식의 개수보다 출력할 데이터가 많으면 남는 데이터는 무시된다.
		System.out.printf("%d + %d\n", 5, 3, 5 % 3); // 5 + 3
//		MissingFormatArgumentException 예외 발생한다.
//		=> 출력 서식의 개수보다 출력할 데이터가 적으면 예외가 발생한다.
//		System.out.printf("%d + %d = %d\n", 5, 3); // 예외 발생
	}

}
