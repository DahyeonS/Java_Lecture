import java.util.Scanner;

public class MenuTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		
		while (menu != 4) {
			
			do {
				System.out.println("=================================");
				System.out.println("1.입급 | 2.출금 | 3.잔액 | 4.종료");
				System.out.println("=================================");
				System.out.print("원하는 메뉴를 선택하세요. > ");
				menu = scanner.nextInt();
			} while (menu < 1 || menu > 4);
			
//			여기까지 왔다면 menu에 1 ~ 4 사이의 정수가 입력되었다는 것을 의미한다.
			switch(menu) {
				case 1 :
					System.out.println("입금"); break;
				case 2 : System.out.println("출금"); break;
				case 3 : System.out.println("잔액"); break;
				/*
				case 4 :
					System.out.println("프로그램을 종료합니다.");
//					프로그램 강제 종료
					System.exit(0);
					break;
					*/
			}
			/*
			if (menu == 4) {
				break;
			}
			*/
		}
		System.out.println("프로그램을 종료하겠습니다.");
	}

}
