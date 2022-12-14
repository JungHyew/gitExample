package ch04;

public class Char_Tower {

	public static void main(String[] args) {
		int i, j;
		char a=65; 
		//65는 아스키코드로 'A'이다. char로 작성했으니 프로그램은 단문자로 인식해서 65가 아닌 'A'로 인식한다
		for(i=1; i<5; i++) {
			for(j=1; j<=i; j++) {
				System.out.print(a++); //character타입이지만 65에서 값이 하나씩 늘어날 수 있다 
			}
		    System.out.println();
		}

	}

}
