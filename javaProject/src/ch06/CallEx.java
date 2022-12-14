package ch06;

public class CallEx {

	public static void main(String[] args) {
		System.out.println("시작");
		int a=10;
		test(a); //메소드 호출
		test2(a);
		System.out.println("끝");

	} //프로그램끝
	
	public static void test(int b) { //b=10 //a를 쓰던 b를 쓰던 상관없다(아무거나 작성해도 된다)
		System.out.println("test method 호출");
		System.out.println(b);
		
	}

	public static void test2(int a) { //a=10
		System.out.println(a);
		
	}


}
