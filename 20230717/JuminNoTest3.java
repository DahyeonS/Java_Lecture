import java.util.Scanner;

public class JuminNoTest3 {
	public static void main(String[] args) {
//		8304221185600 => 둘리 주민번호
		Scanner scanner = new Scanner(System.in);
		System.out.print("주민번호 13자리를 입력하세요('-'없이 입력) > ");
		String jumin = scanner.nextLine().trim();
		
//		주민등록번호의 각 자리 숫자에 가중치를 곱한 합계를 계산한다.
		String check = "234567892345";
		int sum = 0;
		for (int i=0; i<check.length(); i++) { // for (int i=0; i<12; i++) {
//			sum += (jumin.charAt(i) - '0') * (check.charAt(i) - '0');
//			System.out.printf("%d * %d = %d\n",
//					(jumin.charAt(i) - '0'), (check.charAt(i) - '0'), (jumin.charAt(i) - '0') * (check.charAt(i) - '0'));
			sum += Integer.parseInt(jumin.charAt(i) + "") * Integer.parseInt(check.charAt(i) + "");
		}
		System.out.println(sum); // 143
		
//		주민등록번호의 각 자리 숫자와 가중치를 곱한 합계를 11로 나눈 나머지를 11에서 뺀다.
//		뺀 결과가 10 이상이면 10의 자리는 버리고 1의 자리만 취한다.
		int result = (11 - sum % 11) % 10;
		System.out.println(result);
		
//		주민등록번호 마지막 자리와 결과를 비교해서 같으면 정상, 그렇지 않으면 오류
		if (result == jumin.charAt(jumin.length() - 1) - 48) { // if (result == jumin.charAt(12) - 48) {
			System.out.println("정상");
		} else {
			System.out.println("오류");
		}
		
	}

}
