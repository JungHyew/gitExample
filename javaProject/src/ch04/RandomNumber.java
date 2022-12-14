package ch04;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Random generator=new Random(); //Random은 난수를 발생시키는 객체이다.
		Scanner scan=new Scanner(System.in);
		System.out.println("난수의 갯수 : ");
		int count=scan.nextInt();
		int sum=0;
		scan.close();
		
		for(int i=0; i<count; i++) {
			int number=generator.nextInt(100); //0~99사이의 난수를 발생시킨다
			System.out.println("생성된 난수 : "+number);
			sum+=number;
		}
		System.out.println("난수 "+count+"개의 합은 "+sum);
	}

}//Ctrl + d => 줄 삭제
