package ch04;

import java.util.Scanner;

public class While_HakJum_A {

	public static void main(String[] args) {
		int count=0; //증감식으로 사용할 변수
		int kor, eng, mat, tot;
		double avg;
		String grade="";
		String result="";
		Scanner scan=new Scanner(System.in);
		System.out.println("전체 성적입력이 끝나면 마지막에 -1을 입력하세요.");
		System.out.println("아무정수나 입력하세요 : ");
		int n=scan.nextInt();
		while(n != -1) {//-1이 입력되면 while문 벗어남
			System.out.println("국어 : ");
			kor=scan.nextInt();
			System.out.println("영어 : ");
			eng=scan.nextInt();
			System.out.println("수학 : ");
			mat=scan.nextInt();
			tot=kor+eng+mat;
			avg=tot/3.0;
			if(avg>=90) {
				grade="수";
			}else if(avg>=80){
				grade="우";
			}else if(avg>=70) {
				grade="미";
			}else if(avg>=60) {
				grade="양";
			}else {
				grade="가";
			}
			count++;
			result+=kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"
			+String.format("%.1f",avg)+"\t"+grade+"\n";
			System.out.println("계속하려면 아무정수나 입력하거나 마치려면 -1을 입력하세요 : ");
			n=scan.nextInt(); //-1입력용도
		} //while문
		
		System.out.println("================================================");
		System.out.println("국어/t/영어/t수학/t총점/t평균/t등급");
		System.out.println("------------------------------------------------");
		System.out.println(result);
		System.out.println("================================================");
		scan.close();
	}

}
