
public class ZigzagTest2 {
	public static void main(String[] args) {
		
		int [][] a = new int[5][5];
		int k = 0;
		int l = 0; // 2차원 배열에서 숫자가 채워지기 시작하는 열의 인덱스
		int h = a[0].length - 1; // 2차원 배열에서 숫자가 채워지는 마지막 열의 인덱스
		int s = 1; // l부터 h까지 증감치로 사용할 변수
		
		for (int i=0; i<a.length; i++) {
//			숫자 채우기
			for (int j=l; j!=h+s; j+=s) {
				a[i][j] = ++k;
			}
			int temp = l;
			l = h;
			h = temp;
			s *= -1;
		}
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.printf("%2d ", a[i][j]);
			}
			System.out.println();
		}
		
	}

}
