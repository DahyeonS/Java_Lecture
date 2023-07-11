import java.util.Scanner; // Ctrl + Shift + O로 필요한 패키지 임포트 / 불필요한 패키지 삭제 가능	

public class ScannerTest {
	public static void main(String[] args) {
		
//		참조형 변수 선언 시 변수의 타입으로 클래스의 이름을 사용한다.
//		클래스 이름이 참조 변수의 타입
//		클래스이름 변수이름(객체이름); // 변수의 타입이 기본형이 아닌 것들은 모두 참조 변수이다.
//		클래스이름 변수이름(객체이름); = new 생성자();
		
//		Scanner 클래스를 사용하기 위해서는 java.util.Scanner를 import 해야함
//		자동 완성을 이용하면 자동 삽입됨 => import java.util.Scanner;
		Scanner scanner = new Scanner(System.in); // 키보드로 입력받는 스캐너
		
//		키보드로 입력받은 데이터를 변수에 저장한다.

//		String은 기본자료형이 아니고 참조 자료형이다. => 클래스
//		=> 객체를 따로 생성하지 않고 기본 자료형처럼 사용할 수 있다.
//		nextLine(): 한 줄 입력
//		next(): 한 단어 입력
		
//		스캐너를 이용해서 키보드로 입력하는 내용을 입력받을 경우 바로 변수에 저장되는 것이 아니고
//		키보드 버퍼라는 임시 기억장소에 저장된 후 읽어들이는 메소드가 실행될 때 변수에 저장된다.
//		nextLine()은 키보드 버퍼가 비어있으면 입력을 기다리며 대기하지만 키보드 버퍼가 비어있지
//		않으면 키보드 버퍼의 내용을 끝까지 읽어들인다.
		System.out.print("주소: ");
		String addr = scanner.nextLine();
//		String addr = scanner.next();
//		scanner.nextLine(); // 키보드 버퍼를 비운다.
		System.out.print("이름: ");
		String name = scanner.nextLine();
		
		System.out.println(name + "님은 " + addr + "에 삽니다.");
		
	}

}
