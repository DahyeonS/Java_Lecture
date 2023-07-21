package com.tjoeun.memo;

import java.util.Date;
import java.util.Scanner;

public class MemoMain {

	private static MemoList memoList = new MemoList();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int menu = 0;

		while (menu != 7) {
			while (true) {
				System.out.println("==================================================================================");
				System.out.println("1.입력 | 2.목록보기 | 3.수정 | 4.삭제 "
				+ "| 5.파일로 저장 | 6.파일에서 읽기 | 7.종료");
				System.out.println("==================================================================================");
				System.out.print("원하는 메뉴를 선택하세요. > ");
				menu = scanner.nextInt();
				if (menu >= 1 && menu <= 7) {
					break;
				}
				System.out.println("메뉴는 1 ~ 7 사이로 입력해야 합니다.");
			}

//		여기까지 왔다면	menu에는 1 ~ 7 사이의 정수가 입력되었다는 의미다.
		switch (menu) {
		case 1:
			insert();
			break;
		case 2:
			System.out.println(memoList);
			break;
		case 3:
			update();
			break;
		case 4:
			delete();
			break;
		case 5:
			fileWrite();
			break;
		case 6:
			System.out.println("파일에서 읽기");
			break;
			}
		}
	System.out.println("프로그램을 종료하겠습니다.");

	}
	
//	키보드로 텍스트 파일 이름을 입력받아 MemoList 클래스의 memoList ArrayList에 저장된 데이터를
//	텍스트 파일로 출력하는 메소드를 실행하는 메소드
	private static void fileWrite() {
		Scanner scanner = new Scanner(System.in);
//		텍스트 파일 이름을 입력받는다.
		System.out.print("저장할 텍스트 파일 이름 입력 >> ");
		String fileName = scanner.nextLine().trim();
		
//		MemoList 클래스의 memoList ArrayList에 저장된 데이터를 텍스트 파일로 출력하는 메소드를
//		호출한다.
		memoList.writeMemo(fileName);
	}

	//	키보드로 삭제할 글 번호를 입력받아 삭제할 글 1건을 얻어와 화면에 표시하고 비밀번호를
//	입력받아 memoList라는 ArrayList에 저장된 글 1건을 삭제한다.
	private static void delete() {
		Scanner scanner = new Scanner(System.in);
		
//		키보드로 삭제할 글의 글 번호를 입력받는다.
		System.out.print("삭제할 글 번호 입력 > ");
		int idx = scanner.nextInt();
		
//		MemoList라는 ArrayList에 저장된 글 1건을 얻어오는 메소드를 실행하고
//		얻어온 결과를 MemoVO 클래스 객체에 저장한다.
		MemoVO origin = memoList.selectMemo(idx);
		
//		삭제할 글 번호에 해당되는 글이 존재하면 글을 삭제하고 존재하지 않으면 글이
//		존재하지 않는다는 메시지를 출력한다.
		if (origin == null) {
			System.out.println(idx + "번 글이 존재하지 않습니다.");
			
		} else {
			System.out.println("삭제할 글 확인");
			System.out.println(origin);
			
//			삭제할 글의 비밀번호를 입력받는다.
			System.out.print("삭제할 글 비밀번호 입력 > ");
			scanner.nextLine();
			String password = scanner.nextLine().trim();
//			삭제하기 위해 입력한 비밀번호(password)와
//			삭제할 글의 비밀번호(origin.getPassword()) 를 비교한다.
			if (password.equals(origin.getPassword())) {
				
//				비밀번호가 일치하므로 memoList라는 ArrayList에 저장된
//				메모를 삭제하는 메소드를 실행한다.
				memoList.deleteMemo(idx);
				System.out.println(idx + "번 글이 삭제되었습니다.");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}
		
	}

	private static void update() {
//		수정할 글 번호를 입력받아서 해당 글 번호의 내용을 얻어온다.
//		해당 글 번호의 내용이 없으면 존재하지 않는 메모이고, 해당 글 번호가 있으면 수정한다.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("수정할 글 번호 입력 > ");
		int idx = scanner.nextInt();
		
//		memoList라는 ArrayList에 저장된 글 1건을 얻어오는 메소드를 실행하고
//		얻어온 결과를 MemoVO 클래스 객체에 저장한다.
		MemoVO origin = memoList.selectMemo(idx);
//		System.out.println(origin);
		
//		수정할 글 번호에 해당하는 글이 있으면 수정하고 존재하지 않으면 존재하지 않는다는
//		메시지 출력
		if (origin == null) {
			System.out.println(idx + "번 글이 존재하지 않습니다.");
		} else {
			System.out.println("수정할 글 확인");
			System.out.println(origin);
//			비밀번호를 입력받아서 origin의 비밀번호와 비교하고, 같으면 메모를 수정한다.
			System.out.print("수정할 글의 비밀번호 입력 > ");
			scanner.nextLine();
			String password = scanner.nextLine().trim();
			if (password.equals(origin.getPassword())) {
//				비밀번호가 일치하므로 수정할 메모를 입력받는다.
				System.out.print("수정할 메모 입력 > ");
				String memo = scanner.nextLine().trim();
				
//				메모를 수정할 메소드를 호출한다.
				memoList.updateMemo(idx, memo);
				System.out.println(idx + "번 글이 수정되었습니다.");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
			
		}
	}
	
	
//	키보드로 이름, 비밀번호, 메모를 입력받아 MemoVO 클래스 객체에 저장하고 ArrayList에
//	저장하는 메소드를 호출하는 메소드
	private static void insert() {
		Scanner scanner = new Scanner(System.in);

//		키보드로 이름, 비밀번호, 메모를 입력받는다.
		System.out.println("저장할 메모 입력");
		System.out.print("이름: ");
		String name = scanner.nextLine();
		System.out.print("비밀번호: ");
		String password = scanner.nextLine();
		System.out.print("메모: ");
		String memo = scanner.nextLine();
//		Date writedate = new Date();

//		MemoVO vo = new MemoVO(name, password, memo, writedate);
		MemoVO vo = new MemoVO(name, password, memo);
//		System.out.println(vo);

//		MemoVO 클래스 객체를 MemoList 클래스의 ArrayList에 저장하는 메소드를 실행한다.
//		MemoList memoList = new MemoList();
//		=> insert() 메소드가 종료되면 메모리에서 소멸된다.
		memoList.addMemo(vo);
		System.out.println("추가 완료!!");

	}

}
