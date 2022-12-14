package ch04;

import java.util.Scanner;

public class While_HakJum {

	public static void main(String[] args) {
		int kor;
		int eng;
		int mat;
		int tot;
		int i=1;
		double avg;
		String grade="";
		String result="";
		
		Scanner scan=new Scanner(System.in);
		while(i<=3) {
			System.out.print("국어 : ");
			kor=scan.nextInt();
			System.out.print("영어 : ");
			eng=scan.nextInt();
			System.out.print("수학 : ");
			mat=scan.nextInt();
			tot=kor+eng+mat;
			avg=tot/3.0;
			
			if(avg >= 90) {
				grade="수";
			}else if(avg >= 80) {
				grade="우";
			}else if(avg >= 70) {
				grade="미";
			}else if(avg >= 60) {
				grade="양";
			}else {
				grade="가";
			}
			
			i++;
			result=kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+String.format("%.1f",avg)+"\t"+grade+"\n";
		
			
		}
		System.out.println("==============================================");
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("----------------------------------------------");
		System.out.println(result);
		System.out.println("==============================================");

	}

}
