package ch04;

public class BreakEx4 {

	public static void main(String[] args) {
		int i=1;
		while(true) {
			if(i==8) break;
			System.out.println(i+" Hello World");
			i++;
		}
		System.out.println("n값이 "+i+"이며 while문 빠져나옴");

	}

}
