package com.tjoeun.inheritance;

// 자식(하위, 서브, 파생) 클래스
// ChildTest 클래스는 ParentTest 클래스를 상속받아 만든다.
// 상속이란 부모 클래스에서 정의한 모든 필드와 메소드를 자식 클래스가 물려받는 것을 말한다.
// public class 자식클래스이름 extends 부모클래스이름 
public class ChildTest extends ParentTest {
//	ChildTest 클래스는 ParentTest 클래스의 모든 필드와 메소드를 사용할 수 있다.
//	ChildTest 클래스에서 필요한 기능을 정의한다.
	
	private int age;
	private String nickName;
	
	public ChildTest() {
//		this는 현재 클래스를 의미하고 뒤에 ()가 나오면 현재 클래스의 생성자를 의미한다.
//		super는 부모 클래스를 의미하고 뒤에 ()가 나오면 부모 클래스의 생성자를 의미한다.
//		super()는 코딩하지 않더라도 자바 컴파일러가 자동으로 만들어준다.
//		this()와 super()는 반드시 생성자의 첫 문장으로 써야한다. => 가장 먼저 실행된다.
//		부모 클래스의 생성자가 자식 클래스의 생성자보다 먼저 실행된다.
//		부모 클래스의 기본 생성자를 정의하지 않으면 자식 클래스에서 super()를 실행할 때 에러가
//		발생된다.
//		super();
		System.out.println("자식 클래스의 생성자 실행");
	}
	
}
