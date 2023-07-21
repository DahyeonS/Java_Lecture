package com.tjoeun.inheritance;
public class InheritanceTest {
	public static void main(String[] args) {
		
		ParentTest parentTest = new ParentTest();
		System.out.println(parentTest);
		ParentTest parent = new ParentTest("고길동", true);
		System.out.println(parent);
		System.out.println("================");
		
		ChildTest child = new ChildTest();
		System.out.println(child);
		ChildTest child2 = new ChildTest("영희", false, 10, "철수동생");
		System.out.println(child2);
	}

}
