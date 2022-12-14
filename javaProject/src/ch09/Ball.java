package ch09;

public class Ball extends Circle{
	private String color; //Ball 클래스의 멤버
	public Ball(String color) { //매개변수가 있는 생성자 
		//매개변수가 있는 생성자부터 만들면 기본생성자 더이상 만들지 않는다
		this.color=color;
	}
	public Ball() { //그래서 따로 만들어 줘야 된다
		
	}
	public void findColor() { //Ball 클래스의 멤버
		System.out.println(color+" 공이다.");
	}
	public void findVolume() { //Ball 클래스의 멤버
		System.out.println("부피구하기");
	}
}
