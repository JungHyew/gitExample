package ch09;

public class Area { //자식클래스는 Volume / 메인은 VolumeUse
	//멤버변수(전역변수) //전역변수는 따로 초기화 할 필요없이 자동으로 0으로 초기화된다
	private int width; //int는 기본적으로 0으로 초기화된다 //width=30
	private int length; //length=20
	//생성자
	public Area() {	} //기본생성자
	public Area(int width, int length) { //매개변수가 2개인 생성자
		this.width = width;
		this.length = length;
	}
	//getter, setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	//일반메소드
	public int getArea() {
		return width*length;
	}
	
	

}
