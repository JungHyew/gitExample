package ch11;

public class FlyUse {

	public static void main(String[] args) {
		System.out.println("=====일반적기법=====");
		
		Bird bird=new Bird();
		bird.takeOff();
		bird.fly();
		bird.land();
		
		Airplane air=new Airplane();
		air.takeOff();
		air.fly();
		air.land();
		
		System.out.println("=====다형성기법=====");
		
		//실무에서는
		Flyer f=new Bird(); //좌변은 부모, 우변은 자식 => 다형성기법
		f.takeOff();
		f.fly();
		f.land();
		
		f=new Airplane();
		f.takeOff();
		f.fly();
		f.land();

	}

}
