package com.tjoeun.score;

public class ScoreMain1 {
	public static void main(String[] args) {
		/*
		ScoreVO scoreVO = new ScoreVO();
		ScoreVO scoreVO2 = new ScoreVO();
		ScoreVO scoreVO3 = new ScoreVO();
		System.out.println(scoreVO);
		System.out.println(scoreVO2);
//		System.out.println(scoreVO3);
		
		System.out.println("scoreVO.count: " + scoreVO.count);
		System.out.println("scoreVO2.count: " + scoreVO2.count);
		scoreVO3.count = 100;
//		static 변수는 현재 클래스로 생성하는 모든 객체에서 공유하므로 scoreVO2와
//		scoreVO의 count도 수정된다.
		System.out.println("scoreVO2.count: " + scoreVO2.count);
		System.out.println("scoreVO.count: " + scoreVO.count);
		*/
		
		ScoreVO score1 = new ScoreVO("고길동", 100, 80, 90);
		ScoreVO score2 = new ScoreVO("둘리", 71, 85, 93);
		ScoreVO score3 = new ScoreVO("마이콜", 55, 30, 71);
		ScoreVO score4 = new ScoreVO("도우너", 100, 100, 100);
		ScoreVO score5 = new ScoreVO("또치", 87, 61, 77);
		
//		System.out.println(score1);
//		System.out.println(score2);
//		System.out.println(score3);
//		System.out.println(score4);
//		System.out.println(score5);
		
		ScoreList scoreList = new ScoreList();
		
		scoreList.addScore(score1);
		scoreList.addScore(score2);
		scoreList.addScore(score3);
		scoreList.addScore(score4);
		scoreList.addScore(score5);
		
		System.out.println(scoreList);
		
	}

}
