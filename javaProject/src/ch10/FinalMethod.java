package ch10;

final class A2{
//final class A2{ //final로 지정한 class는 상속이 안된다
	void print() {
//	final void print() { //final로 지정한 메소드는 오버라이딩이 안된다
		System.out.println("a");
	}
}

class B2 extends A2 { //부모클래스인 A2에 있는 값 가져올 수 있다(오버라이드)
	@Override
	void print() {
//		super.print(); //부모메소드 호출
		System.out.println("b");
	}
}

public class FinalMethod {
	public static void main(String[] args) {
		B2 b=new B2();
		b.print(); //자식이 우선이므로 자식이 먼저 실행된다
	}
	

}
