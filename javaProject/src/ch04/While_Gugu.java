package ch04;

import java.util.Scanner;

public class While_Gugu {

	public static void main(String[] args) {
		int i=1;
		Scanner dan=new Scanner(System.in);
		System.out.println("구구단 중에서 출력하고자 하는 단을 입력하세요 : ");
		int n=dan.nextInt();
		while(i<=9) {
				System.out.println(n+"x"+i+"="+n*i);
				i++;
		}
		dan.close();

	}

}
