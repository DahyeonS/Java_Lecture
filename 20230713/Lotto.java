import java.util.Arrays;
import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
//		1 ~ 45까지의 숫자를 기억할 배열을 선언한다.
		int [] lotto = new int[45];
		
//		lotto 배열을 1 ~ 45로 초기화한다.
		for (int i=0; i<lotto.length; i++) {
			lotto[i] = i + 1;
		}
//		System.out.println(Arrays.toString(lotto));
		
//		섞기 전 배열번호 출력하기 => 숫자 9개가 출력되면 줄을 바꾼다.
		for (int i=0; i<lotto.length; i++) {
			System.out.printf("%02d ", lotto[i]);
			if ((i + 1) % 9 == 0) {
				System.out.println();
			}
		}
		System.out.println("===============================");
		
//		lotto 배열의 값을 섞는다.
//		lotto 배열의 0번째 값은 고정하고 1 ~ 44번째 값들 중 랜덤하게 뽑아낸 번호의 배열 요소의
//		값과 0번재 값을 교환한다.
		Random random = new Random();
		for (int i = 0; i < 100000; i++) {
			int r = random.nextInt(44) + 1; 
			int tmp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = tmp;
		}
//		System.out.println(Arrays.toString(lotto));
		for (int i=0; i<lotto.length; i++) {
			System.out.printf("%02d ", lotto[i]);
			if ((i + 1) % 9 == 0) {
				System.out.println();
			}
		}
		System.out.println("===============================");
		
//		로또번호를 출력한다. => 6개의 중복디지 않은 숫자를 나타낸다.
		System.out.printf("로또 번호: ");
		for (int i=0; i<6; i++) {
			System.out.printf("%02d ", lotto[i]);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("\n보너스 번호: " + lotto[6]);
		
	}

}
