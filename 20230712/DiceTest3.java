import java.util.Random;

public class DiceTest3 {
	public static void main(String[] args) {
		
		Random random = new Random();
		int[] count = new int[6];
				
		for (int i = 0; i < 10; i++) {
//			int dice = random.nextInt(6);
//			System.out.printf("%2d ", dice);
//			count[dice - 1]++;
			count[random.nextInt(6)]++;
		} // for 끝
		
//		System.out.println();
		for (int i = 0; i < count.length; i++) {
			System.out.printf(i + 1 + "의 개수: " + count[i] + '\n');
		}

	}

}
