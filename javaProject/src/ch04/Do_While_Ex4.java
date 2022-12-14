package ch04;

import java.util.Scanner;

public class Do_While_Ex4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int month;
		do {
			System.out.println("올바른 월을 입력하세요 [1~12] : ");
			month=scan.nextInt();
		}while(month < 1 || month >12); //month가 1보다 작거나 12보다 큰값일때
		scan.close();
		System.out.println("사용자가 입력한 월은 "+month);

	}

}
