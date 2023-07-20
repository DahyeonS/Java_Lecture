package com.tjoeun.score;

// 학생 1명의 성적을 기억하는 클래스 => 일련번호 / 이름 / kor / eng / math / 총점 / 평균 / 등수
public class ScoreVO {
	
//	정적(static) 필드(멤버변수): 현재 클래스로 생성되는 모든 객체에서 공유해서 사용한다.
//	static을 붙여서 선언한 변수는 현재 클래스의 객체가 생성될 때 최초 1번만 메모리에 만들어지고
//	현재 클래스의 객체가 또 생성되더라도 다시 생성하지 않는다.
//	static을 붙여서 선언한 변수나 메소드는 클래스 객체를 생성하지 않고 클래스 이름에 "."을 찍으서
//	바로 접근할 수 있다.
	public static int count;
	
//	인스턴스 필드(멤버변수)
//	인스턴스 필드는 현재 클래스로 생성되는 모든 객체에서 독립된 기억공간을 가진다.
	private int idx; // 일련번호 => 자동증가
	private String name; // 이름
	private int kor; // 국어점수
	private int eng; // 영어점수
	private int math; // 수학점수
	private int total; // 총점
	private double avg; // 평균
	private int rank = 1; // 등수
	
//	생성자 => 기본 생성자 / 이름과 점수를 초기화하는 생성자
	public ScoreVO() {
//		public ScoreVO(String name, int kor, int eng, int math) 생성자를 호출한다.
		this("기타", 0, 0, 0);
		
	}
	
	public ScoreVO(String name, int kor, int eng, int math) {
		super();
		idx = ++count;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
//		총점과 평균을 계산한다.
		total = kor + eng + math;
		avg = (double)total / 3;
	}
	
//	getters & setters
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

//	toString()
	@Override
	public String toString() {
		return "ScoreVO [idx=" + idx + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", total=" + total + ", avg=" + avg + ", rank=" + rank + "]";
	}
	
}
