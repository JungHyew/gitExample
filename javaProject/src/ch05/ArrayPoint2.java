package ch05;

import java.util.Scanner;

public class ArrayPoint2 {

	public static void main(String[] args) {
		String[] name=new String[2];
		int[] kor=new int[2];
		int[] eng=new int[2];
		int[] mat=new int[2];
		int[] tot=new int[2];
		double[] avg=new double[2];
		double tot_avg=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("2명의 학생의 국,영,수 점수를 각각 입력하세요.");
		for(int i=0; i<name.length; i++) {
			System.out.println("이름 : ");
			name[i]=scan.next();
			System.out.println("국어 : ");
			kor[i]=scan.nextInt();
			System.out.println("영어 : ");
			eng[i]=scan.nextInt();
			System.out.println("수학 : ");
			mat[i]=scan.nextInt();
			tot[i]=kor[i]+eng[i]+mat[i];
			avg[i]=tot[i]/3.0;
			tot_avg=tot_avg+avg[i];
		}
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"
		+String.format("%4.1f", avg[i]));
		}
		System.out.println("===================================================");
		System.out.println("학습평균 : "+String.format("%4.1f",tot_avg/2));
		scan.close();
	

	}

}
