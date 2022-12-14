package ch06;
//오버로딩
public class OverloadEx1 {
	public static void main(String[] args) {
		print(10.5);
		print("hello");
		print(100);
		print("Hi","Java");
	}

	static void print(double a) { //실수형 10.5
		System.out.println(a);
	}
	
	static void print(String b) { //문자형 "hello"
		System.out.println(b);
	}
	
	static void print(int c) { //정수형 100
		System.out.println(c);
	}
//	static void String print(int i) { //리턴타입과 오버로딩은 무관하다
//		System.out.println(c);
//	}
	
	static void print(String a, String c) { //문자형 2개 "Hi","Java"
		//매개변수의 개수가 다르거나 데이터 타입이 다르면 오버로딩 가능하다
		System.out.println(a);
		System.out.println(c);
	}



}
