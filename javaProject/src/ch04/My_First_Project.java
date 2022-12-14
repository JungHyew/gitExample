package ch04;

import java.util.Scanner;

public class My_First_Project {

	public static void main(String[] args) {
		int menu=0;
		int num=0;
		Scanner scan=new Scanner(System.in);
		outer : 
		while(true) {
			System.out.println("(1) 한식");
			System.out.println("(2) 양식");
			System.out.println("(3) 중식");
			System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0)");
			String type=scan.next();
			menu=Integer.parseInt(type);
			if(menu==0) {
				break;
			}else if(menu<1 || menu>3) {
				System.out.println("메뉴를 잘못 선택했습니다.(종료:0)");
				continue;
			}
			if(menu==1) {
				for(;;) {
					System.out.println("(1) 김치찌개");
					System.out.println("(2) 된장찌개");
					System.out.println("(3) 삼겹살");
					System.out.println("(4) 비빔밥");
					System.out.println("한식메뉴를 선택하세요.(한식메뉴선택종료:0,전체종료:99) > ");
					type=scan.next();
					num=Integer.parseInt(type);
					if(num==0) {
						break;
					}else if(num==99) {
						break outer;
					}else if(num<1 || num>4) {
						System.out.println("한식메뉴를 잘못 선택했습니다.(종료:0)");
						continue;
					}
					switch(num) {
					case 1 :
						System.out.println("고객님은 김치찌개을 선택하셨습니다.");
						break;
					case 2 :
						System.out.println("고객님은 된장찌개를 선택하셨습니다.");
						break;
					case 3 :
						System.out.println("고객님은 삼겹살을 선택하셨습니다.");
						break;
					case 4 :
						System.out.println("고객님은 비빔밥을 선택하셨습니다.");
						break;
					}
				}
			}else if(menu==2) {
				for(;;) {
					System.out.println("(1) 돈까스");
					System.out.println("(2) 비프스테이크");
					System.out.println("(3) 카레라이스");
					System.out.println("양식메뉴를 선택하세요.(한식메뉴선택종료:0,전체종료:99) > ");
					type=scan.next();
					num=Integer.parseInt(type);
					if(num==0) {
						break;
					}else if(num==99) {
						break outer;
					}else if(num<1 || num>3) {
						System.out.println("양식메뉴를 잘못 선택했습니다.(종료:0)");
						continue;
					}
					switch(num) {
					case 1 :
						System.out.println("고객님은 돈까스를 선택하셨습니다.");
						break;
					case 2 :
						System.out.println("고객님은 비프스테이크를 선택하셨습니다.");
						break;
					case 3 :
						System.out.println("고객님은 카레라이스를 선택하셨습니다.");
						break;
					}
				}
			}else if(menu==3) {
				for(;;) {
					System.out.println("(1) 짜장면");
					System.out.println("(2) 짬뽕");
					System.out.println("(3) 탕수육");
					System.out.println("중식메뉴를 선택하세요.(한식메뉴선택종료:0,전체종료:99) > ");
					type=scan.next();
					num=Integer.parseInt(type);
					if(num==0) {
						break;
					}else if(num==99) {
						break outer;
					}else if(num<1 || num>3) {
						System.out.println("중식메뉴를 잘못 선택했습니다.(종료:0)");
						continue;
					}
					switch(num) {
					case 1 :
						System.out.println("고객님은 짜장면을 선택하셨습니다.");
						break;
					case 2 :
						System.out.println("고객님은 짬뽕을 선택하셨습니다.");
						break;
					case 3 :
						System.out.println("고객님은 탕수육을 선택하셨습니다.");
						break;
					}
				}
			}
			
		}System.out.println("프로그램을 모두 종료합니다.");

	}

}
