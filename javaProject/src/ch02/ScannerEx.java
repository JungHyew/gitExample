package ch02;

import java.util.Scanner;
//java.lang 패키지는 기본패키지로서 import를 안해도 되지만 그 외의 패키지는 import라는 것을 해야한다.

public class ScannerEx {

	public static void main(String[] args) {
		//Ctrl + Shift + O : 자동 import를 해주는 hot key
		Scanner in = new Scanner(System.in);
		System.out.println("첫번째 정수값을 입력하세요 : "); //안내문구
		int x = in.nextInt();
		System.out.println("두번째 정수값을 입력하세요 : "); //반드시 안내문구가 먼저 나올수 있게 한다.
		int y = in.nextInt(); //정수값을 키보드로부터 받아 처리하는 메소드
		System.out.printf("%d * %d은 %d입니다.\n", x, y, x*y); //포맷 형식 정할수 있다.
		//%d는 정수가 들어갈 자리(첫번째 %d에는 x가 두번째는 y가 세번째는 x*y가 들어갈 자리이다.
		//x와 y는 결과에서 지정할 수 있다.
		//\n는 줄바꿈
		in.close(); //in을 사용하면 close를 해줘야 된다.
	}

}
