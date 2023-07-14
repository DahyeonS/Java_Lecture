import java.util.Scanner;

public class MenuTest2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		
//		해당 메뉴를 선택하면(1 ~ 3) 해당 기능을 실행 => 입/출금 기능 구현
		int money = 0;
		int total = 0;
		
		while (menu != 4) {
			do {
				System.out.println("=================================");
				System.out.println("1.입급 | 2.출금 | 3.잔액 | 4.종료");
				System.out.println("=================================");
				System.out.print("원하는 메뉴를 선택하세요. > ");
				menu = scanner.nextInt();
			} while (menu < 1 || menu > 4);

			switch(menu) {
				case 1 :
					System.out.println("===============입금===============");
					System.out.print("금액 입력: ");
					money = scanner.nextInt();
					total += money;
					System.out.printf("%,3d원을 입금하셨습니다.\n", money);
					break;
				case 2 :
					System.out.println("===============출금===============");
					System.out.println("출금");
					System.out.print("금액 입력: ");
					money = scanner.nextInt();
					if (money > total) {
						System.out.println("잔액이 부족합니다.");
					} else {
						total -= money;
						System.out.printf("%,3d원을 출금하셨습니다.\n", money);
					}
					break;
				case 3 :
					System.out.println("===============잔액===============");
					System.out.println("잔액");
					System.out.printf("현재 잔액은 %,3d원입니다.\n", total);
					break;
			}
		}
		System.out.println("프로그램을 종료하겠습니다.");
	}

}
