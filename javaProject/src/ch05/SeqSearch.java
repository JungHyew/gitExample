package ch05;

import java.util.Scanner;

public class SeqSearch {

	public static void main(String[] args) {
		int s[]= {0,10,20,30,40,50,60,70,80,90,100};
		int value, index=-1; //value는 선언만, index는 -1로 초기화
		Scanner scan=new Scanner(System.in);
		System.out.println("(보기 : 0 10 20 30 40 50 60 70 80 90 100)");
		System.out.println("위 숫자중 탐색할 값을 입력하세요 : ");
		value=scan.nextInt();
		scan.close();
		for(int i=0; i<s.length; i++) {
			if(s[i]==value) { //값을 비교
				index=i; //입력한 숫자와 for문을 돌면서 순차적으로 배열인덱스에 있는 결과값과 비교해서 같으면 수행
			}
		}
		if(index<s.length && index>=0) { //true && true => true
			System.out.println(""+value+"값은 index"+index+"의 위치에 있습니다.");
		}

	}

}
