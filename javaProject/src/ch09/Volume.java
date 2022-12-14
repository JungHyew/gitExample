package ch09;

public class Volume extends Area{
	//멤버변수
	private int height; //멤버변수에서 int는 자동적으로 0으로 초기화됨 //height=10
	public Volume() {	} //기본생성자
	public Volume(int height,int length,int width) { //부모에 있는 length, width 변수 가져다 쓸 수 있다
		//height=10, length=20, width=30
		super(width, length); //부모클래스의 생성자 호출 //width=30, length=20
		this.height = height; //height=10
	}
	public int getVolume() {
		return getArea()*height; //600*10
	}


}
