import java.util.Arrays;

public class Ranking {
	public static void main(String[] args) {
//		i		j
//		0		0 1 2 3 4
//		1		0 1 2 3 4
//		2		0 1 2 3 4
//		3		0 1 2 3 4
//		4		0 1 2 3 4

		int [] score = {80, 100, 70, 80, 100};
//		등수를 기억하는 기억장소는 1로 초기화시킨다.
//		int[] rank = {1, 1, 1, 1, 1};
		int[] rank = new int[5];
		for (int i=0; i<rank.length; i++) {
			rank[i] = 1;
		}
		System.out.println(Arrays.toString(rank));
		
//		등수를 구하는 반복문을 만든다.
		for (int i=0; i<score.length; i++) {
			for (int j=0; j<score.length; j++) {
//				System.out.println("i = " + i + ", j = " + j);
				
//				내림차순 등수(큰 점수가 1등)
//				부등호를 ">"로 수정하면 오름차순 등수(작은 수가 1등)
				if(score[i] < score[j]) {
					rank[i]++;
				}
			}
		}
		for (int i=0; i<rank.length; i++) {
			System.out.printf("%3d점은 %d등입니다. \n", score[i], rank[i]);
		}
		
	}

}
