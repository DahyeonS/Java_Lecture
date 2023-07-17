import java.util.Arrays;
import java.util.Scanner;

public class StringMethodTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String str = "       tjoeunit       ";
		System.out.println(str);
//		length(): 문자열을 구성하는 문자의 개수를 얻어온다.
		System.out.println("문자 개수:" + str.length());
		
//		trim(): 문자열 앞, 뒤의 불필요한 빈칸(공백)을 제거한다.
		System.out.println("불필요한 공백제거: " + str.trim());
		System.out.println("불필요한 공백제거 후 문자개수: " + str.trim().length());
		
//		System.out.print("문자열 입력: ");
//		데이터 입력 단계에서 불필요한 공백을 제거하고 입력 받으려면 아래와 같이 trim() 메소드를
//		사용한다.
//		String str2 = scanner.nextLine().trim();
//		System.out.println(str2);
		
		str = "tjoeunit";
//		charAt(indes): 문자열에서 지정된 index번째 위치의 문자를 얻어온다.
//		index는 0부터 시작한다.
		System.out.println("6번째 문자: " + str.charAt(5));

//		System.out.print("문자열 입력: ");
//		키보드로 1문자만 입력 받으려면 아래와 같이 charAt() 메소드를 사용한다.
//		char ch = scanner.nextLine().charAt(0);
//		System.out.println(ch);
		
		str = "TjoeunIT";
//		toUpperCase(): 영문자를 무조건 대문자로 변환
//		toLowerCase(): 영문자를 무조건 소문자로 변환
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		str = "8304221185600";
//		substring(a): 문자열의 a번째 index의 문자부터 문자열의 끝까지 얻어온다.
//		substring(a, b): 문자열의 a번째 index의 문자부터 b-1번째 index의 문자까지
//		얻어온다.
		System.out.println("주민등록번호 뒷자리: " + str.substring(6));
		System.out.println("생년: " + str.substring(0, 2));
		System.out.println("월: " + str.substring(2, 4));
		System.out.println("일: " + str.substring(4, 6));
		
		str = "itTjoeunit";
//		indexOf(): 문자열의 왼쪽부터 검색해서 인수로 지정한 문자열이 최초로 나타나는 index를
//		얻어온다.
//		lastindexOf(): 문자열의 오른쪽부터 검색해서 인수로 지정한 문자열이 최초로 나타나는
//		index를 얻어온다.
		System.out.println(str.indexOf("it"));
		System.out.println(str.lastIndexOf("it"));
//		indexOf(), lastIndexOf() 메소드는 인수로 지정한 문자열이 없으면 -1을 리턴한다.
		System.out.println(str.indexOf("IT"));
		System.out.println(str.lastIndexOf("It"));
//		indexOf(), lastIndexOf() 메소드의 실행 결과가 0 이상이면 인수로 지정된 문자열이
//		포함되었다는 의미로 사용할 수 있다. => -1이 나오면 포함되지 않았다.
		
		str = "itTjoeunit";
//		contains(): 문자열에 인수로 지정한 문자열이 포함되어 있으면 true, 없으면 false
		System.out.println(str.contains("it"));
		System.out.println(str.contains("IT"));
		
		str = "abc 123 가나다";
//		split("구분자"): 문자열을 구분자로 나눠서 배열로 리턴한다.
		String[] s = str.split(" ");
		System.out.println(Arrays.toString(str.split(" ")));
		System.out.println(Arrays.toString(s));
		System.out.println(str.split(" ").length);
		System.out.println(str.split(" ")[0]);
		
		for (String s2 : str.split(" ")) {
			System.out.println(s2);
		}
		
		str = "itTjoeunit";
//		replace(a, b): 문자열의 모든 a를 b로 치환한다.
		System.out.println(str.replace("i", "아이"));
		
//		repeat(): 문자열을 인수로 지정한 개수만큼 반복한다.
		System.out.println("A".repeat(3));
		
//		"-" 사이에 있는 문자열을 "*"로 바꾸기
		str = "123-456789-123456";
		System.out.println("앞쪽 '-'의 index: "+ str.indexOf("-"));
		System.out.println("뒤쪽 '-'의 index: "+ str.lastIndexOf("-"));
		String code = str.substring(str.indexOf("-") + 1, str.lastIndexOf("-"));
		System.out.println(code);
		System.out.println(code.length());
		String newCode = "";
		
		newCode += str.substring(0, str.indexOf("-") + 1);
//		for (int i=0; i<code.length(); i++) {
//			newCode += "*";
//		}
		newCode += "*".repeat(code.length());
		newCode += str.substring(str.lastIndexOf("-"));
		System.out.println(newCode);
		
		String[] newCode2 = str.split("-");
		System.out.println(Arrays.toString(newCode2));
		
		System.out.printf("%s-%s-%S", newCode2[0],
				"*".repeat(newCode2[1].length()), newCode2[2]);
		
//		System.out.println(str.replace(str.split("-")[1], "*".repeat(str.split("-")[1].length())));

	}

}
