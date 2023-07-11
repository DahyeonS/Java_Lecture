import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {

		int input;
		System.out.println("숫자 하나를 입력하세요: ");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 키보드로 입력받은 내용 문자열로 저장
		input = Integer.parseInt(tmp); // 입력받은 문자열을 숫자로 변환

		if (input == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}

//		if (input != 0) // if는 실행문장이 한 문장일 때는 { } 블록을 생략해도 된다.
//			System.out.println("입력하신 숫자는 0이 아닙니다.");
//
//		System.out.printf("입력하신 숫자는 %d입니다.", input);

		if (input != 0) {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.printf("입력하신 숫자는 %d입니다.", input);
		}
		
	}

}
