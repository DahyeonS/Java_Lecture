package com.tjoeun.memo;

import java.util.Date;

// 메모 1건을 기억하는 클래스
public class MemoVO {

//	메모번호 => 자동증가 / 작성자 이름 / 비밀번호 / 메모 / 작성일
	
//	필드
	public static int count; // 자동증가에 사용할 정적 필드
	private int idx; // 메모번호 => 자동증가
	private String name; // 작성자
	private int password; // 비밀번호
	private String meno; // 메모
	private Date writeDate; // 작성일 => 컴퓨터 시스템의 날짜와 시간으로 자동 설정
	
//	생성자
	public MemoVO() {
		
	}
	
	public MemoVO(String name, int password, String meno, Date writeDate) {
		super();
		idx = ++count;
		this.name = name;
		this.password = password;
		this.meno = meno;
		this.writeDate = writeDate;
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
	
	public int getPassword() {
		return password;
	}
	
	public void setPassword(int password) {
		this.password = password;
	}
	
	public String getMeno() {
		return meno;
	}
	
	public void setMeno(String meno) {
		this.meno = meno;
	}
	
	public Date getwriteDate() {
		return writeDate;
	}
	
	public void setwriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

//	toString()
	@Override
	public String toString() {
		return "MemoVO [idx=" + idx + ", name=" + name + ", password=" + password + ", meno=" + meno + ", writeDate=" + writeDate
				+ "]";
	}
	
	
	
}
