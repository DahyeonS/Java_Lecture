package com.tjoeun.memo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

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
//		return "MemoList [memoList=" + memoList + "]";
		String str = "";
		if (memoList.size() == 0) { // memoList에 저장된 글이 없는가?
//			저장된 메모가 없으면 메모가 없다는 메시지를 출력한다.
			str += "저장된 메모가 없습니다.\n";
		} else {
//			저장된 메모가 있으면 마지막에 입력한 글(최신글)부터 출력한다.
//			for (int i=0; i<memoList.size(); i++) { // 처음부터 마지막까지
			for (int i=memoList.size()-1; i>=0; i--) {
				str += memoList.get(i) + "\n";
			}
		}
		return str;
	}
	
//	MemoMain 클래스에서 호출되는 memoList라는 ArrayList에 저장할 데이터가 저장된
//	MemoVO 클래스 객체를 넘겨받아 memoList라는 ArrayList에 저장하는 메소드
	public void addMemo(MemoVO vo) {
		memoList.add(vo);
	}
	
//	MemoMain 클래스에서 수정 또는 삭제할 글 번호를 넘겨받고 memoList라는 ArrayList에
//	저장된 메모 중에서 수정 또는 삭제할 글 번호에 해당되는 글 1건을 얻어와서 리턴하는 메소드
	public MemoVO selectMemo(int idx) {
		try {
			return memoList.get(idx - 1);
			
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
		
	}

//	MemoMain 클래스에서 호출되는 수정할 글 번호와 메모를 넘겨받고 memoList라는
//	ArrayList에 저장된 메모 1건을 수정하는 메소드
	public void updateMemo(int idx, String memo) {
		memoList.get(idx - 1).setMemo(memo);
	}

//	MemoMain 클래스에서 호출되는 삭제할 글 번호를 넘겨받고 memoList라는 ArrayList에
//	저장된 메모 1건을 삭제하는 메소드
	public void deleteMemo(int idx) {
		memoList.remove(idx - 1);
//		메모 삭제 후 인덱스가 변경되므로 인덱스에 맞춰서 글 번호를 다시 붙여준다.
//		이 현상은 DB를 사용하지 않고 ArrayList를 이용하기 때문에 발생되는 현상이다.
//		ArrayList는 앞의 데이터가 지워지면 뒤의 데이터가 앞으로 인덱스가 당겨지는 특징
//		이 있다.
		
//		메모 삭제 후 글 번호를 다시 붙여준다.
		for (int i=0; i<memoList.size(); i++) {
			memoList.get(i).setIdx(idx + 1);
		}
//		글이 삭제된 후 세 글이 입력될 때 idx가 기존 idx 값에 이어서 1씩 증가할 수
//		있도록 count의 값을 수정한다.
		MemoVO.count = memoList.size();
	}
	
//	MemoMain 클래스에서 호출하는 텍스트 파일의 이름을 넘겨받아 memoList ArrayList에 저장된
//	데이터를 텍스트 파일로 출력하는 메소드
	public void writeMemo(String fileName) {
		PrintWriter printWriter = null;

//		텍스트 파일의 경로와 이름을 연결한다.
//		String filepath = "./src/com/tjoeun/memo/" + fileName + ".txt";
		String filepath = String.format("./src/com/tjoeun/memo/%s.txt", fileName);
//		System.out.println(filePath);

		try {
			printWriter = new PrintWriter(filepath);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E) HH:mm:ss");

//		memoList라는 ArrayList에 저장된 데이터의 개수만큼 반복하여 텍스트 파일로 출력한다.
//		memoList에 저장된 데이터를 공백으로 구분해서 1줄로 연결해서 출력한다.
			/*
			 * for (int i=0; i<memoList.size(); i++) { //
			 * System.out.println(memoList.get(i)); MemoVO vo = memoList.get(i); String str
			 * = ""; str += vo.getIdx() + " "; str += sdf.format(vo.getwriteDate()) + " ";
			 * str += vo.getName() + " "; str += vo.getPassword() + " "; str +=
			 * vo.getMemo(); System.out.println(str); printWriter.write(str + "\r\n");
			 * System.out.println("저장 완료!");
			 * 
			 * }
			 */

//			향상된 for
			for (MemoVO vo : memoList) {
//				str += vo.getIdx() + " ";
//				str += sdf.format(vo.getwriteDate()) + " ";
//				str += vo.getName() + " ";
//				str += vo.getPassword() + " ";
//				str += vo.getMemo();
				String str = String.format("%d %s %s %s %s", vo.getIdx(), vo.getwriteDate(), vo.getName(),
						vo.getPassword(), vo.getMemo());
				printWriter.write(str + "\r\n");
			}
			System.out.println(fileName + ".txt 파일에 쓰기 완료!");

		} catch (FileNotFoundException e) {
			System.out.println("파일 또는 경로 이름이 올바르지 않습니다.");
		} finally {
			if (printWriter != null) {
				printWriter.close();
			}
		}

	}

	
// ====readMemo 현재 오류====
	
//	MemoMain 클래스에서 호출되는 텍스트 파일의 이름을 넘겨받아 텍스트 파일의 데이터를 읽어
//	memoList ArrayList에 저장되는 메소드
	public void readMemo(String fileName) {
		Scanner scanner = null;

		try {
			String filepath = String.format("./src/com/tjoeun/memo/%s.txt", fileName);
			scanner = new Scanner(new File(filepath));
//			텍스트 파일에 저장된 데이터를 마지막 줄까지 읽어서 memoList ArrayList에 저장ㅎ산다.
			while (scanner.hasNextLine()) {
//				텍스트 파일의 데이터 1줄을 읽는다.
				String str = scanner.nextLine().trim();
				System.out.println(str);

//				읽어들일 데이터 1줄을 공백을 경계로 읽어서 각각의 변수에 저장한다.
				Scanner scan = new Scanner(str);
				int idx = scan.nextInt();
				String temp = scan.next().trim();
				String name = scan.next();
				String password = scan.next();
				String memo = scan.next();

				String[] date = temp.split("-");
				int year = Integer.parseInt(date[0]) - 1900;
				int month = Integer.parseInt(date[1]) - 1;
				int day = Integer.parseInt(date[2]);

				Date writeDate = new Date(year, month, day);

				MemoVO vo = new MemoVO(idx, name, password, memo, writeDate);

//				MemoVo 클래스 객체에 저장된 데이터를 memoList ArrayList에 저장한다.
				memoList.add(vo);
			}
		} catch (Exception E) {
			System.out.println(fileName + ".txt 파일이 디스크에 존재하지 않습니다.");
		}
		

	}

}
