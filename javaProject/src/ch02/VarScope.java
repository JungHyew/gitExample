package ch02;

public class VarScope {
	static int x; // x는 전역변수

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int y = 0; // 지역변수이므로 초기화 시켜줘야된다.
		
		System.out.println("x = " + x);
		// 안의 + 기호는 연결연사나로서 문자열과 변수등을 연결하는 역할을 한다.
		System.out.println("y = " + y);

	}

}
