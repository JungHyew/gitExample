package ch05;

import java.util.Scanner;

public class EqualsEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {//무한반복
			System.out.println("문자열을 입력해주세요 : ");
			String str=sc.nextLine(); //문자열을 입력받게 하는 함수중 하나
			if(str.equals("exit")) { //문자열참조변수.equals("비교하고자 하는 문자") //exit를 입력하면 프로그램 종료
				//참고 : 값을 비교할때는 "a==b"
				break;
			}else {
				System.out.println(str.length()+"글자 입니다.");
				//length():문자열에 대한 글자 수 변환하는 메소드(배열의 길이값)
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
