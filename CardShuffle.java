import java.util.Arrays;
import java.util.Random;

public class CardShuffle {
	public static void main(String[] args) {
//		두 변수에 저장된 값 교환하기
		/*
		int a = 3, b = 4;
		System.out.println("a = " + a + ", b = " + b);
//		a = b; // a에 b의 값을 대입해서 기존의 a의 값은 없어지고 b의 값으로 바뀜 => a == 4
//		b = a; // a == 4이므로 b에는 4가 대입됨
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("a = " + a + ", b = " + b);
		*/
		
		int[] cards = new int[52];
		System.out.println(Arrays.toString(cards));
		for (int i = 0; i < cards.length; i++) {
			cards[i] = i;
		}
//		System.out.println(Arrays.toString(cards));
		String[] number = {"A", "2", "3", "4", "5", "6",
				"7", "8", "9", "10", "J", "Q", "K"};
		String[] symbol = {"♠", "♡", "◇", "♣"};
		char[] symbol2 = {'♠', '♡', '◇', '♣'};
		
//		카드가 섞이기 전 상태를 출력한다.
		for (int i = 0; i < cards.length; i++) {
//			System.out.printf("%2d ", cards[i]);
//			System.out.printf("%2s", number[cards[i] % 13]); // 숫자만
//			System.out.printf("%s", symbol[cards[i] / 13]); // 무늬만
			System.out.printf("%2s%s ", number[cards[i] % 13],
					symbol[cards[i] / 13]);
			if((i + 1) % 13 == 0) {
				System.out.println();
			}
		}
		System.out.println("==============================================");
		
//		섞는다 => 값 교환
//		cards[0]의 값과 cards[1] ~ cards[51] 사이의 랜덤 위치의 값을 선택해서 교환한다.
		Random random = new Random();
		for (int i = 0; i < 100000; i++) {
			int r = random.nextInt(51) + 1; 
			int tmp = cards[0];
			cards[0] = cards[r];
			cards[r] = tmp;
		}
//		System.out.println(Arrays.toString(cards));
		
//		카드가 섞인 후 상태를 출력한다.
		for (int i = 0; i < cards.length; i++) {
			System.out.printf("%2s%s ", number[cards[i] % 13],
					symbol[cards[i] / 13]);
			if((i + 1) % 13 == 0) {
				System.out.println();
			}
		}
	}

}
