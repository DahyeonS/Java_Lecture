import java.util.Scanner;

public class SoinsooTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("소인수 분해할 숫자를 입력하세요: ");
			int n = scanner.nextInt();

			if (n < 2) {
				break;
			}

//			소인수 분해
			int[] s = new int[20];
			int num = n;
			int c = 0;

			while (true) {
				int k = 2;

				while (true) {
					int r = n % k;
					if (r == 0) { // 소인수분해가 되었는가?
						break;
					}
//				소인수 분해가 되지 않았다면 k를 1 증가시키고 다시 소인수 분해를 실행한다.
					k++;
				}
//			소인수 분해가 되었으므로 s배열에 소인수를 넣어준다.
//			s[c] = k;
//			c++;
				s[c++] = k;
//			다음 소인수를 얻기 위해 n을 k로 나눈 몫을 구한다.
				n /= k;
				
				if (n == 1) { // 소인수분해가 끝났는가?
					break;
				}
			}
//			n이 소수면 소수라고 출력하고 소수가 아니면 분해된 소인수를 출력한다.
//			소인수의 개수(c)가 1개라면 자기 자신으로 나누어 떨어진 것을 의미하므로 소수이다.
			
			if (c == 1) {
				System.out.println(num + "은 소수입니다.");
			} else {
//				소인수를 출력한다.
				System.out.print(num + " = ");
				// 맨 마지막 소인수를 제외하고 출력한다. '*'를 마지막에 출력하지 않음
				for (int y = 0; y < c-1; y++) {
					System.out.print(s[y] + " * ");
				}
				System.out.println(s[c-1]);
			}
			
			
		}
		System.out.println("프로그램을 종료합니다.");

	}
}
