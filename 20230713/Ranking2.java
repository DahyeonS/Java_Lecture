
public class Ranking2 {
	public static void main(String[] args) {
		int[] score = {80, 95, 100, 94, 70};
		int[] rank = new int[score.length];
		for(int i=0; i<rank.length; i++) {
			rank[i] = 1;
		}
		
//	선택정렬을 이용해서 등수를 구한다.
		
		for (int i=0; i<rank.length-1; i++) {
			for (int j=i+1; j<score.length; j++) {
				if (score[i] > score[j]) {
					rank[j]++;
				} else if (score[i] < score[j]) {
					rank[i]++;
				}
			}
		}
		for (int i=0; i<rank.length; i++) {
			System.out.printf("%3d점은 %d등입니다. ", score[i], rank[i]);
			for (int j=0; j<score[i]/10; j++) {
				System.out.print("★");
			}
			if(score[i] % 10 >= 5) {
				System.out.print("☆");
			}
			System.out.println();
		}
		
	}

	
}
