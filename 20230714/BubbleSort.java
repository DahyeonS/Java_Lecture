import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
//		i		j
//		0		0	1	2	3
//		1		0	1	2
//		2		0	1
//		3		0
		
//		int[] data = {8, 3, 4, 9, 1};
		int[] data = {9, 1, 3, 4, 8};
		for (int i=0; i<4; i++) { // 회전 수 제어
			for (int j=0; j<4-i; j++) { // 비교위치 설정 => 비교한 후 값 교환
//				System.out.printf("i = %d, j = %d\n", i, j);
				if (data[j] > data[j+1]) {
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				} 
			} // 회전 종료
			System.out.println(i + 1 + "회전 결과: " + Arrays.toString(data));
		} // 정렬 종료
		System.out.println("정렬 결과: " + Arrays.toString(data));
	}

}
