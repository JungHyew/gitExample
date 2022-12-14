package ch11;

public class Airplane implements Flyer { //다중상속

	@Override
	//추상메소드 구현
	public void takeOff() {
		System.out.println("Airplane 이륙");

	}

	@Override
	public void fly() {
		System.out.println("Airplane 비행");

	}

	@Override
	public void land() {
		System.out.println("Airplane 착륙");

	}

}
