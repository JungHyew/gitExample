package ch09;

class Animal { //부모클래스
	public Animal(String s) { //생성자는 특별한 메소드라고 생각
		System.out.println("동물 : "+s);
	}
}

class Mammal extends Animal{ //부모클래스는 super클래스이다
	public Mammal() { //기본생성자
		super("원숭이"); //부모 클래스 생성자 호출 //s=원숭이
		System.out.println("포유류 : 원숭이");
	}
	
	public Mammal(String s) {
		super(s); //부모 클래스 생성자 호출
		System.out.println("포유류 : "+s);
	}
}

public class AnimalDemo {

	public static void main(String[] args) {
		Mammal ape=new Mammal(); //객체생성 겸 기본생성자 호출
		Mammal lion=new Mammal("사자"); //객체생성 겸 매개변수가 있는 생성자 호출

	}

}
