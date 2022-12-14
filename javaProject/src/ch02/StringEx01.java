package ch02;

public class StringEx01 {

	public static void main(String[] args) {
		//String은 문자열을 다루는 데이터 타입이다. 참고로 단문자는 char라는 데이터 타입을 쓴다.
		String name = "홍길동"; //문자열은 큰따옴표를 사용(" ")
		char a = 'b'; //char는 단문자를 다룸, 작은따옴표를 사용(' ')
		
		System.out.println("당신의 이름은 " + name + "입니다.");
		System.out.println("단문자 : " + a);
	}

}
