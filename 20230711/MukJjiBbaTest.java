import java.util.Random;
import java.util.Scanner;

public class MukJjiBbaTest {
	public static void main(String[] args) {
//		가위(1) / 바위(2) 보(3)
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int com, user;
		System.out.println("가위(1) / 바위(2) / 보(3) 선택 >> ");
		user = scanner.nextInt();
		
		com = random.nextInt(3) + 1; // 1 ~ 3 사이의 무작위 수
		System.out.println(com);
		
//		이기는 경우: com이 1이고 user가 2인 경우
//		com이 2이고 user가 3인 경우
//		com이 3이고 user가 1인 경우
//		지는 경우: com이 1이고 user가 3인 경우
//		com이 2이고 user가 1인 경우
//		com이 3이고 user가 2인 경우
//		비기는 경우: 이기는 경우가 지는 경우를 제외한 경우 => com == user
		if (com == user) {
			System.out.println("비겼다.");
		} else if (com == 1 && user == 2 || com == 2 && user == 3
				|| com == 3 && user == 1) {
			System.out.println("이겼다!!");
		} else {
			System.out.println("졌다!!");
		}
		
		if(com - user == -1 || com - user == 2) {
			System.out.println("이겼다.");
		} else if (com - user == 0) {
			System.out.println("비겼다.");
		} else {
			System.out.println("졌다.");
		}
		
		if (com == 1) {
			if (user == 1) {
				System.out.println("비겼다.");
			} else if (user == 2) {
				System.out.println("이겼다.");
			} else {
				System.out.println("졌다.");
			}
		} else if (com == 2) {
				if (user == 1) {
					System.out.println("졌다.");
				} else if (user == 2) {
					System.out.println("비겼다.");
				} else {
					System.out.println("이겼다.");
				}
		} else if (com == 3) {
			if (user == 1) {
				System.out.println("이겼다.");
			} else if (user == 2) {
				System.out.println("졌다.");
			} else {
				System.out.println("비겼다.");
			}
		}
		
		boolean win = com == 1 && user == 2 || com == 2 && user == 3 || com == 3 && user == 1;
		if (com == user) {
			System.out.println("무승부");
		} else {
			System.out.println(win ? "승리" : "패배");
		}
	}

}
