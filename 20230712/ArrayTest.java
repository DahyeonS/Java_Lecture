import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
//		배열: 같은 이름으로 여러 개의 기억장소를 만든다.
//		같은 타입의 여러 변수를 하나의 묶음으로 다루는 것이다.
//		기억장소 구분은 인덱스(첨자)를 이용한다.
		
//		배열 선언 => 자료형(타입)[] 배열이름 = new 자료형[배열의 길이(크기)];
//				  => 자료형 배열이름[] = new 자료형[길이];
//		배열을 선언만 하면 기본 초기화가 실행된다.
//		=> int: 0 / double: 0.0 / boolean: false / char: 공백
//		=> 기본 자료형을 제외한 나머지(참조자료형 -> 클래스로 만든 객체)는 null로 초기화
		
		int[] num = new int[5];
		System.out.println(num);
//		Arrays.toString => 배열의 요소들을 문자열로 만들어서 출력
		System.out.println(Arrays.toString(num));
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		
		String[] data = new String[5];
		System.out.println(Arrays.toString(data));
		System.out.println("============================");
		
//		자료형[] 배열이름 = {초기화 값};
//		자료형 배열이름[] = {초기화 값};
//		생성된 배열의 각 저장공간을 '배열의 요소(element)'라고 한다.
//		배열이름[인덱스]의 형식으로 배열 요소에 접근한다.
//		인덱스: 배열 요소마다 붙여진 일련번호 => 인덱스는 0부터 시작한다.
		
		String[] name = {"고길동", "둘리", "마이콜", "영희", "철수", "도우너"};
		System.out.println(Arrays.toString(name));
//		System.out.println(name[0]);
//		System.out.println(name[1]);
//		System.out.println(name[2]);
//		System.out.println(name[3]);
//		System.out.println(name[4]);
//		System.out.println(name[5]);
		System.out.println("=======================");
		
//		배열이름.length: 배열의 길이(크기)
//		배열은 한 번 생성되면 길이(크기)를 변경할 수 없다.
		
//		for (int i = 0; i < 6; i++) {
//			System.out.println("name[" + i + "] = " + name[i]);
//		}
		System.out.println("=======================");
		System.out.println("배열의 길이 = " + name.length);
		for (int i = 0; i < name.length; i++) {
			System.out.println("name[" + i + "] = " + name[i]);
		}
		
//		향상된 for: 배열 또는 컬렉션 전체를 대상으로 사용할 경우 편리하다.
//		for(배열의 타입 변수이름 : 배열이름) {
//			반복할 문장;
//			...;
//		}
		
		
//		name 배열의 0번째 인덱스에 저장된 데이터가 str 변수에 저장된 후 반복을 시작
//		name 배열의 마지막 인덱스에 저장된 str 변수에 저장한 후 처리하면 반복이 종료
		for (String str : name) {
			System.out.println(str);
		}
				
	}

}
