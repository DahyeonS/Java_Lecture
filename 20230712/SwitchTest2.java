import java.util.Random;
import java.util.Scanner;

public class SwitchTest2 {
	public static void main(String[] args) {
//		가위(1) / 바위(2)/ 보(3)
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int com, user;
		System.out.print("가위(1) / 바위(2) / 보(3) 선택 >> ");
		user = scanner.nextInt();
		
		com = random.nextInt(3) + 1; // 1 ~ 3 사이의 무작위 수
		System.out.println(com);
		
//		switch ~ case문을 이용해서 가위 / 바위 / 보 게임을 만든다.
//		user - com == 1 또는 -2이면 user가 승 / 2 또는 -1 이면 com 승
		switch (user - com) {
			case 1 : case -2 :
				System.out.println("당신이 이겼습니다.");
				break;
			case 2 : case -1 :
				System.out.println("당신이 졌습니다.");
				break;
			default : // case 0 :
				System.out.println("비겼습니다");
				break; // 마지막 문장이므로 break를 사용할 필요가 없다.
		}
		
		switch (user) {
			case 1 : 
				if (com == 1) {
					System.out.println("비겼다.");
				} else if (com == 2) {
					System.out.println("졌다.");
				} else {
					System.out.println("이겼다.");
				}
				break;
			case 2 : 
				switch (com) {
					case 1 :
						System.out.println("졌다."); break;
					case 2 : System.out.println("비겼다."); break;
					case 3 :
						System.out.println("이겼다."); break;
				}
				break;
			case 3 : 
				switch (com) {
				case 1 :
					System.out.println("이겼다.");
					break;
				case 2 :
					System.out.println("졌다.");
					break;
				case 3 :
					System.out.println("비겼다.");
					break;
				}
				break;
		}
		
	}

}
