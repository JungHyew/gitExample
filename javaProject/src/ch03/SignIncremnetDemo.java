package ch03;

public class SignIncremnetDemo {

	public static void main(String[] args) {
		int plusOne = 1;
		int minusOne = -plusOne;
		System.out.println("plusOne은" + plusOne + "입니다.");
		System.out.println("minusOne은" + minusOne + "입니다.");
		
		int x= 1, y = 1;
		System.out.println("x=" + x + ", ++x = " + ++x); //++x : 전에 더한다=>결과값 증가해서 나옴
		System.out.println("x=" + x + ", y++ = " + y++); //y++ : 후에 더한다=>결과값 증가X, 그 다음 결과에 나온다
		System.out.println("x=" + x + ", y = " + y);

	}

}
