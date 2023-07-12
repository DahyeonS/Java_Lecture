
public class ForTest {
	public static void main(String[] args) {
//		반복문은 어떤 직업이 반복적으로 수행되도록 할 때 사용
//		주어진 조건을 만족하는 동안 반복 수행 => { } 블록 내부에 있는 내용을 반복 실행
//		for / while / do ~ while
//		for => 반복횟수를 알고 있을 때 적합하다.
//		for(초기화; 조건식; 증감식) {
//			조건식이 참일 때 반복할 문장;
//			...;
//		} // 초기화 / 증자식은 ','를 이용해서 두 문장 이상을 하나로 연결해서 사용 가능
		
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
		
		for (int i = 1; i <= 5; i = i + 1) {
			System.out.println(i);
		}
//		i는 for 내부에서 선언이 되었으므로 for문이 종료와 동시에 메모리에서 소멸
//		System.out.println(i); // 에러
		
		int sum = 0;
		int i;
//		실행순서 => 초기화 -> 조건식 -> 반복실행 -> 증감식 -> 조건식 -> 반복실행 -> 증감식...
//		조건을 만족하지 않으면 반복을 종료한다. => 처음부터 조건을 만족하지 못하면 반복은 시작되지
//		않는다.
		for (i = 0; i <= 10; i += 1) {
			sum += i; // sum = sum + i
			System.out.printf("%2d ", i);
		}
		System.out.println("\n1 ~ 10의 합계: " + sum);
		System.out.println(i);
//		for(;;) => 무한반복(초기화 / 조건식 / 증감식 모두 생략 가능)
		System.out.println("========================");
		
		for (int j = 0; j < 10; j ++) {
			System.out.printf("%3d", j);
		}
		System.out.println();
//		증감연산자: ++(1증가) / --(1감소) -> j++ : j = j + 1
//		a++ : 연산(사용) 후 1 증가 -> a 변수에 저장된 값을 연산하고, ;을 만나서 문장이 종료
//		될 때 1 증가
//		++a : 1 증가 후 연산(사용) -> a에 저장된 값을 1 증가한 다음에 연산한다.
//		a-- : 연산 후 1 감소
//		--a : 1 감소 후 연산
		
		int a = 1, b, c;
//		a++;
//		System.out.println(a);
//		++a;
//		System.out.println(a);

		b = a++; // b = 1, a = 2
		c = ++a; // c = 3, a = 3
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		
		int d = 1;
		int e = ++d + ++d + ++d + ++d;
		System.out.println("d = " + d + ", e = " + e);
	}

}
