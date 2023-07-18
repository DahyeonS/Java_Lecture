import java.util.Scanner;

public class SnailTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("행렬의 차수를 입력하세요: ");
		int row = scanner.nextInt();
		
		int[][] a = new int[row][row];
		int n = 0; // 배열에 채워질 숫자를 1씩 증가시킬 변수
		int s = 1; // 행과 열이 1 또는 -1씩 증가 및 감소 처리에 사용할 변수
		int i = 0; // 행
		int j = -1; // 열
		int k = a[0].length; // 반복문의 반복 횟수 제어에 사용하는 변수
		
		while(true) {
			for (int p=1; p<=k; p++) {
				j += s;
				a[i][j] = ++n;
			}
//			k -= 1;
			if (--k == 0) {
				break;
			}
			if (k > 0) {
				for (int p=1; p<=k; p++) {
					i += s;
					a[i][j] = ++n;
				}
				s *= -1;
			}
			
		}
		for (i=0; i<a.length; i++) {
			for (j=0; j<a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}
		
	}

}
