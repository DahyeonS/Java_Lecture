import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
//		key: 정수를 기억하는 변수 또는 연산 결과가 정수인 수식 또는 조건식
//		JDK 1.7부터는 key에 문자열도 사용할 수 있다.
//		key값과 각 case의 value값이 일치하는 경우 해당 case를 실행한다.
//		break: 제어문(if를 제외한 반복문 / 조건문)을 빠져나갈 때(강제종료) 사용
//		switch(key){
//			case value1:
//				해당 case일 때 실행할 문장;
//				...;
//				break;
//			case value2:
//				해당 case일 때 실행할 문장;
//				...;
//				break;
//			[default: // 모든 case에 해당하는 경우
//				모든 case에 해당하지 않을 때 실행할 문장;
//				...;
//				break;
//		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("3과목 점수를 입력하세요: ");
		int kor = scanner.nextInt();
		int eng = scanner.nextInt();
		int math = scanner.nextInt();
		
		int total = kor + eng + math;
		double avg = (double)total / 3;
		System.out.printf("총점: %3d점, 평균: %5.2f점\n", total, avg);
		
		switch ((int)avg / 10) {
			case 10 :
				System.out.println("참 잘했어요!!");
//				System.out.println("A");
//				break; // 제어문의 { } 블록을 탈출한다.
			case 9 :
				System.out.println("A");
				break;
			case 8 :
				System.out.println("B"); break;
			case 7 :
				System.out.println("C"); break;
			case 6 :
				System.out.println("D"); break;
//			case 5 : case 4 : case 3 : case 2 : case 1 : case 0 : 
			default :
				System.out.println("F"); break;
		}

	}

}
