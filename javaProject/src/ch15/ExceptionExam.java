package ch15;

public class ExceptionExam {
	public static void main(String[] args) {
		int a=10, b=0, c;
		try {
			c=a/b;
			System.out.println(c);
		} catch(ArithmeticException e) { //잘 모를땐 Exception만 해도 된다
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace(); //예외가 발생한 상태의 스택 정보 출력(개발자 디버깅용 메소드)
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
