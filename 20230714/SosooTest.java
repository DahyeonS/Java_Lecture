import java.util.Scanner;

public class SosooTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("소수인지 판단할 숫자를 입력하세요:");
		int n = scanner.nextInt();
//		소수 판별 => for문에서 초기화를 하면 for문 종료 시 소멸되므로 for 이전에
//		초기화한다.
		int i;
//		모든 수는 1로 나눠 떨어지기 때문에 2부터 n까지 나눈다.
		for (i = 2; i <= n; i++) {
//			나눠서 떨어지면 소수인가 판단하기 위해서 반복을 탈출한다.
			if (n % i == 0) {
				break;
			}
		}
		if (n == i) {
			System.out.println(n + "은 소수입니다.");
		} else {
			System.out.println(n + "은 소수가 아닙니다.");
		}
		
//		조건식 ?가 참일 때 실행할 문장: 거짓일 때 실행할 문장
		System.out.println(n + (n == i ? "은 소수입니다." : "은 소수가 아닙니다."));
	}

}
