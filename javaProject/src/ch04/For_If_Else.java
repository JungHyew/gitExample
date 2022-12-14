package ch04;

public class For_If_Else {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i;
			System.out.print(i); //i는 더하는 수
			if(i<=9) {
				System.out.print("+");
			}else {
				System.out.print("=");
				System.out.print(sum);
			}//else
		}//for

	}//main

}//class
