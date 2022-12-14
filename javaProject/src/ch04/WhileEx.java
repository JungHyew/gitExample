package ch04;

public class WhileEx {

	public static void main(String[] args) {
		int i=1; //초기식
		while(i<=10) { //조건식
			System.out.println(i);
			i++; //증감식
		}
		//for문 (while문과 동일한 결과 나온다 but, while문은 무한루프 가능)
		for(int j=1; j<=10; j++) {
			System.out.println(j);
		}

	}

}
