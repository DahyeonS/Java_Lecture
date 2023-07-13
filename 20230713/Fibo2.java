import java.util.Arrays;
import java.util.Scanner;

public class Fibo2 {
	public static void main(String[] args) {
		
//		피보나치 수열의 각 항을 출력하고 합계를 계산한다.
//		항의 수를 입력받고 입력받은 항의 개수만큼 배열을 만든다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("피보나치 수열의 합계를 구할 항수를 입력하세요. > ");
		int n = scanner.nextInt();
		
		int[] fibo = new int[n];
//		System.out.println(Arrays.toString(fibo));
//		System.out.println("배열의 길이: " + fibo.length);
		
//		배열의 1번째, 2번째 요소를 각각 1로 초기화시킨다.
		fibo[0] = 1; // n-2번째 항
		fibo[1] = 1; // n-1번째 항
		int y = 2;
		
//		피보나치 수열의 각 항 값으로 배열을 채우고, 피보나치 수열의 합계를 계산한다.
		for (int k=3; k<=n; k++) {
			fibo[k-1] = fibo[k-3] + fibo[k-2];
			y += fibo[k-1];
		}
//		System.out.println(n + "번째 항까지의 피보나치 수열\n" + Arrays.toString(fibo));
//		피보나치 수열을 출력 => 143 = 1 + 1 + 2 + 3 + .... + 55
		System.out.printf("피보나치 수열의 %d번째 항까지의 합계\n%d = ", n, y);
		for (int i=0; i<fibo.length-1; i++) {
			System.out.print(fibo[i] + " + ");
		}
		System.out.println(fibo[fibo.length-1]);
		
		
		System.out.printf("피보나치 수열의 %d번째 항까지의 합계\n%d = ", n, y);
		for (int i=0; i<fibo.length; i++) {
			if (i > 0) {
				System.out.print(" + ");
			}
			System.out.print(fibo[i]);
		}
		System.out.println();
	}

}
