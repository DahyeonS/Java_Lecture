import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto2 {
	public static void main(String[] args) {
		int[] lotto = new int[45];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}

//		구매 금액을 입력받는다. => 로또 1회 당 1000원 ex)10000 => 10회 반복
		System.out.print("구매 금액을 입력하세요. > ");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
//		구매 금액만큼 로또번호 추첨기를 반복 실행한다.
		for (int i = 0; i < money / 1000; i++) {
//			1 ~ 45까지의 번호를 섞는다.
			Random random = new Random();
			for (int j = 0; j < 100000; j++) {
				int r = random.nextInt(44) + 1;
				int tmp = lotto[0];
				lotto[0] = lotto[r];
				lotto[r] = tmp;
			} // for j

//			로또번호 출력
			int[] lottoNum = new int[6];
			for (int j=0; j<lottoNum.length; j++) {
				lottoNum[j] = lotto[j];
			} // for j
			Arrays.sort(lottoNum);
			
//			System.out.printf("%3d 자   동 ", i + 1);
			System.out.printf("%2c 자   동 ", i + 65);
			for (int j=0; j<lottoNum.length; j++) {
				System.out.printf("%02d ", lottoNum[j]);
			} // for j
			System.out.println();
		} // for i
		System.out.println("------------------------------");
		System.out.printf("금액                ￦ %,3d", money);

	}

}
