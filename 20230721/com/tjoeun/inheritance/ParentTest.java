package com.tjoeun.inheritance;

// 부모(상위, 슈퍼, 기반) 클래스
public class ParentTest {
	
//	private String name;
//	private boolean gender;
	
	protected String name;
	protected boolean gender;	
	
//	기본생성자가 실행되면 name은 "기타", gender는 false로 초기화한다.
	public ParentTest() {
//		name = "기타";
//		gender = false;
		
//		현재 클래스의 다른 생성자인 ParentTest(String name, boolean gender)를 호출해 초기화
		this("기타", false);
		System.out.println("부모 클래스의 생성자 실행");
	}

//	name, gender를 인수로 넘겨받는 생성자가 실행되면 넘겨받은 데이터로 초기화시킨다.
	public ParentTest(String name, boolean gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
//	홍길동(남)
	public String toString() {
		return "ParentTest [name=" + name + ", gender=" + gender + "]";
	}
	
	
}
