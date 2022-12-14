package ch11;

public class Notebook implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("노트북을 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("노트북을 끈다.");
	}
	
	public static void main(String[] args) {
		Controllable n=new Notebook();
		n.turnOn();
		n.turnOff();
		n.repair();
		Controllable.reset();
	}

}
