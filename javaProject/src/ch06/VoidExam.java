package ch06;

public class VoidExam { //순서를 어떻게 하던 상관없다(메인 메소드가 밑에 있어도 괜찮다)
	public static void hello() { //void는 리턴값이 없음을 의미
		System.out.println("안녕하세요?");
		return; //명시적으로 메소드를 종료한다 라는 의미, 생략가능
	}

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		hello();
		System.out.println("프로그램 끝");
	}


}
