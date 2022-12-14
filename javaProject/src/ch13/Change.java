package ch13;

public class Change { //값을 교환
	public static void main(String[] args) {
		int a=10; //콜라컵
		int b=20; //사이다컵
		int temp; //예비용컵
		
		temp=a; //temp에 a를 담는다(a는 값이 비게됨)
		a=b; //빈 a값에 b를 넣는다(b는 값이 비게됨)
		b=a; //빈 b값에 a를 넣는다
		
		System.out.println(a);
		System.out.println(b);
	}
	

}
