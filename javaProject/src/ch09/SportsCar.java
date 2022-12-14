package ch09;

public class SportsCar extends Car { //자식클래스(상속관계)
	boolean turbo;
	public void setTurbo(boolean flag) {
		turbo=flag;
		System.out.println(turbo);
	}

}
