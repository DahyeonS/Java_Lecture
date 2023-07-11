import java.util.Scanner;

public class ScannerTest3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		키보드로 1문자 입력받기
		System.out.print("continue? (y/n) ");
//		charAt(인덱스): 문자열에서 인덱스 번호에 해당하는 문자를 나타낸다.
//		=> 인덱스는 0부터 시작한다.
		char confirm = scanner.nextLine().charAt(0);
		System.out.println(confirm);
		
		System.out.print("주소를 입력하세요. > ");
		String si = scanner.next();
		String gu = scanner.next();
		String dong = scanner.next();
		
		System.out.println("시: " + si);
		System.out.println("구: " + gu);
		System.out.println("동: " + dong);
	}

}
