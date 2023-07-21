package com.tjoeun.memo;

import java.util.Date;
import java.util.Scanner;

public class MemoMain {

	private static MemoList memoList = new MemoList();

	public static void main(String[] args) {

//		메모 입력을 하기 위한 메모 만들기
//		입력 / 목록보기 / 수정 / 삭제 / 종료

//		MemoVO memo1 = new MemoVO("고길동", "1111", "1등");
//		System.out.println(memo1);
//		MemoVO memo2 = new MemoVO("고길", "2222", "2등");
//		System.out.println(memo1);

		Scanner scanner = new Scanner(System.in);
		int menu = 0;

		while (menu != 5) {
			while (true) {
				System.out.println("==============================================");
				System.out.println("1.입력 | 2.목록보기 | 3.수정 | 4.삭제 | 5.종료");
				System.out.println("==============================================");
				System.out.print("원하는 메뉴를 선택하세요. > ");
				menu = scanner.nextInt();
				if (menu >= 1 && menu <= 5) {
					break;
				}
				System.out.println("메뉴는 1 ~ 5 사이로 입력해야 합니다.");
			}

//		여기까지 왔다면	menu에는 1 ~ 5 사이의 정수가 입력되었다는 의미다.
		switch (menu) {
		case 1:
			insert();
			break;
		case 2:
			System.out.println(memoList);
			break;
		case 3:
			System.out.println("update");
			break;
		case 4:
			System.out.println("delete");
			break;
			}
	}
	System.out.println("프로그램을 종료하겠습니다.");

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
