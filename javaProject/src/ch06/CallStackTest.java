package ch06;

public class CallStackTest {

	public static void main(String[] args) {
		firstMethod();
	} //프로그램끝 //위치에 상관없이 메인 메소드에서 끝난다

	private static void firstMethod() {
		secondMethod(); //다른 메소드 호출
	}


	private static void secondMethod() {
		System.out.println("secondMethod()");
		
	}
}
