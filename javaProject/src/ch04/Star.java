package ch04;

public class Star {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}//inner for문
			System.out.println();
		}//outer for문
		//역삼각형
		for(int t=5; t>=1; t--) {
			for(int g=1; g<=t; g++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
