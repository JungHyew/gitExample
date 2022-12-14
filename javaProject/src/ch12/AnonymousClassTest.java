package ch12;

interface RemoteControl{
	//추상메소드
	void turnOn();
	void turnOff();
}

public class AnonymousClassTest {
	public static void main(String[] args) {
		RemoteControl ac=new RemoteControl() {
			//추상클래스나 interface는 new로 객체생성을 못한다
			//하지만 무명클래스 처리하면 자동적으로 interface인 RemoteControl을 무명클래스가 상속받아서
			//오버라이딩 처리를 한다(할 수 있다)
			@Override
			public void turnOn() {
				System.out.println("TV turnOn()");
			}

			@Override
			public void turnOff() {
				System.out.println("TV turoff()");
			}
			
		}; //무명내부클래스(중괄호 뒤에 세미콜론 붙음)
		ac.turnOn();
		ac.turnOff();
	}

}
