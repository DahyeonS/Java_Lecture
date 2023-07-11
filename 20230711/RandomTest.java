import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		// Math.random(): 0 이상 1 미만인 무작위 수를 발생
		System.out.println(Math.random()); // 0 ~ 1 사이의 실수
		System.out.println((int)Math.random() * 10); // 1 ~ 10 사이의 정수
		System.out.println("=========================================");
		System.out.println((int)(Math.random() * 45) + 1);
		System.out.println((int)(Math.random() * 45) + 1);
		System.out.println((int)(Math.random() * 45) + 1);
		System.out.println((int)(Math.random() * 45) + 1);
		System.out.println((int)(Math.random() * 45) + 1);
		System.out.println((int)(Math.random() * 45) + 1);
		System.out.println("=========================================");
		
//		Random 클래스
		Random random = new Random();
//		nextDouble(): 0 ~ 1 사이의 무작위 수 => Math.random()
//		nextInt(): int형의 크기만큼 그 사이의 무작위 수
//		nextInt(숫자): 0 ~ 숫자 -1 사이의 무작위 수
		System.out.println(random.nextDouble());
		System.out.println(random.nextInt());
		System.out.println(random.nextInt(45)); // 0 ~ 44까지의 무작위 수
		System.out.println("=========================================");
		System.out.println((int)(Math.random() * 45) + 1);
		System.out.println((int)(Math.random() * 45) + 1);
		System.out.println((int)(Math.random() * 45) + 1);
		System.out.println((int)(Math.random() * 45) + 1);
		System.out.println((int)(Math.random() * 45) + 1);
		System.out.println((int)(Math.random() * 45) + 1);
		
	}

}
