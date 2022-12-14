package ch05;

import java.util.Scanner;

public class ArrayScore2D_Scan {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("학생수를 입력하시오 : ");
		int num=scan.nextInt();
		int score[][]=new int[num][3];
//		String grade="";
		System.out.println("국,영,수 점수를 각각 입력하세요 : ");
		for(int i=0; i<num; i++) {
			System.out.println((i+1)+"번 학생의 점수 : ");
			for(int j=0; j<num; j++) {
				score[i][j]=scan.nextInt();
			}
		}
		System.out.println("------------------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("------------------------------------------------------");
		
		for(int i=0; i<score.length; i++) {
			int sum=0;
			float avg=0.0f;
			char grade=' ';
			
			System.out.printf("%d\t",i+1);
			for(int j=0; j<score[i].length; j++) {
				sum+=score[i][j];
				System.out.printf("%d\t",score[i][j]);
			}
			avg=sum/(float)score[i].length;
			switch((int)(avg/10)) { //float을 int로 변환
			case 9 : grade='A'; break;
			case 8 : grade='B'; break;
			case 7 : grade='C'; break;
			case 6 : grade='D'; break;
			default : grade='F'; break;
			}
			
			System.out.print(sum+"\t"+String.format("%.1f", avg)+"\t"+grade+"\n");
			
			}
//			sum+=score[i][0]+score[i][1]+score[i][2];
//			avg=sum/(float)score[i].length;
//			
//			if(avg>=90) {
//				grade="A";
//			}else if(avg>=80) {
//				grade="B";
//			}else if(avg>=70) {
//				grade="C";
//			}else if(avg>=60) {
//				grade="D";
//			}else {
//				grade="F";
//			}
//
//			System.out.print((i+1)+"\t"+score[i][0]+"\t"+score[i][1]+"\t"+score[i][2]
//					+"\t"+sum+"\t"+String.format("%.1f",avg)+"\t"+grade+"\n");
//		}
		System.out.println("------------------------------------------------------");
		

	}

}
