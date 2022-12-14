package ch05;

import java.util.Scanner;

public class ArrayScanScore {

	public static void main(String[] args) {
		int num;
		int tot=0;
		double avg=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("성적처리할 학생수를 입력하세요 >> ");
	    num=scan.nextInt();
	    int[] score=new int[num];
	    for(int i=0; i<score.length; i++) {
	    	System.out.println("성적을 입력하세요 : ");
	    	score[i]=scan.nextInt();
	    }
	    for(int i=0; i<score.length; i++) {
	    	tot+=score[i];
	    	avg=tot/score.length;
	    }
	    System.out.println("총점은 "+tot+"점 입니다.");
	    System.out.println("평균은 "+avg+"점 입니다.");
	    scan.close();
	    

	}

}
