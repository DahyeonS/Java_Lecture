import java.util.Scanner;

public class ScannerTest2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이: ");
		int age = scanner.nextInt();
//		nextInt(): 정수 입력
//		nextDouble(): 실수 입력
//		=> 문자열이 아닌 데이터를 읽어들이는 메소드는 메소드 자신이 읽어들일 데이터만 읽어들인다.
//		=> 마지막의 엔터키는 읽어들이지 않는다.
		scanner.nextLine(); // 키보드 버퍼를 비운다.
		
		System.out.print("이름: ");
		String name = scanner.nextLine();
		
		System.out.println(name + "님은 " + age + "세 입니다.");
		System.out.println(name + "님은 내년에 " + (age + 1) +"세 입니다.");
		
//		Integer.parseInt(변수 / "값") => 문자열을 정수로 바꿈
//		=> nextInt(), nextDouble() 이런 경우에 연속해서 데이터를 입력할 때 키보드 버퍼를
//		비우고 사용해야 하는 번거로움이 있기 때문에 wrapper 클래스를 이용해서 문자열을 숫자로
//		변환해서 사용해도 된다.
		System.out.println("두 자리 정수를 입력하세요. > ");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
		
		System.out.println("입력 내용: " + input);
		System.out.printf("num = %d\n", num);
		System.out.println("num + 1 = " + (num + 1));
		
	}

}
