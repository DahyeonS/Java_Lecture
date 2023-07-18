import java.util.Arrays;

public class ZigzagTest {
	public static void main(String[] args) {
//		2차 배열: 주로 테이블의 형태의 데이터를 담는 데 사용된다.
//		2차원 배열은 행과 열로 구성되어 있기 때문에 index도 행 / 열에 각각 존재한다.
//		행 index: 0 ~ 행의 개수 - 1
//		열 index: 0 ~ 열의 개수 - 1
//		타입[행][열] 배열이름 = new 자료형[행개수][열개수];
//		배열 요소 접근 방법: 배열이름[행인덱스][열인덱스]
		
//		int[][] a = {{1, 2, 3}, {4, 5, 6}}; // 선언과 동시에 2행 3열 배열을 초기화
//		int[][] a = new int [2][3]; // 2차 배열 선언 => 기본값으로 초기화
		
//		int[][] a = new int[4][6]; // 4행 6열
//		int n = 0; // 배열에 채워질 숫자를 1씩 증가시키는 변수
		
//		System.out.println("행의 개수: " + a.length);
//		System.out.println("열의 개수: " + a[0].length);
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(a[0]));
//		a[2][3] = 100;
		
//		for (int i=0; i<a.length; i++) {
////			System.out.println(Arrays.toString(a[i]));
//			for (int j=0; j<a[i].length; j++) {
//				a[i][j] = ++n;
//				System.out.printf("%2d ", a[i][j]);
//			}
//			System.out.println();
//		}
		
		int[][] a = new int[4][6]; // 4행 6열
		int n = 0; // 배열에 채워질 숫자를 1씩 증가시키는 변수
		
//		'ㄹ'자 배열 만들기 => 짝수행일 때 숫자가 왼쪽 -> 오른쪽 / 홀수행일 때는 오른쪽 -> 왼쪽
		for (int i=0; i<a.length; i++) {
//			짝수행과 홀수 행이 채워지는 방향이 다르므로 반복문을 별도로 만든다.
			if (i % 2 == 0) { // 짝수행
				for (int j=0; j<a[i].length; j++) {
					a[i][j] = ++n;
				}
			} else { // 홀수행
				for (int j=a[i].length-1; j>=0; j--) {
					a[i][j] = ++n;
				}
			}
		}
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.printf("%2d ", a[i][j]);
			}
			System.out.println();
		}
		
	}

}
