package ch11;

public class Rectangle extends Shape {

	@Override
	public void draw() { //추상 메소드 구현함(중괄호만 있으면 구현한것)
		System.out.println("사각형 그리기 시작 x 좌표값 : "+x);
		System.out.println("사각형 그리기 시작 y 좌표값 : "+y);
		
	}
	

}
