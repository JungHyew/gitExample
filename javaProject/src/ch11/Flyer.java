package ch11;

public interface Flyer { //인터페이스는 반드시 추상메소드, 상수로만 써야한다(구성되어야한다)
	public void takeOff(); //구현부(중괄호)가 없다 => 추상메소드
	public void fly();
	public void land();
}
