import java.util.Scanner;

public class PerfectNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("완전수를 판단할 숫자를 입력하세요: ");
		int number = scanner.nextInt();
		
//		모든 숫자는 자기 자신을 제외하고 나눠서 떨어뜨릴 수 있는 가장 큰 수는 자신의 절반을 넘지
//		않는다.
		int sum = 0; // 자기 자신을 제외한 약수의 합계를 기억할 변수
		for(int i = 1; i <= number / 2; i++) {
//			입력한 숫자의 약수를 판단한다.
			if (number % i == 0) {
				System.out.println(i);
				sum += i; // 약수의 합계를 구한다.
			}
		}
		
//		완전수인가(약수의 합이 자신과 같은가) 판단한다.
		if (number == sum) {
			System.out.println(number + "은(는) 완전수 입니다.");
		} else {
			System.out.println(number + "은(는) 완전수가 아닙니다.");
		}
		
	}

}
