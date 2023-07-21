package com.tjoeun.memo;

import java.text.SimpleDateFormat;
import java.util.Date;

// 메모 1건을 기억하는 클래스
public class MemoVO {

//	메모번호 => 자동증가 / 작성자 이름 / 비밀번호 / 메모 / 작성일
	
//	필드
	public static int count; // 자동증가에 사용할 정적 필드
	private int idx; // 메모번호 => 자동증가
	private String name; // 작성자
	private String password; // 비밀번호
	private String memo; // 메모
	private Date writeDate; // 작성일 => 컴퓨터 시스템의 날짜와 시간으로 자동 설정
	
//	생성자
	public MemoVO() {
		
	}
	
//	public MemoVO(String name, String password, String memo, Date writeDate) {
	public MemoVO(String name, String password, String memo) {
		super();
		idx = ++count;
		this.name = name;
		this.password = password;
		this.memo = memo;
		this.writeDate = new Date();
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
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E) HH:mm:ss");
		
//		idx - 날짜 / 시간 - 이름 - 메모
		return String.format("%2d. %s %s %s", idx, sdf.format(writeDate), name, memo);
//		return "번호 - " + idx + ", 작성날짜 - " + sdf.format(writeDate) + ", 이름 - " + name + ", 내용 - " + memo;
//		return "MemoVO [idx=" + idx + ", name=" + name + ", password=" + password + ", memo=" + memo +", writeDate=" + writeDate
//				+ "]";
	}
	
	
	
}
