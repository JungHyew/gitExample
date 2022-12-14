package ch02;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = in.nextInt();
		System.out.println(num % 2 == 0 ? "짝수" : "홀수"); // 3항 연산자
		//3항 연산자 : 항이 3개(1항(조건식) ? 2항(true값) : 3항(false값))
		//num % 2 : 2로 나눈값의 나머지
		//num % 2 == 0 : 즉, 2로 나눴을때 0으로 떨어지면 true로 2항(짝수), 아니면 false로 3항(홀수) 출력된다.

	}

}
