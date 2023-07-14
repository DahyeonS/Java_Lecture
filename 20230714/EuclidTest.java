import java.util.Scanner;

public class EuclidTest {
	public static void main(String[] args) {
//		유클리드 호제법을 이용한 최대공약수의 최소공배수 계산하기
//		숫자 2개를 입력받아 큰 수, 작은 수를 판단한다.
//		큰 수를 작은 수로 나눠 떨어지면 작은 수가 최대공약수가 된다.
//		큰 수를 작은 수로 나눠 떨어지지 않으면 큰 수를 기억하는 기억 장소에 작은 수를 넣고
//		작은 수를 기억하는 기억 장소에 나머지를 넣고 큰 수를 작은 수로 나누는 작업을 반복 실행
//		최대공약수가 계산되면 입력받은 숫자 2개를 곱하고 그 결과를 최대공약수로 나누면 최소공배수
//		가 된다.

		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 2개를 입력하세요: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();

//		입력받은 숫자 2개를 큰 수, 작은 수로 판단한다.
		int big, small;
		if (a > b) {
			big = a;
			small = b;
		} else {
			big = b;
			small = a;
		}
		System.out.println("큰 수: " + big + ", 작은 수: " + small);

//		for를 이용한 무한 루프 => for(;;)
		for (;;) { // while(true) {
			int r = big % small; // 큰 수를 작은 수로 나눈 나머지를 계산한다.
			if (r == 0) {
				break;
			} 
//			큰 수를 작은 수로 나눠 떨어지지 않았으면 큰 수를 기억하던 기억 장소에는 작은 수를
//			작은 수를 기억하던 저장 장소에는 나머지를 넣어준다.
			big = small;
			small = r;
		}
//		최대공약수와 최소공배수를 출력한다.
		 System.out.println("최대공약수: " + small + ", 최소공배수: " + a * b / small);
		 
		 
//		for (;;) {
//			if (big % small == 0) {
//				int gcd = small;
//				int lcm = a * b / gcd;
//				System.out.println("최대공약수: " + gcd + ", 최소공배수: " + lcm);
//				break;
//			} else {
//				int tmp = big;
//				big = small;
//				small = tmp % small;
//			}
//		}
	}

}
