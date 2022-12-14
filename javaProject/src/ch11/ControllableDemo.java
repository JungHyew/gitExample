package ch11;

public class ControllableDemo {

	public static void main(String[] args) {
		TV tv=new TV();
		tv.turnOn();
		tv.turnOff();
		tv.remoteOn();
		tv.remoteOff();
		tv.repair();
//		tv.reset(); //static이라 오류뜬다
		Controllable.reset(); //static 멤버일때는 클래스이름.메소드로 접근해야함
		
		Computer com=new Computer();
		com.turnOn();
		com.turnOff();
		com.repair();
		Controllable.reset();

	}

}
