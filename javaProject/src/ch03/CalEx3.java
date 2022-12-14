package ch03;

import java.util.Scanner;

public class CalEx3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수a를 입력하세요 : ");
		int a = in.nextInt();
		System.out.print("정수b를 입력하세요 :");
		int b = in.nextInt();
		in.close();
		
		System.out.printf("a+b=%d\n", a+b);
		System.out.printf("a-b=%d\n", a-b);
		System.out.printf("a*b=%d\n", a*b);
		System.out.printf("a/b=%.2f\n", (double)a/b); //소수점 둘째자리까지 표현해라
        //.2f가 아닌 d로 작성하면 에러뜬다 => d가 정수인데 double은 실수이기 때문에
		System.out.printf("a%%b=%d\n", a%b);

	}

}
