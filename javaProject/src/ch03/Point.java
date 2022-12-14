package ch03;

import java.util.Scanner;

//국어,영어,수학 점수를 입력받아서 총점, 평균 출력
public class Point {

	public static void main(String[] args) {
		//변수 선언
		String name;
		int kor, eng, mat, tot;
		double avg;
		//입력객체 생성
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		name = scan.next(); //문자열 입력 => next
		System.out.print("국어 점수 : ");
		kor = scan.nextInt(); //정수값 입력
		System.out.print("영어 점수 : ");
		eng = scan.nextInt();//정수값 입력
		System.out.print("수학 점수 : ");
		mat = scan.nextInt();//정수값 입력
		scan.close(); //스캐너 객체가 사용중인 메모리 정리
		
		//계산
		tot = kor + eng + mat; //총점
		avg = tot / 3.0; //avg가 double 타입이므로 3보다는 3.0으로 작성하는것이 좋다
		
		//결과 출력 // \t : 균일하게 떨어뜨려준다
		System.out.println("==================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------------");
		//일반적인 println출력(소수점 첫째 자리까지 출력된다)
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg);
		
		//printf로 출력(소수점 자리 정해서 출력할 수 있다)
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f",name,kor,eng,mat,tot,avg);
		//println인데 printf처럼 소수점 자리 정하고 싶은경우
		System.out.println();
		System.out.println(String.format("%s\t%d\t%d\t%d\t%d\t%.1f", 
				name,kor,eng,mat,tot,avg));

	}

}
