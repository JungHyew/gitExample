package ch07;

public class Car {
	//멤버변수
	String color; //색상
	int speed; //속도 //멤버변수는 기본적으로 int는 0으로 초기화
	int gear; //기어
	
	//마우스 오른쪽 버튼 -> Source -> Generate toString()...
	@Override
	public String toString() { //개발자용 코드
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	void changeGear(int g) {
		gear=g;
	}
	void speedUp() {
		speed=speed+10;
	}
	void speedDown() {
		speed=speed-10;
	}

}
