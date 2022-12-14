package ch04;

public class BreakEx5 {

	public static void main(String[] args) {
		int n=1;
		while(n<=10) {
			System.out.println(n+" Hello world");
			n++;
			if(n==8) {
				break; //n값이 8일때 빠져나감
			}
		}//while문
		System.out.println("n값이 8이며 while문 빠져나옴");

	}

}
