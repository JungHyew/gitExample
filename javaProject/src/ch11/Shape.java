package ch11;

public abstract class Shape {
	int x,y;
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public abstract void draw(); //abstract메소드는 바디{}가 없는 추상 메소드

}
