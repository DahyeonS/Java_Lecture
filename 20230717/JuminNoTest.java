import java.util.Scanner;

public class JuminNoTest {
	public static void main(String[] args) {
		
//		8304221185600 => 둘리 주민번호
//		주민등록번호 13자리를 "-"없이 입력받아 성별 판단하기
		Scanner scanner = new Scanner(System.in);
		System.out.print("주민번호 13자리를 입력하세요('-'없이 입력) > ");
		String jumin = scanner.nextLine().trim();
		
//		System.out.println(jumin.charAt(6));
//		System.out.printf("%d\n", (int)jumin.charAt(6));
		
//		숫자와 문자표현 방법이 다르다.
//		문자 '1'(0110001 / 49)과 숫자 1(0000001)은 다른 데이터로 취급한다.
		
		if (jumin.charAt(6) == '1' || jumin.charAt(6) == '3') {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		if (jumin.charAt(6) - '0' == 1 || jumin.charAt(6) - 48 == 3) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		if (jumin.charAt(6) % 2 == 0) {
			System.out.println("여자");
		} else {
			System.out.println("남자");
		}
		
	}

}
