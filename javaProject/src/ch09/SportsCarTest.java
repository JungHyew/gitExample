package ch09;

public class SportsCarTest {

	public static void main(String[] args) {
		SportsCar obj=new SportsCar(); //자식클래스만 메모리에 올림(인스턴스화)
		obj.speed=10; //speed는 Car라는 부모클래스의 멤버변수
		//SportsCar객체는 Car객체를 상속받았기 때문에 부모격인 Car객체의 멤버들(멤버변수,멤버메소드)를
		//모두 사용할 수 있다 //단, 클래스는 상속이 되지 않는다
		//부모꺼는 내꺼
		obj.setSpeed(60); //setSpeed는 Car라는 부모클래스의 멤버메소드
		obj.setTurbo(true);

	}

}
