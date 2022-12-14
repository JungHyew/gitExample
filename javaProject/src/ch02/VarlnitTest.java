package ch02;

public class VarlnitTest {
	//ma + Ctrl + Space => main함수 자동 생성
		public static void main(String[ ] args) {
			int index = 2; // 지역변수 선언
			//지역변수는 값이 초기화가 되어야 된다.(index에 값이 할당되지 않으면 오류가 뜬다.)
			
			index = index + 1; // index에 값이 할당되지 않으면 오류가 뜬다.
			System.out.println("index : " + index);

	}

}
