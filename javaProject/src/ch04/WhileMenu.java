package ch04;

import java.util.Scanner;

public class WhileMenu {

	public static void main(String[] args) {
		int menu=0;
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("(1) 아메리카노");
			System.out.println("(2) 카페라떼");
			System.out.println("(3) 에스프레소");
			System.out.println("원하는 메뉴(1~3)을 선택하세요.(종료:0) > ");
			String tmp=scan.next(); //문자처리
			menu=Integer.parseInt(tmp); //문자를 숫자로 변환시켜준다
			// ("1"->1로 바꿔준다 but "아메리카노"->1은 안됨)
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(menu<1 || menu>3) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue; //if문뿐만아니라 while문까지 빠져나간다
			}
			System.out.println("선택하신 메뉴는 "+menu+"번 입니다.");
		} //end while
		scan.close();

	}

}
