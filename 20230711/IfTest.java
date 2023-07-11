import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		
//		관계(비교)연산자: 연산 결과가 무조건 참(True) 또는 거짓(False)이다.
//		> : 초과 / >= : 이상 / < : 미만 / <= : 이하 / != : 같지 않다 / == : 같다
		
//		논리 연산자: 연산 결과가 무조건 참(True) 또는 거짓(False)이다.
//		&& : and(논리곱) => 조건1 && 조건2 -> 두 조건이 모드 참(Ture)일 경우에만 참
//		=> ~이고 / ~이면서 / ~중에서 / ~그리고
//		|| : or(논리합) => 조건1 || 조건2 -> 두 조건 중에서 하나 이상 참일 경우에만 참
//		=> ~또는 / ~이거나 / ~혹은
//		! : not(논리부정) => !조건 -> 참을 거짓으로 거짓을 참으로 바꾸다.

//		대입 연산자
//		= : 오른쪽에 있는 값을 왼쪽 변수에 대입한다.
//		+=, -=, *=, /=, %= => a = a + 1 => a += 1 / a *= 2 => a = a * 2
		
//		연산자 우선수위
//		단항 연산자 => 이항 연산자(산술, 관계, 논리) => 삼항 연산자 => 대입 연산자
//		이항 연산자
//		() => ! => 산술연산자(*, /, % => +, -) => 관계연산자(>, >=, <. <=)
//		=> 관계연산자(==, !=) => 논리연산자(&&, => ||)
		
//		if(조건식) {
//			조건식이 참일 경우에 실행할 문장;
//			...;
//		} else {
//			조건식이 거짓일 경우에 실행할 문장;
//			...;
//		}
//		조건식이 거짓일 경우를 사용할 필요가 없다면 else 이하를 생략하면 된다.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		int age = scanner.nextInt();
		
		if(age >= 20) {
			System.out.println("성인 입니다.");
		} else {
			System.out.println("미성년자 입니다.");
		}
		
		scanner.nextLine(); // 키보드 버퍼를 비운다.
		
//		둘리 주민번호: 830422-1185600
		System.out.println("주민 번호를 입력하세요 > ");
		char gender = scanner.nextLine().charAt(7);
		
		if(gender == '1' || gender == '3') {
			System.out.println("성별은 남성입니다.");
		} else {
			System.out.println("성별은 여성입니다.");
		}
		
	}

}
