package ch04;

import java.util.Scanner;

public class While_Point2 {

	public static void main(String[] args) {
		int count=0; //증감식으로 사용할 변수, 점수를 입력하는 횟수
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 각각 입력하고 마지막에 -1을 입력하세요.");
		int n=scan.nextInt();
		while(n != -1) { //-1이 입력되면 while문 벗어남
			sum+=n;
			count++;
			n=scan.nextInt(); //-1 입력용
		}
		if(count == 0) {
			System.out.println("입력된 수가 없습니다."); //-1을 바로 입력하면 count가 0이 된다
		}else {
			System.out.printf("총점은 %d이고 평균은 %4.1f입니다.",sum,(double)sum/count);
			//평균의 자리는 실수형인데 sum과 count는 정수이므로 실수형으로 강제형변환을 시킨다
		}
		scan.close();

	}

}
