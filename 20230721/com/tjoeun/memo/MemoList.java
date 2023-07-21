package com.tjoeun.memo;

import java.util.ArrayList;

public class MemoList {
	
	private ArrayList<MemoVO> memoList = new ArrayList<MemoVO>();

	public ArrayList<MemoVO> getMemoList() {
		return memoList;
	}

	public void setMemoList(ArrayList<MemoVO> memoList) {
		this.memoList = memoList;
	}

	@Override
	public String toString() {
		return "MemoList [memoList=" + memoList + "]";
	}
	
//	MemoMain 클래스에서 호출되는 memoList라는 ArrayList에 저장할 데이터가 저장된
//	MemoVO 클래스 객체를 넘겨받아 memoList라는 ArrayList에 저장하는 메소드
	public void addMemo(MemoVO vo) {
		memoList.add(vo);
	}

}
