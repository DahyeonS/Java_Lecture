package com.tjoeun.bookshop;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class BookList {
//	도서정보를 기억할 ArrayList를 만든다.
	ArrayList<BookVO> bookList = new ArrayList<BookVO>();
	
//	생성자를 선언하지 않으면 자버 컴파일러가 아무런 일도 하지 않는 기본 생성자를 만들어준다.
	public BookList() {
		
	}

	public ArrayList<BookVO> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<BookVO> bookList) {
		this.bookList = bookList;
	}
	
	@Override
	public String toString() {
		String str = "";
		str += "==================================================\n";
		str += "  도서명  |  저자  |  출판사  |  출판일  |  가격  \n";
		str += "==================================================\n";
		
		int total = 0; // 저장된 도서의 가격 합계
		DecimalFormat df = new DecimalFormat("#,##0원");
//		일반 for
//		for (int i=0; i<bookList.size(); i++) {
//			str += bookList.get(i) + "\n";
//			total += bookList.get(i).getPrice();
//		}
		
//		향상된 for
		for (BookVO vo : bookList) {
			str += vo + "\n";
			total += vo.getPrice();
		}
		str += "==================================================\n";
		str += "합계 금액: " + df.format(total) + "\n";
		
		return str;
	}

	//	BookList 클래스의 BookList ArrayList에 매개변수로 념겨받은
//	도서정보를 저장하는 메소드
	public void addBook(BookVO book) {
		bookList.add(book);
	}
	
	

}
