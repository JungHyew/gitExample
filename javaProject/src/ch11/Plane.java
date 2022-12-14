package ch11;

public class Plane implements Vehicle {

	@Override
	public void speedUp() {
		System.out.println("Plane SpeedUp");
	}

	@Override
	public void speedDown() {
		System.out.println("Plane SpeedDown");
	}

	@Override
	public void handle() {
		System.out.println("Plane Handling");
	}
	
	public static void main(String[] args) {
		Vehicle p=new Plane();
		p.speedUp();
		p.speedDown();
		p.handle();
	}

}
