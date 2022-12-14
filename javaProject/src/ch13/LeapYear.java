package ch13;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("연도를 입력하세요 : ");
		int year=scan.nextInt();
		GregorianCalendar cal=new GregorianCalendar();
//		if(cal.isLeapYear(year)) { //윤년계산 메소드 : isLeapYear
//			System.out.println("윤년입니다.");
	    //윤년공식(year를 4로 나눈 나머지가 0이고 100으로 나눈 나머지가 0이 아니거나 400으로 나눈 나머지가 0)
		if((year%4 == 0 && year%100 != 0 || year%400 == 0)) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("평년입니다.");
		}
	}

}
