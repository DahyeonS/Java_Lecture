package com.tjoeun.score;

import java.util.Scanner;

public class ScoreMain {
	public static void main(String[] args) {
		
//		학생 이름과 점수를 입력받아서 성적을 구하는 코드
		
		Scanner scanner = new Scanner(System.in);
		ScoreList scoreList = new ScoreList();
		
		while (true) {
			System.out.print("학생 이름을 입력하세요.(Q: 입력종료) > ");
			String name = scanner.nextLine();
			if (name.toUpperCase().equals("Q")) {
				break;
			} else {
				System.out.print("3과목 점수를 입력하세요. > ");
				int kor = scanner.nextInt();
				int eng = scanner.nextInt();
				int math = scanner.nextInt();
				scanner.nextLine();
				
				ScoreVO vo = new ScoreVO(name, kor, eng, math);
				scoreList.addScore(vo);
			}
			
		}
		System.out.println(scoreList);
		System.out.println("전체 학생 수: " + ScoreVO.count + "명");
		
		
		
		
		
		
	}

}
