package com.tjoeun.score;

import java.util.ArrayList;

public class ScoreList {
	
	private ArrayList<ScoreVO> scoreList = new ArrayList<ScoreVO>();
	
	
	public ArrayList<ScoreVO> getScoreList() {
		return scoreList;
	}
	
	public void setScoreList(ArrayList<ScoreVO> scoreList) {
		this.scoreList = scoreList;
	}

	@Override
	public String toString() {
		String str = "";
		str += "=========================================================\n";
		str += "  번호 | 이름 | 국어 | 영어 | 수학 | 총점 | 평균 | 등수 \n";
		str += "=========================================================\n";
		
//		등수 구하기 => 총점을 가지고 와서 비교한다.
//		=> scoreList.get(index).getTotal() => ArrayList 요소의 총점
//		=> scoreList.get(index).setRank() => 등수 변경
		for (int i=0; i<scoreList.size()-1; i++) {
			for (int j=i+1; j<scoreList.size(); j++) {
				if (scoreList.get(i).getTotal() > scoreList.get(j).getTotal()) {
					scoreList.get(j).setRank(scoreList.get(j).getRank() + 1);
				} else if (scoreList.get(i).getTotal() < scoreList.get(j).getTotal()) {
					scoreList.get(i).setRank(scoreList.get(i).getRank() + 1);
				}
			}
		}
		
		
		for (ScoreVO vo : scoreList) {
			str += vo + "\n";
		}
		str += "=========================================================";
		
		return str;
	}
	
	
//	ArrayList에 성적 데이터를 추가하는 메소드
	public void addScore(ScoreVO score) {
		scoreList.add(score);
	}
	
}
