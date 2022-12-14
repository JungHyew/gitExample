package ch09;

public class RectangleShape extends Shape {
	private int width;
	private int height;
	//getter, setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	//매개변수 생성자
	public RectangleShape(int width, int height) {
		super("Rectangle");
		this.width = width;
		this.height = height;
	}
	//부모클래스의 멤버메소드 오버라이딩
	@Override
	public double calculateArea() {
		return width*(double)height;
	}
	
	@Override
	public void draw() {
		System.out.print("가로가 "+width+", 세로가 "+height+"인 사각형 ");
		super.draw();
	}

}
