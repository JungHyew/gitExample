package ch12;

import ch09.ShapeMain;

public class InnerExam2 {
	static class Cal{ //내부 static 클래스
		int value=0;
		public void plus() {
			value++;
		}
	}
	
	public static void main(String[] args) {
		//내부 static 클래스를 접근할때는
		//외부클래스이름.내부클래스이름 참조변수=new 외부클래스이름.내부클래스이름
		InnerExam2.Cal cal=new InnerExam2.Cal();
		cal.plus();
		System.out.println(cal.value);
	}

}
