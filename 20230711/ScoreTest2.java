import java.util.Scanner;

public class ScoreTest2 {
	public static void main(String[] args) {

//		중첩 if => if문 { } 블럭 내에 또 다른 if문
//		if(조건식1) {
//			조건식1이 참일 때 실행할 문장;
//			if(조건식2) {
//				조건식1이 참이고 조건식2가 참일 때 실행할 문장;
//				...;
//			} else {
//				조건식1이 참이고 조건식2가 거짓일 때 실행할 문장;
//				...;
//			}
//		} else {
//			조건식1이 거짓일 때 실행할 문장;
//		}

		int score = 0;
		char grade = ' ', opt = '0'; // 같은 타입의 변수는 ","를 이용해서 한줄 입력 가능
		System.out.print("점수를 입력해 주세요. > ");

		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); // int score = scanner.nextInt();
		System.out.printf("당신의 점수는 %3d점입니다.\n", score);

//		90점 이상이면 A이고 98점 이상이면 A+, 94점 미만이면 A-
//		80점 이상이면 B이고 88점 이상이면 B+, 84점 미만이면 B- 그 외에는 C
		if (score >= 90) {
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			} else if (score < 94) {
				opt = '-';
			}
		} else if (score >= 80) {
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84) {
				opt = '-';
			}
		} else {
			grade = 'C';
		}
		
		System.out.println("당신의 학점은 " + grade + opt + "입니다.");
		
		if (score >= 98) {
			grade = 'A';
			opt = '+';
		} else if (score >= 94) {
			grade = 'A';
		} else if (score < 94 && score >= 90) {
			grade = 'A';
			opt = '-';
		} else if (score >= 88) {
			grade = 'B';
			opt = '+';
		} else if (score >= 84) {
			grade = 'B';
		} else if (score < 84 && score >= 80) {
			grade = 'B';
			opt = '-';
		} else {
			grade = 'C';
		}
		
		System.out.println("당신의 학점은 " + grade + opt + "입니다.");
		
	}

}
