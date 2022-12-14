package ch09;

public class Shape { //extends Object {
	//멤버변수
	private String name;

	public Shape() {
		super(); //Object 클래스의 기본생성자 호출
	}

	public Shape(String name) { //name="Circle"
		super(); //무시해도됨
		this.name = name;
	}

	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//일반메소드
	public double calculateArea() {
		return 0;
	}
	public void draw() {
		System.out.println("도형을 그립니다.");
	}
}
