package ch04;

import java.util.Scanner;

public class ForPoint2 {

	public static void main(String[] args) {
		int kor,eng,mat,tot;
		double avg;
		char grade=' ';
		
		System.out.println("=============================");
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		
		for(int i=0; i<3; i++) {
			Scanner in=new Scanner(System.in);
			System.out.print("국어점수 : ");
			kor=in.nextInt();
			System.out.print("영어점수 : ");
			eng=in.nextInt();
			System.out.print("수학점수 : ");
			mat=in.nextInt();
			
			tot=kor+eng+mat;
			avg=tot/3.0;
			
			if(avg>=90) {
				grade='수';
			}else if(avg>=80) {
				grade='우';
			}else if(avg>=70) {
				grade='미';
			}else if(avg>=60) {
				grade='양';
			}else {
				grade='가';
			}
			System.out.printf("%d\t%d\t%d\t%d\t%.1f\t%s\n",kor,eng,mat,tot,avg,grade);
			
		}

	}

}
