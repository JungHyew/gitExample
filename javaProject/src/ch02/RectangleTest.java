package ch02;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("직사각형의 가로 길이를 입력하세요 : ");
	    int h = in.nextInt();
		System.out.println("직사각형의 세로 길이를 입력하세요 : ");
		int v = in.nextInt();
		double w = h * v;
		System.out.printf("직사각형의 넓이는 " + w + " 입니다.");
		in.close();

	}

}
