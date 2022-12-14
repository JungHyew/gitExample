package ch12;

import ch09.ShapeMain;

abstract class Action{ //추상클래스
	public abstract void exec(); //추상메소드
}

public class ActionExam extends Action {

	@Override
	public void exec() {
		System.out.println("I am child");
	}
	
	public static void main(String[] args) {
		Action a=new ActionExam() { //익명내부 클래스(클래스 이름 없이 중괄호 쓰여진것 ?)
			String name="Kim";
			@Override
			public void exec() {
				System.out.println("나는 "+name+"이다.");
			}
			//익명내부 클래스 : 클래스 이름 없이 코드 블럭이 생성된것
		}; //주의점 : 익명내부클래스의 마지막 중괄호 다음에는 세미콜론(;)이 명시되어야 한다
		a.exec();
	}

}
