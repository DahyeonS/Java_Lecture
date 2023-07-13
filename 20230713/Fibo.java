import java.util.Scanner;

public class Fibo {
	public static void main(String[] args) {
		int a = 1; // 1번째 항의 값 초기화 => 피보나치 수열의 n-2번째 항의 값
		int b = 1; // 2번째 항의 값 초기화 => 피보나치 수열의 n-1번째 항의 값
		// 1번째 항과 2번째 항의 더한 값 => n번째 항까지의 피보나치 수열의 기억
		int y = 2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("피보나치 수열의 합계를 구할 항수를 입력하세요. > ");
		int n = scanner.nextInt();
		
//		1항과 1항의 값은 이미 합계가 계산된 상태이므로 3번째 항부터 n번째 항까지 합계에 누적
		for (int k=3; k<=n; k++) {
			int c = a + b; // 피보나치 수열의 n-2번째 항과 n-1번째 항을 더해서 n번째 항을 구함
			y += c; // 피보나치 수열의 합계를 계산한다.
			
//			피보나치 수열의 다음 항 값을 계산하기 위해 변수값을 수정 => 값을 이동시킨다.
			a = b; // 현재 작업의 n-1항의 값을 다음 작업의 n-2항으로 넣어준다.
			b = c; // 현재 작업의 n항의 값을 다음 작업의 n-1항으로 넣어준다.
		}
		System.out.println("피보나치 수열의 " + n + "번째 항까지의 합계: " + y);
	}

}
