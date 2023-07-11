import java.util.Scanner;

public class ScoreTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		3과목 점수 입력 받기 -> 각각 하나씩 입력 받기
//		System.out.print("국어 점수: ");
//		int kor = scanner.nextInt();
//		System.out.print("영어 점수: ");
//		int eng = scanner.nextInt();
//		System.out.print("수학 점수: ");
//		int math = scanner.nextInt();
		
//		입력 받을 값 전부 입력 받기 -> 공백으로 구분
		System.out.print("3과목 점수를 입력하세요: ");
		int kor = scanner.nextInt();
		int eng = scanner.nextInt();
		int math = scanner.nextInt();
		
		System.out.println("국어: " + kor + ", 영어: "
		+ eng + ", 수학: " + math);
		
		int total = kor + eng + math;
		double avg = (double)total / 3;
		System.out.printf("총점: %3d점, 평균: %5.2f점\n", total, avg);
		
//		평균 점수가 90점 이상이면 A
		if(avg >= 90) {
			System.out.println("A");
		}
//		평균 점수가 90점 미만이고 80점 이상이면 B
		if(avg < 90 && avg >= 80) {
			System.out.println("B");
		}
//		평균 점수가 80점 미만이고 70점 이상이면 C
		if(avg < 80 && avg >= 70) {
			System.out.println("C");
		}		
//		평균 점수가 70점 미만이고 60점 이상이면 D
		if(avg < 70 && avg >= 60) {
			System.out.println("D");
		}	
//		평균 점수가 60점 미만이면 F
		if(avg < 60) {
			System.out.println("F");
		}
		
//		if ~ else if ~ else
//		if(조건식1) {
//			조건식이 참일 경우 실행할 문장;
//			...;
//		} else if(조건식2) {
//			조건식이 참일 경우 실행할 문장;
//			...;
//		} else {
//			조건식이 거짓일 경우 실행할 문장;
//		}
		
		if(avg >= 90) {
			System.out.println("A");
		} else if(avg >= 80) {
			System.out.println("B");
		} else if(avg >= 70) {
			System.out.println("C");
		} else if(avg >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
	
	
}
