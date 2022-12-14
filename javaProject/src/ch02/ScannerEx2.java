package ch02;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		String name = scan.next(); //문자열은 String으로, next : 문자열을 입력받을 수 있는 메소드(함수)
		System.out.println("나이를 입력하세요 : ");
		short age = scan.nextShort();
		System.out.println("소지한 현금의 금액을 입력하세요 : ");
		int money = scan.nextInt();
		System.out.println("집에서 직장까지의 거리를 m단위로 입력하세요 : ");
		long distance = scan.nextLong();
		System.out.println("신장(키)를 입력하세요 : ");
		float height = scan.nextFloat();
		System.out.println("몸무게를 입력하세요 : ");
		double weight = scan.nextDouble();
		System.out.println("===========================");
		System.out.println("당신의 이름은 " + name + "입니다.");
		System.out.println("당신의 나이는 " + age + "입니다.");
		System.out.println("당신의 현재 cash는 " + money + "입니다.");
		System.out.println("당신의 출근거리는 " + distance + "m 입니다.");
		System.out.println("당신의 신장은 " + height + "입니다.");
		System.out.println("당신의 몸무게는 " + weight + "입니다.");
		
		scan.close(); //스캔객체를 종료(메모리상에서 종료)
		
	}

}
