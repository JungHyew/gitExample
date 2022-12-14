package ch04;

public class BreakEx1 {

	public static void main(String[] args) {
		int i=1;
		while(true) { //true = > 무한반복 시키겠다
			System.out.println(i++);
			if(i>10) break; //반복문을 종료시킴
		}
		System.out.println("프로그램 종료");

	}

}
