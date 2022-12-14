package ch04;

public class Do_While_Char {

	public static void main(String[] args) {
		char c='a';
		do {
			System.out.print(c);
			c=(char)(c+1); //c가 char형이므로 강제형 변환
			//영문인 경우 1을 더하면 다음문자의 코드 값이 나온다
		}while(c<='z');

	}

}
